/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author admin
 */
public class Diem {

    /**
     * @return the hoanhDo
     */
    public double getHoanhDo() {
        return hoanhDo;
    }

    /**
     * @param hoanhDo the hoanhDo to set
     */
    public void setHoanhDo(double hoanhDo) {
        this.hoanhDo = hoanhDo;
    }

    /**
     * @return the tungDo
     */
    public double getTungDo() {
        return tungDo;
    }

    /**
     * @param tungDo the tungDo to set
     */
    public void setTungDo(double tungDo) {
        this.tungDo = tungDo;
    }

    private double hoanhDo;
    private double tungDo;

    public Diem(double hoanhDo, double tungDo) {
        this.hoanhDo = hoanhDo;
        this.tungDo = tungDo;
    }   
   

   
    public void hienThi()
    {
        System.out.printf("(%.1f , %.1f)", this.getHoanhDo(), this.getTungDo());
    }
  
    public double tinhKhoangCach(Diem d)
    {
        return Math.sqrt(Math.pow(this.getHoanhDo() - d.getHoanhDo(),2)+ Math.pow(this.getTungDo()- d.getTungDo(),2));
    }
}
