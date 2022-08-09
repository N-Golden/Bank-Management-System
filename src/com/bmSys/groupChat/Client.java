package com.bmSys.groupChat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class Client {

    private Socket socket;
    private BufferedReader br;
    private BufferedWriter bw;
    private String username;

    public Client(Socket s, String username) {
        try {
            this.socket = s;
            this.username = username;
            System.out.println("Connect to server");
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        } catch (IOException ex) {
            System.out.println("error Client");
            System.out.println(ex);
            closeAll(s, br, bw);
        }
    }

    public synchronized  void sendMess(Boolean isClick, JTextField textSend) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    bw.write(username);
                    bw.newLine();
                    bw.flush();

                    while (socket.isConnected()) {
                        wait();
                        if (isClick == true) {
                            String msgClient = textSend.getText();
                            bw.write(username + ": " + msgClient);
                            bw.newLine();
                            bw.flush();
                        }
                    }
                } catch (IOException e) {
                    System.out.println("Error Client");
                    System.out.println(e);
                    closeAll(socket, br, bw);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
    }

    public void listenMessServer(DefaultListModel dlm) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                String msgFromGroupChat;
                while (socket.isConnected()) {
                    try {
                        msgFromGroupChat = br.readLine();
                        dlm.addElement(msgFromGroupChat);
                    } catch (IOException ex) {
                        System.out.println("Error Client");
                        System.out.println(ex);
                        closeAll(socket, br, bw);
                    }
                }
            }
        }).start();
    }

    void closeAll(Socket s, BufferedReader br, BufferedWriter bw) {
        try {
            s.close();
            br.close();
            bw.close();
        } catch (IOException ex) {

        }
    }

}
