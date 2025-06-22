/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum080425;

import java.util.Scanner;

/**
 *
 * @author USer
 */
public class testbank
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Nasabah nasabah1 = new Nasabah("Raditya 1", "Raditya 2");
        Tabungan tabungan1 = new Tabungan(10000);
        nasabah1.setTabungan(tabungan1);

        Nasabah nasabah2 = new Nasabah("Raditya 2", "Raditya 1");
        Tabungan tabungan2 = new Tabungan(5000);
        nasabah2.setTabungan(tabungan2);

        System.out.println("Informasi nasabah dan saldo");
        System.out.println("===============================");
        System.out.println(nasabah1);
        System.out.println(nasabah2);
        System.out.println();

        System.out.println("=== Menabung ===");
        System.out.print("Masukkan jumlah uang yang ingin ditabung oleh Raditya : ");
        int simpan1 = in.nextInt();
        tabungan1.simpanUang(simpan1);
        System.out.println("Saldo Raditya setelah menabung: " + tabungan1.getSaldo());

        System.out.print("Masukkan jumlah uang yang ingin ditabung oleh Aldri : ");
        int simpan2 = in.nextInt();
        tabungan2.simpanUang(simpan2);
        System.out.println("Saldo Aldri setelah menabung: " + tabungan2.getSaldo());

        System.out.println("\n=== Penarikan ===");
        System.out.print("Masukkan jumlah uang yang ingin diambil oleh Raditya : ");
        int ambil1 = in.nextInt();
        tabungan1.ambilUang(ambil1);
        System.out.println("Saldo Raditya setelah penarikan: " + tabungan1.getSaldo());

        System.out.print("Masukkan jumlah uang yang ingin diambil oleh Aldri : ");
        int ambil2 = in.nextInt();
        tabungan2.ambilUang(ambil2);
        System.out.println("Saldo Aldri setelah penarikan: " + tabungan2.getSaldo());

        System.out.println("\n=== Transfer ===");
        System.out.print("Masukkan jumlah uang yang ingin ditransfer dari Aldri ke Raditya : ");
        int transfer = in.nextInt();
        tabungan2.transfer(tabungan1, transfer);
        System.out.println("Saldo Raditya : " + tabungan1.getSaldo());
        System.out.println("Saldo Aldri: " + tabungan2.getSaldo());

        in.close();
    }
}



//M. RADITYA ALDRI
//TEKKOM 1B