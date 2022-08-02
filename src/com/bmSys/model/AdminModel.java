/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bmSys.model;

/**
 *
 * @author Integ
 */
public class AdminModel {
    private String id_quanLy;
    private String hoTen;
    private String diaChi;
    private String username;
    private String password;
    private String soDT;
    private String linkImg;
    
    public AdminModel(){
    }

    public String getId_quanLy() {
        return id_quanLy;
    }

    public void setId_quanLy(String id_quanLy) {
        this.id_quanLy = id_quanLy;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getLinkImg() {
        return linkImg;
    }

    public void setLinkImg(String linkImg) {
        this.linkImg = linkImg;
    }
    
}
