/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bmSys.groupChat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class UserThread extends Thread {

    private Socket s;
    private BufferedReader br;
    private BufferedWriter bw;
    private static List<UserThread> userThreads = new ArrayList<>();
    private String clientUsername;

    public UserThread(Socket s) {
        try {
            this.s = s;
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            clientUsername = br.readLine();
            userThreads.add(this);
            broadcastMessage("<html><b>SERVER:  " + clientUsername + " entered the chat</b></html>");
        } catch (IOException ex) {
            System.out.println(ex);
            closeAll(s, br, bw);
        }
    }

    @Override
    public void run() {
        String msgFromClient;
        while (s.isConnected()) {
            try {
                msgFromClient = br.readLine();
                broadcastMessage(msgFromClient);
            } catch (IOException e) {
                System.out.println(e);
                userThreads.remove(this);
                broadcastMessage("<html><b>SERVER:  " + clientUsername + " out the chat</b></html>");
                closeAll(s, br, bw);
                break;
            }
        }
    }

    void broadcastMessage(String mess) {
        for (UserThread ut : userThreads) {
            if (!ut.clientUsername.equals(this.clientUsername)) {
                try {
                    ut.bw.write(mess);
                    ut.bw.newLine();
                    ut.bw.flush();
                } catch (IOException ex) {
                    System.out.println(ex);
                    closeAll(s, br, bw);
                }
            }
        }
    }

    void closeAll(Socket s, BufferedReader br, BufferedWriter bw) {
        try {
            s.close();
            br.close();
            bw.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

}
