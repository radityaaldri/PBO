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
public class Aksimobil
{
    public static void main(String[] args)
    {
    mobil mobilku = new mobil();
    mobil mobilkudua = new mobil();
    mobilku.merek="Toyota";
    mobilku.plat="BA 1234 L";
    mobilku.tahun=2004;
    mobilku.warna="Hitam";
    System.out.println("---------------------");
    System.out.println("DATA MOBIL 1");
    System.out.println("Merk Mobil : " +mobilku.merek);
    System.out.println("Plat Mobil : " +mobilku.plat);
    System.out.println("Tahun Keluaran : " +mobilku.tahun);
    System.out.println("Warna : " +mobilku.warna);
    
    
    mobilkudua.merek="Avanza";
    mobilkudua.plat="BA 0000 L";
    mobilkudua.tahun=2005;
    mobilkudua.warna="Putih";
    System.out.println("---------------------");
    System.out.println("DATA MOBIL 2");
    System.out.println("Merk Mobil : " +mobilkudua.merek);
    System.out.println("Plat Mobil : " +mobilkudua.plat);
    System.out.println("Tahun Keluaran : " +mobilkudua.tahun);
    System.out.println("Warna : " +mobilkudua.warna);
    
    System.out.println(mobilku.suaramobil());
    mobilku.mobilaktif();
    }
}
