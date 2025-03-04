/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author admin
 */
public class PhanSo {

    public PhanSo(){
        this.Tu = 0;
        this.Mau = 1;
        
    }

    
    public PhanSo(int Tu, int Mau) {
       this.Tu = Tu;
        this.Mau = Mau;
    }
    
    /**
     * @return the Tu
     */
    public int getTu() {
        return Tu;
    }

    /**
     * @param Tu the Tu to set
     */
    public void setTu(int Tu) {
        this.Tu = Tu;
    }

    /**
     * @return the Mau
     */
    public int getMau() {
        return Mau;
    }

    /**
     * @param Mau the Mau to set
     */
    public void setMau(int Mau) {
        this.Mau = Mau;
    }
    private int Tu;
    private int Mau;
    
    public int USCLN()
    {
        int x = this.Tu;
        int y = this.Mau;
        int temp;
        while(y!=0)
        {
            temp = x% y;
            x=y;
            y=temp;
        }
        return x;
    }
    
    public PhanSo rutGon()
    {
        int ucln = this.USCLN();
        return new PhanSo(this.Tu/= ucln,this.Mau/= ucln);
    }
   
    public void hienThi()
    {
        System.out.println(this.Tu+ "/" + this.Mau);
    }
    
    public PhanSo cong(PhanSo ps2)
    {
        return new PhanSo(this.Tu*ps2.Mau+ ps2.Tu*this.Mau,this.Mau*ps2.Mau);
    }
    
        public PhanSo tru(PhanSo ps2)
    {
        return new PhanSo(this.Tu*ps2.Mau- ps2.Tu*this.Mau,this.Mau*ps2.Mau);
    }
       
            public PhanSo nhan(PhanSo ps2)
    {
        return new PhanSo(this.Tu*ps2.Tu,this.Mau*ps2.Mau);
    }
            
            public PhanSo chia(PhanSo ps2)
    {
        return new PhanSo(this.Tu*ps2.Mau,ps2.Tu*this.Mau);
}
