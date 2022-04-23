/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sang2k.app_tracnghiem.entity;

import java.util.Date;

/**
 *
 * @author Yahiko
 */
public class BangDiem {
    String maSV;
    String lanthi;
    Date ngayThi;
    String diem;
    String baiThi;

    public BangDiem() {
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getLanthi() {
        return lanthi;
    }

    public void setLanthi(String lanthi) {
        this.lanthi = lanthi;
    }

    public Date getNgayThi() {
        return ngayThi;
    }

    public void setNgayThi(Date ngayThi) {
        this.ngayThi = ngayThi;
    }

    public String getDiem() {
        return diem;
    }

    public void setDiem(String diem) {
        this.diem = diem;
    }

    public String getBaiThi() {
        return baiThi;
    }

    public void setBaiThi(String baiThi) {
        this.baiThi = baiThi;
    }
    
    public BangDiem(String maSV, String lanthi, Date ngayThi, String diem, String baiThi) {
        this.maSV = maSV;
        this.lanthi = lanthi;
        this.ngayThi = ngayThi;
        this.diem = diem;
        this.baiThi = baiThi;
    }
    
}
