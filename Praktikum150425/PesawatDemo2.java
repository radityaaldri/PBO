/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum150425;

/**
 *
 * @author USer
 */
public class PesawatDemo2
{
    public static void main(String[] args)
    {
        Pesawat[] daftarPesawat = new Pesawat[3];
        
        daftarPesawat[0] = new Pesawat("Lion Air",2015,true,80);
        daftarPesawat[0] = new Pesawat("Air Asia",2018,false,120);
        daftarPesawat[0] = new Pesawat("Garuda",2020,true,180);
        
        for(int i=0; i<daftarPesawat.length;i++)
        {
            System.out.println("Data Pesawat ke "+(i+1)+"Adalah : ");
            daftarPesawat[i].cetak();
            System.out.println();
        }
    }
}
