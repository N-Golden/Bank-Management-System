/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bmSys.utils;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author HT
 */
public class GuiUtil {
    
    public static void tableDesign(JTable tbl) {
        DefaultTableCellRenderer head_render = new DefaultTableCellRenderer();
        head_render.setPreferredSize(new Dimension(30, 40));
        head_render.setBackground(new Color(32, 136, 203));
        head_render.setForeground(new Color(255, 255, 255));
        head_render.setFont(new Font("Segoe UI", Font.BOLD, 14));
        //do rong cac cot
//        setColumnWidths(tbl,30, 150, 100, 100);
        tbl.getTableHeader().setDefaultRenderer(head_render);
        tbl.setRowHeight(35);
        tbl.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        tbl.setBackground(Color.white);
    }

    public static void setColorMenuItem(JLabel... arrLbl) {
        // set color button
        for (JLabel lbl : arrLbl) {
            lbl.setBackground(new Color(255, 255, 255));;
            lbl.setForeground(Color.black);
        }
    }

    public static void hoverMenu(JLabel lbl) {
        //setColorMenuItem();
        // set color button
        lbl.setBackground(new Color(51, 153, 255));
        lbl.setForeground(Color.white);

    }
}
