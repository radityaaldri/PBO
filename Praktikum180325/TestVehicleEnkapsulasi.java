/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum180325;

import java.util.Scanner;

/**
 *
 * @author USer
 */
public class TestVehicleEnkapsulasi
{
    public static void main(String[] args)
    {
        System.out.println("Kendaraan 1. Beban MAX 10.000kg");
        VehicleEnkapsulasi kendaraan1 = new VehicleEnkapsulasi(10000);
        
        System.out.println("Menambahkan beban 1 (500kg)"+kendaraan1.addLoad(500));
        System.out.println("Menambahkan beban 2 (250kg)"+kendaraan1.addLoad(250));
        System.out.println("Menambahkan beban 3 (5000kg)"+kendaraan1.addLoad(5000));
        System.out.println("Menambahkan beban 4 (4000kg)"+kendaraan1.addLoad(4000));
        System.out.println("Menambahkan beban 5 (350kg)"+kendaraan1.addLoad(350));
        System.out.println("Beban Kendaraan Saat Ini : "+kendaraan1.getLoad()+"kg");
        
        
        Scanner in = new Scanner(System.in);
        System.out.println("Kendaraan 2. Beban MAX belum ada.");
        VehicleEnkapsulasi kendaraan2 = new VehicleEnkapsulasi();
        kendaraan2.setMaxLoad(15000);
        System.out.print("Masukkan Beban MAX Kendaraan : ");
        double bebanmax = in.nextDouble();
        kendaraan2.setMaxLoad(bebanmax);
        System.out.print("Masukkan Berat Beban Yang Akan Diletakkan di kendaraan 2 : ");
        double beban = in.nextDouble();
        while(kendaraan2.addLoad(beban))
        {
            System.out.println("Beban Ditambahkan "+beban+"kg");
            System.out.print("Masukkan Berat beban yang akan diletakkan di kendaraan 2 : ");
            beban = in.nextDouble();
        }
        if(!kendaraan2.addLoad(beban))
        {
            System.out.println("Beban kendaraan saat ini :  "+kendaraan2.getLoad()+"kg");
            System.out.println("Beban akan berlebih. Penambahan beban dibatalkan!");
        }
        else
        {
            System.out.println("Beban kendaraan saat ini : "+kendaraan2.getLoad()+"kg");
        }
        
        System.out.println("Beban Kendaraan 2 Saat Ini : "+kendaraan2.getLoad()+"kg");
    }
}
