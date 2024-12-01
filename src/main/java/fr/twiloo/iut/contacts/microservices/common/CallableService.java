package fr.twiloo.iut.contacts.microservices.common;

import java.io.IOException;

abstract public class CallableService {
    protected int port;

    public CallableService(int port) {
        this.port = port;
    }

    abstract Object run() throws Exception;
    abstract void disconnectClient(ConnectedClient client) throws IOException;

    public int getPort() {
        return port;
    }

}
