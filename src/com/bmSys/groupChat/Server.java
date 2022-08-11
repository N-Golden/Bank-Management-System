    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bmSys.groupChat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Admin
 */
public class Server {

    private ServerSocket server;

    public Server(ServerSocket ss) {
        this.server = ss;
    }

    public void startServer() {
        System.out.println("Server is listening on port " + server.getLocalPort());
        while (true) {
            try {
                Socket s = server.accept();
                System.out.println("New user connected");

                UserThread newUsers = new UserThread(s);
                newUsers.start();

            } catch (IOException ex) {
                System.out.println("Error at server");
                closeServerSocket();
            }
        }
    }

    void closeServerSocket() {
        try {
            server.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(1234);
        Server server = new Server(ss);
        server.startServer();
    }
}
