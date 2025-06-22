/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum040325;

import java.util.Scanner;

/**
 *
 * @author USer
 */
public class PolaBintang1
{
    public static void main(String[] args)
    {
        int a = 0, b, k, i, j;
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Baris Matriks : ");
        b = in.nextInt();
        System.out.print("Masukkan Jumlah kolom Matriks : ");
        k = in.nextInt();
       
        
        for(i=0; i<b; i++)
        {
            for(j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println();
        for(i=b; i>0; i--)
        {
            for(j=i; j>0; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println();
        for(i=0; i<b; i++)
        {
            for(j=0; j<k; j++)
            {
                a++;
                System.out.print(a +"\t");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println();
        for(i=0; i<b; i++)
        {
            for(j=0; j<k; j++)
            {
                System.out.print(a +"\t");
                a--;
            }
            System.out.println();
        }
    }
}
