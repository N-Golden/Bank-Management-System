package com.bmSys.model;

import java.util.Date;

public class TransactionModel {

    private int id;
    private Date ngayGd;
    private float soTien;
    private String noiDung;

    public TransactionModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getNgayGd() {
        return ngayGd;
    }

    public void setNgayGd(Date ngayGd) {
        this.ngayGd = ngayGd;
    }

    public float getSoTien() {
        return soTien;
    }

    public void setSoTien(float soTien) {
        this.soTien = soTien;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

}
