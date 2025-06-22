/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum040325;


import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author USer
 */
public class Array2DRandom
{
    public static void main(String[] args)
    {
        int M[][],N[][], b, k, i, j, b2, k2, tambah;
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Masukkan Jumlah Baris Matriks ke-1 : ");
        b = in.nextInt();
        System.out.print("Masukkan Jumlah kolom Matriks ke-1: ");
        k = in.nextInt();
        System.out.print("Masukkan Jumlah Baris Matriks ke-2 : ");
        b2 = in.nextInt();
        System.out.print("Masukkan Jumlah kolom Matriks ke-2: ");
        k2 = in.nextInt();
        M = new int[b][k];
        N = new int[b2][k2];
        
        System.out.println("==ARRAY A==");
        for(i=0; i<b; i++)
        {
            for(j=0; j<k; j++)
            {
                M[i][j] = random.nextInt(100)+1;
                System.out.print(M[i][j]+"\t");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("==ARRAY B==");
        for(i=0; i<b2; i++)
        {
            for(j=0; j<k2; j++)
            {
                N[i][j] = random.nextInt(100)+1;
                System.out.print(N[i][j]+"\t");
            }
            System.out.println();
        }
        
        if(b==b2 && k==k2)
        {
        System.out.println();
        System.out.println("==PENJUMKAHAN ARRAY==");
            for(i=0; i<b; i++)
            {
                for(j=0; j<k; j++)
                {
                    tambah = M[i][j] + N[i][j];
                    System.out.print(tambah+"\t");
                }
            System.out.println();
            }
        }
        else
        {
            System.out.println();
            System.out.println("Jumlah Data Baris Dan Kolom Berbeda, Penjumlahan Invalid");
        }
        
    }
    
}
