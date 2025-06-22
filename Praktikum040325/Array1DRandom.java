/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum040325;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author USer
 */
public class Array1DRandom
{
    public static void main(String[] args)
    {
        int A[], n, i, jumlah = 0, banyak = 0, jumlahg = 0, banyakg = 0;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Masukkan Jumlah Data : ");
        n = in.nextInt();
        A = new int[n];
        System.out.println("==DATA ANDA==");
        for(i=0;i<n;i++)
        {
            A[i]=rand.nextInt(100)+1;
            System.out.print(A[i]+"\t");
        }
        System.out.println();
        
        System.out.println();
        System.out.println("==DATA ANDA YANG BERNILAI GENAP==");
        for(i=0;i<n;i++)
        {
            if(A[i]%2==0)
            {
                System.out.print(A[i]+"\t");
                banyak+= 1;
                jumlah = jumlah + A[i];
            }
        }
        System.out.println();
        System.out.println("Banyak Data Bernilai Genap : "+ banyak);
        System.out.println("Jumlah Data Bernilai Genap : "+ jumlah);
        
        System.out.println();
        System.out.println("==DATA ANDA YANG BERNILAI GANJIL==");
        for(i=0;i<n;i++)
        {
            if(A[i]%2==1)
            {
                System.out.print(A[i]+"\t");
                banyakg+= 1;
                jumlahg = jumlahg + A[i];
            }
        }
        System.out.println();
        System.out.println("Banyak Data Bernilai Ganjil : "+ banyakg);
        System.out.println("Jumlah Data Bernilai Ganjil : "+ jumlahg);
    }
    
}
