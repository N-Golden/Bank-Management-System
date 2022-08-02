package com.bmSys.model;

public class AccountModel {

    private String soTK;
    private float soDuTK;
    private String loaiTK;
    private String id_KH;
    private String tenKH;
    private String email;

    public AccountModel() {
    }

    public String getSoTK() {
        return soTK;
    }

    public void setSoTK(String soTK) {
        this.soTK = soTK;
    }

    public float getSoDuTK() {
        return soDuTK;
    }

    public void setSoDuTK(float soDuTK) {
        this.soDuTK = soDuTK;
    }

    public String getLoaiTK() {
        return loaiTK;
    }

    public void setLoaiTK(String loaiTK) {
        this.loaiTK = loaiTK;
    }

    public String getId_KH() {
        return id_KH;
    }

    public void setId_KH(String id_KH) {
        this.id_KH = id_KH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
