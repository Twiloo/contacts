package fr.twiloo.iut.contacts.microservices.common;

import java.net.ServerSocket;

public class Connection implements Runnable {
    private final CallableService callableService;
    private final ServerSocket serverSocket = null;

    public Connection(CallableService callableService) {
        this.callableService = callableService;
    }

    @Override
    public void run() {

    }
}
