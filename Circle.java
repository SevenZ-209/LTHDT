/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.demoapp;

/**
 *
 * @author admin
 */
public class Circle extends Ellipse {
    public Circle(double banKinh) {
        super(banKinh, banKinh);
    }

    @Override
    public String toString() {
        return String.format("Hinh Circle\nDien tich: %.1f\n", this.tinhDienTich()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
