package com.bmSys.utils;

import java.awt.Component;
import javax.swing.JOptionPane;


public class MsgBoxUtil {
    public static void alert(Component parent, String message){
        JOptionPane.showMessageDialog(parent, message);
    }
    public static boolean confirm(Component parent, String message){
        int result = JOptionPane.showConfirmDialog(parent, message);
        return result == JOptionPane.YES_OPTION;
    }
    public static String prompt(Component parent, String message){
        return JOptionPane.showInputDialog(parent,message);
    }
}
