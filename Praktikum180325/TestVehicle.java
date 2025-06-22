/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum180325;

/**
 *
 * @author USer
 */
public class TestVehicle
{
    public static void main(String[] args)
    {
        System.out.println("Kendaraan 1. Beban Maksimal 10.000 kg");
        Vehicle kendaraan1 = new Vehicle(10000);
        
        System.out.println("Menambahkan beban 1 (500kg)");
        kendaraan1.load = kendaraan1.load + 500;
        System.out.println("Menambahkan beban 2 (250kg)");
        kendaraan1.load = kendaraan1.load + 250;
        System.out.println("Menambahkan beban 1 (5000kg)");
        kendaraan1.load = kendaraan1.load + 5000;
        System.out.println("Menambahkan beban 1 (4000kg)");
        kendaraan1.load = kendaraan1.load + 4000;
        System.out.println("Menambahkan beban 1 (350kg)");
        kendaraan1.load = kendaraan1.load + 350;
        
        System.out.println("Beban Kendaraan saat ini : "+kendaraan1.getLoad()+"kg");
        
    }
}
