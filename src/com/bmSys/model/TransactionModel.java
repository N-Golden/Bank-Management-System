package com.bmSys.model;

import java.sql.Timestamp;
import java.util.Date;

public class TransactionModel {

    private int id;
    private Timestamp ngayGd;
    private float soTien;
    private String noiDung;
    private String id_NV;
    private int loaiGD;
    private String soTK;
    private String soTK_nguoiNhan;
    private String nameTypeTrans;

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

    public void setNgayGd(Timestamp ngayGd) {
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
    
    public String getId_NV() {
        return id_NV;
    }

    public void setId_NV(String id_NV) {
        this.id_NV = id_NV;
    }

    public int getLoaiGD() {
        return loaiGD;
    }

    public void setLoaiGD(int loaiGD) {
        this.loaiGD = loaiGD;
    }

    public String getSoTK() {
        return soTK;
    }

    public void setSoTK(String soTK) {
        this.soTK = soTK;
    }

    public String getSoTK_nguoiNhan() {
        return soTK_nguoiNhan;
    }

    public void setSoTK_nguoiNhan(String soTK_nguoiNhan) {
        this.soTK_nguoiNhan = soTK_nguoiNhan;
    }

    public String getNameTypeTrans() {
        return nameTypeTrans;
    }

    public void setNameTypeTrans(String nameTypeTrans) {
        this.nameTypeTrans = nameTypeTrans;
    }



}
