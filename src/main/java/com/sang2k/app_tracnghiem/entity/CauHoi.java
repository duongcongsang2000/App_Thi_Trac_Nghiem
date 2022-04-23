/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sang2k.app_tracnghiem.entity;

/**
 *
 * @author Admin
 */
public class CauHoi {
    public String ch;
    public String a;
    public String b;
    public String c;
    public String d;

    public String getCh() {
        return ch;
    }

    public void setCh(String ch) {
        this.ch = ch;
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
    
    public CauHoi(String ch, String a, String b, String c, String d) {
        this.ch = ch;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public CauHoi() {
    }
    
}
