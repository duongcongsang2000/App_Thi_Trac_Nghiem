/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sang2k.app_tracnghiem.entity;

import java.io.Serializable;

/**
 *
 * @author Yahiko
 */
public class BoDe implements Serializable{
    String cauHoi;
    String trinhDo;
    String noiDung;
    String a;
    String b;
    String c;
    String d;
    String dapAn;
    String Choose;
    public BoDe() {
    }

    public String getCauHoi() {
        return cauHoi;
    }

    public void setCauHoi(String cauHoi) {
        this.cauHoi = cauHoi;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getDapAn() {
        return dapAn;
    }

    public void setDapAn(String dapAn) {
        this.dapAn = dapAn;
    }
    
    public String getChoose() {
        return Choose;
    }

    public void setChoose(String Choose) {
        this.Choose = Choose;
    }
    public BoDe(String cauHoi, String trinhDo, String noiDung, String a, String b, String c, String d, String dapAn,String Choose ) {
        this.cauHoi = cauHoi;
        this.trinhDo = trinhDo;
        this.noiDung = noiDung;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.dapAn = dapAn;
        this.Choose=Choose;
    }
    
}
