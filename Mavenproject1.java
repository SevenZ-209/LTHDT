/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author admin
 */
public class Mavenproject1 {

    public static void main(String[] args) {
//        Diem diemTrai = new Diem(4,2);
//        Diem diemPhai = new Diem(1,7);
        
//        d1.hienThi();
//        d2.hienThi();
//        
//        double kc = d1.tinhKhoangCach(d2);
//        System.out.printf("Khoang cach: %.3f",kc);
//        
//        
//       System.out.println("\n===========\n");
//       DoanThang dt = new DoanThang(d1,d2);
//       dt.hienThiDoanThang();
//       Diem d3 = dt.tinhTrungDiem();
//       d3.hienThi();
//       
//       DoanThang dt1 = new DoanThang(new Diem(0,1), new Diem(1,0));
//       DoanThang dt2 = new DoanThang(new Diem(0,2), new Diem(2,0));
//       System.out.print(dt1.isSongSong(dt2));
//       HinhChuNhat hcn = new HinhChuNhat(diemTrai, diemPhai);
//       double dienTich = hcn.tinhDienTich();
//       System.out.println( dienTich);

        PhanSo ps1 = new PhanSo(1,4);
        PhanSo ps2 = new PhanSo(1,2);
        
     ps1.cong(ps2).rutGon().hienThi();
    }
}
