package fr.twiloo.iut.contacts.microservices.common;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public final class ConnectedClient implements Runnable {
    private final CallableService service;
    private final Socket socket;
    private final ObjectOutputStream out;
    private ObjectInputStream in;

    public ConnectedClient(CallableService service, Socket socket) throws IOException {
        this.service = service;
        this.socket = socket;
        this.out = new ObjectOutputStream(socket.getOutputStream());
    }

    @Override
    public void run() {
        try {
            in = new ObjectInputStream(socket.getInputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        while (true) {
            Object message;
            try {
                message = in.readObject();
            } catch (IOException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            if (message == null) {
                try {
                    service.disconnectClient(this);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;

            }

            try {
                Object response = service.run();
                if (response != null)
                    out.writeObject(response);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void closeClient() throws IOException {
        in.close();
        out.close();
        socket.close();
    }
}
