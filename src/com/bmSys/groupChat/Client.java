package com.bmSys.groupChat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 *
 * @author Admin
 */
public class Client {

    private Socket socket;
    private String username;
    private BufferedWriter bw;
    private BufferedReader br;

    public Client(Socket s, String username) {
        this.socket = s;
        this.username = username;
        System.out.println("Connect to server");
        try {
            bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            bw.write(username);
            bw.newLine();
            bw.flush();
        } catch (IOException ex) {
            System.out.println("error");
            System.out.println(ex);
        }

    }

    public String getUserName() {
        return this.username;
    }

    public Socket getSocket() {
        return socket;
    }

    public BufferedReader getBufferedReader() {
        return br;
    }

    public BufferedWriter getBufferedWriter() {
        return bw;
    }

}
