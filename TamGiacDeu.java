/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.demoapp;

/**
 *
 * @author admin
 */
public class TamGiacDeu extends TamGiacCan {
    public TamGiacDeu(double abc) {
        super(abc, abc);
    }
    
    @Override
    public String toString() {
        return String.format("Tam giac deu\nDien tich: %.1f\n", this.tinhDienTich()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
