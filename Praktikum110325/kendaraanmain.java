/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum110325;

import java.util.Scanner;

/**
 *
 * @author USer
 */
public class kendaraanmain {
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        String jenis;
        String merk;
        int tahun;
        String warna;
        int harga;
        int kec;
        
        System.out.print("Masukkan Jenis Kendaaraan : ");
        jenis=in.nextLine();
        System.out.print("Masukkan Merk Kendaaraan : ");
        merk=in.nextLine();
        System.out.print("Masukkan Warna Kendaaraan : ");
        warna=in.nextLine();
        System.out.print("Masukkan Tahun Kendaaraan : ");
        tahun=in.nextInt();
        System.out.print("Harga sewa Kendaaraan : ");
        harga=in.nextInt();
        System.out.print("Masukkan Kecepatan Kendaraan : ");
        kec=in.nextInt();
        
        //objek baru -- class kendaraan
        kendaraan kend = new kendaraan(jenis,merk,tahun,warna);
        kend.infokendaraan();
        kend.cekharga(harga);
        kend.kecepatan(kec);
        
        in.close();
    }
    
}
