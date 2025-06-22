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
public class TestPersegiPanjang
{
    public static void main(String[] args)
    {
        System.out.println("banyak objek awal\t : "+PersegiPanjang.getJumlahObjek());
        PersegiPanjang PP1 = new PersegiPanjang();
        PP1.panjang = 5;
        PP1.lebar = 3;
        System.out.println("banyak objek saat ini\t : "+PersegiPanjang.getJumlahObjek());
        System.out.println("Luas\t\t\t : "+PP1.panjang+" * "+PP1.lebar+" = "+PP1.getLuas());
    
        PersegiPanjang PP2 = new PersegiPanjang(15,4);
        System.out.println("banyak objek saat ini\t : "+PersegiPanjang.getJumlahObjek());
        System.out.println("Keliling\t\t : 2 *("+PP2.panjang+" + "+PP2.lebar+") = "+PP2.getKeliling());
    }
}
