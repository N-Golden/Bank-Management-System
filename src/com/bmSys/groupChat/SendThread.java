/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bmSys.groupChat;

import java.io.BufferedWriter;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class SendThread extends Thread {

    private Client client;
    private BufferedWriter bw;
    private JTextField textSend;
    private DefaultListModel dlm;

    public SendThread(Client client, JTextField textSend, DefaultListModel dlm) {
        this.client = client;
        this.textSend = textSend;
        this.dlm = dlm;
        bw = client.getBufferedWriter();
    }

    @Override
    public void run() {
        try {
            String msgClient = textSend.getText();
            bw.write(client.getUserName() + ":  " + msgClient);
            bw.newLine();
            bw.flush();
            dlm.addElement("<html><u>Me:  "+msgClient+"</u></html");
            textSend.setText("");
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
    }

}
