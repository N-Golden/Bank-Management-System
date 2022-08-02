/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bmSys.utils;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class Validator {

    public static boolean checkEmpty(JTextField tf) {
        String field = tf.getText();
        if (field.trim().isEmpty()) {
            //JOptionPane.showMessageDialog(null, tb);
            tf.setBackground(Color.yellow);
            tf.grabFocus();
            return true;
        }
        tf.setBackground(Color.white);
        return false;
    }

    public static boolean checkEmptyArea(JTextArea tf) {
        String field = tf.getText();
        if (field.trim().isEmpty()) {
            //JOptionPane.showMessageDialog(null, tb);
            tf.setBackground(Color.yellow);
            tf.grabFocus();
            return true;
        }
        tf.setBackground(Color.white);
        return false;
    }

    public static boolean checkID(JTextField tf) {
        String field = tf.getText();
        String pattern = "[A-Za-z]{2}[0-9]{5}";
        if (!field.matches(pattern)) {
            //JOptionPane.showMessageDialog(null, tb);
            tf.setBackground(Color.yellow);
            tf.grabFocus();
            return true;
        }
        tf.setBackground(Color.white);
        return false;
    }

    public static void parseEmail(String email) throws Exception {
        String regex = "\\w+@\\w+(\\.\\w+){1,2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (!matcher.matches()) {
            throw new Exception();
        }
    }

    public static void parsePhone(String phone) throws Exception {
        String regex = "^\\d{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);
        if (!matcher.matches()) {
            throw new Exception();
        }
    }

    public static boolean checkEmail(JTextField tf) {
        String email = tf.getText();
        try {
            Validator.parseEmail(email);
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, tb);
            tf.setBackground(Color.yellow);
            tf.grabFocus();
            return true;
        }
        tf.setBackground(Color.white);
        return false;
    }

    public static boolean checkPhone(JTextField tf) {
        String phone = tf.getText();
        try {
            Validator.parsePhone(phone);
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, tb);
            tf.setBackground(Color.yellow);
            tf.grabFocus();
            return true;
        }
        tf.setBackground(Color.white);
        return false;
    }

    public static boolean checkDate(JDateChooser jdc) {
        if (((JTextField) jdc.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jdc.setBackground(Color.yellow);
            jdc.grabFocus();
            return true;
        } 
        jdc.setBackground(Color.white);
        return false;
    }

public static boolean checkMoney(JTextField tf) {
        try {
            double balance = Double.parseDouble(tf.getText());
            if (balance <= 0) {
                throw new Exception();
            }
        } catch (NumberFormatException e) {
            //MsgBoxUtil.alert(null, "Number must be numeric");
            tf.setBackground(Color.yellow);
            tf.grabFocus();
            return true;
        } catch (Exception e) {
            //MsgBoxUtil.alert(null, "Number must greater than 0");
            tf.setBackground(Color.yellow);
            tf.grabFocus();
            return true;
        }
        tf.setBackground(Color.white);
        return false;
    }
}
