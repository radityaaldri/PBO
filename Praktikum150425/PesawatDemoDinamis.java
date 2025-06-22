/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum150425;

import java.util.Scanner;

/**
 *
 * @author USer
 */

public class PesawatDemoDinamis
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int jumlah, i, muatan, tahunProduksi;
        String nama, namaMax;
        boolean mesin;
        System.out.print("Masukkan Jumlah Pesawat : ");
        jumlah = input.nextInt();
        input.nextLine();
        
        Pesawat[] daftarPesawat = new Pesawat[jumlah];
        
        for(i=0;i<jumlah;i++)
        {
            System.out.println("Input pesawat ke "+(i+1));
            System.out.print("Nama Pesawat : ");
            nama = input.nextLine();
            
            System.out.print("Tahun Prooduksi : ");
            tahunProduksi = input.nextInt();
            
            System.out.print("Menggunakan Mesin ? (true / false) :");
            mesin = input.nextBoolean();
            
            System.out.print("Jumlah Muatan : ");
            muatan = input.nextInt();
            
            input.nextLine();
            
            daftarPesawat[i]=new Pesawat(nama,tahunProduksi,mesin,muatan);
        }
        System.out.println();
        System.out.println("==DATA PESAWAT==");
        
        System.out.println("Data Pesawat ke 1 adalah");
        daftarPesawat[0].cetak();
        System.out.println();
        int besar = daftarPesawat[0].getMuatan();
        namaMax = daftarPesawat[0].getNama();
        for(i=0;i<jumlah;i++)
        {
            System.out.println("Data Pesawat ke "+(i+1)+ " adalah");
            daftarPesawat[i].cetak();
            if(daftarPesawat[i].getMuatan()>besar)
            {
                besar = daftarPesawat[i].getMuatan();
                namaMax=daftarPesawat[i].getNama();
            }
            System.out.println();
        }
        System.out.println("Pesawat dengan muatan terbanyak adalah : "+namaMax);
        System.out.println("dengan kapasitas maksimum  : "+besar+ " orang");
        
        
    }
}
