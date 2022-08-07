/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bmSys.utils;

import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

/**
 *
 * @author HT
 */
public class PasswordUtil {
    static boolean isHidePass = false;
    
    public static void showPass(JPasswordField pwf, JLabel lbl) {
        File f = new File("");
        String path = "\\src\\com\\bmSys\\icon\\";
        if (isHidePass) {
            pwf.setEchoChar((char) 0);
            lbl.setIcon(new ImageIcon(f.getAbsolutePath() + path + "showpass24.png"));
            isHidePass = false;
        } else {
            pwf.setEchoChar('*');
            lbl.setIcon(new ImageIcon(f.getAbsolutePath() + path + "hidepass24.png"));
            isHidePass = true;
        }
    }
    
    public static String getRand(int n){
        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"; 
        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);  
        for (int i = 0; i < n; i++) {  
            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index = (int)(AlphaNumericString.length() * Math.random());  
            // add Character one by one in end of sb
            sb.append(AlphaNumericString.charAt(index));
        }  
        return sb.toString();
    }
}
