/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum110325;

/**
 *
 * @author USer
 */
public class kendaraan
{
    String jenis;
    String merk;
    int tahun;
    String warna;
    
    //constructor
    public kendaraan(String j,String m,int t,String w)
    {
        this.jenis=j;
        this.merk=m;
        this.tahun=t;
        this.warna=w;
    }
    
    //method tanpa parameter
    public void infokendaraan()
    {
        System.out.println("----------------------------");
        System.out.println("DATA KENDARAAN ANDA");
        System.out.println("----------------------------");
        System.out.println("Jenis Kendaraan" +jenis);
        System.out.println("Merk Kendaraan" +merk);
        System.out.println("Tahun Kendaraan" +tahun);
        System.out.println("Warna Kendaraan" +warna);
    }
    
    //method dengan parameter
    public void cekharga(int harga)
    {
        System.out.println("Harga Sewa Kendaraan : Rp." +harga);
    }
    
    public void kecepatan(int kec)
    {
        if(kec>=20 && kec<=40){
            System.out.print("SLOW CAR");
        }
        else if(kec>=41 && kec<=60){
            System.out.print("MEDIUM CAR");
        }
        else if(kec>=61 && kec<=85){
            System.out.print("FAST CAR");
        }
        else if(kec>85){
            System.out.print("RACING CAR");
        }
        else {
            System.out.print("KENDARAAN ANDA TIDAK LAYAK PAKAI");
        }
        System.out.println();
    }
}
