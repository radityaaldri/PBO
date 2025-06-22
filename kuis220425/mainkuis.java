/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis220425;

/**
 *
 * @author USer
 */
import java.util.Scanner;
public class mainkuis
{
    public static void main(String[] args)
    {
        double r, t;
        int pilih;
        
        Scanner scanner = new Scanner(System.in);
        
        
        
        
        System.out.print("Hitung Bangun : ");
        System.out.print("\n1. LINGKARAN ");
        System.out.print("\n2. KERUCUT ");
        System.out.print("\n3. SILINDER ");
        System.out.print("\nSilahkan Pilih Bangun yang Ingin di Hitung : ");
        pilih = scanner.nextInt();
        
        switch(pilih){
            case 1: 
            {
                
                System.out.print("Masukkan Jari-Jari: ");
                r = scanner.nextDouble();
                lingkaran li = new lingkaran(r);
                System.out.println(li.toString());
            }break;
            case 2: 
            {
                
                System.out.print("Masukkan Jari-Jari : ");
                r = scanner.nextDouble();
                System.out.print("Masukkan Tinggi : ");
                t = scanner.nextDouble();
                kerucut ker = new kerucut(r,t);
                System.out.println(ker.toString());
            }break;
            
                case 3: 
            {
                
                System.out.print("Masukkan Jari-Jari : ");
                r = scanner.nextDouble();
                System.out.print("Masukkan Tinggi : ");
                t = scanner.nextDouble();
                silinder sil = new silinder(r,t);
                System.out.println(sil.toString());
            }break;
             }
    
    
    }
}
