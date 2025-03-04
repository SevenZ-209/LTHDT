/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author admin
 */
public class HinhChuNhat {

    public HinhChuNhat(Diem diemTrai, Diem diemPhai) {
        this.diemTrai = diemTrai;
        this.diemPhai = diemPhai;
    }

    /**
     * @return the diemTrai
     */
    public Diem getDiemTrai() {
        return diemTrai;
    }

    /**
     * @param diemTrai the diemTrai to set
     */
    public void setDiemTrai(Diem diemTrai) {
        this.diemTrai = diemTrai;
    }

    /**
     * @return the diemPhai
     */
    public Diem getDiemPhai() {
        return diemPhai;
    }

    /**
     * @param diemPhai the diemPhai to set
     */
    public void setDiemPhai(Diem diemPhai) {
        this.diemPhai = diemPhai;
    }
    private Diem diemTrai;
    private Diem diemPhai;
    
 
    
    public double tinhDienTich()
    {
        Diem d3= new Diem(diemTrai.getHoanhDo(),diemPhai.getTungDo());
        double dai = d3.tinhKhoangCach(diemPhai);
        double rong = diemTrai.tinhKhoangCach(d3);
        return dai*rong;
    }
}
