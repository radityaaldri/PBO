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
public class Pengulangan
{
    public static void main(String[] args)
    {
        
        int n, i;
        Scanner in = new Scanner(System.in);
        System.out.println("==Program Pengulangan==");
        System.out.print("Masukkan Jumlah Perulangan : ");
        n = in.nextInt();
        System.out.println("--Perulangan For--");
        for(i=1;i<=n;i++)
            System.out.print(i+"\t");
        
        
        System.out.println("\n--Pengulangan While--");
        i=1;
        while(i<=n)
        {
            System.out.print(i+"\t");
            i++;
        }
        
        System.out.println("\n--Pengulangan Do While--");
        i=1;
        do
        {
            System.out.print(i+"\t");
            i++;
        }while(i<=n);
    }
    
}
