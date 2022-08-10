/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bmSys.groupChat;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author Admin
 */
public class ReadThread extends Thread {

    private Client client;
    private DefaultListModel dlm;
    private BufferedReader br;

    public ReadThread(Client client, DefaultListModel dlm) {
        this.client = client;
        this.dlm = dlm;
        br = client.getBufferedReader();
    }

    @Override
    public void run() {
        String msgFromGroupChat;
        while (client.getSocket().isConnected()) {
            try {
                msgFromGroupChat = br.readLine();
                dlm.addElement(msgFromGroupChat);
            } catch (IOException ex) {
                System.out.println(ex);
                closeAll(br, client.getSocket());
            }
        }
    }

    private void closeAll(BufferedReader br, Socket socket) {
        try {
            br.close();
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
