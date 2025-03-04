/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author admin
 */
public class DoanThang {

    private Diem d1;
    private Diem d2;

    public DoanThang(Diem d1, Diem d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    public Diem getD1() {
        return d1;
    }


    public void setD1(Diem d1) {
        this.d1 = d1;
    }

   
    public Diem getD2() {
        return d2;
    }

 
    public void setD2(Diem d2) {
        this.d2 = d2;
    }
 
    public void hienThiDoanThang()
    {
        d1.hienThi();
        System.out.print(",");
        d2.hienThi();
    }
    
    public Diem tinhTrungDiem()
    {
       double x = (d1.getHoanhDo()+d2.getHoanhDo())/2;
       double y = (d1.getTungDo() +d2.getTungDo())/2;
       
      return new Diem(x,y);
       
    }
    
    public double tinhDoDai()
    {
        return d1.tinhKhoangCach(d2);
    }
    
    public boolean isSongSong(DoanThang dt)
    {
        double v1 = (d1.getHoanhDo()-d2.getHoanhDo()) *(dt.d1.getTungDo() - dt.d2.getTungDo()) ;
        double v2 = (d1.getHoanhDo()-d2.getHoanhDo()) *(dt.d1.getTungDo() - dt.d2.getTungDo()) ;
        
        return Double.compare(v1, v2)==0;
    }
   
}
