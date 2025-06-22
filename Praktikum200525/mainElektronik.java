/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum200525;

/**
 *
 * @author USer
 */
public class mainElektronik
{
    public static void main(String[] args)
    {
        laptop laptop = new laptop();
        laptop.setMerek("ROG M1");
        laptop.setTahunProduksi(2022);
        laptop.setGaransi(2);
        laptop.setUkuranLayar(15);
        laptop.setKapasitasRAM(16);

        System.out.println("======= Laptop =======");
        System.out.println("Merek: " + laptop.getMerek());
        System.out.println("Tahun Produksi: " + laptop.getTahunProduksi());
        System.out.println("Garansi: " + laptop.getGaransi() + " tahun");
        System.out.println("Ukuran Layar: " + laptop.getUkuranLayar() + " inch");
        System.out.println("RAM: " + laptop.getKapasitasRAM() + " GB");

        smartphone hp = new smartphone();
        hp.setMerek("Samsung");
        hp.setTahunProduksi(2023);
        hp.setGaransi(1);
        hp.setKapasitasBaterai(5000);
        hp.setJumlahKamera(4);

        System.out.println("\n=== Smartphone ===");
        System.out.println("Merek: " + hp.getMerek());
        System.out.println("Tahun Produksi: " + hp.getTahunProduksi());
        System.out.println("Garansi: " + hp.getGaransi() + " tahun");
        System.out.println("Kapasitas Baterai: " + hp.getKapasitasBaterai() + " mAh");
        System.out.println("Jumlah Kamera: " + hp.getJumlahKamera());

        Gaming gamingLaptop = new Gaming();
        gamingLaptop.setMerek("MSI");
        gamingLaptop.setTahunProduksi(2024);
        gamingLaptop.setGaransi(3);
        gamingLaptop.setUkuranLayar(17);
        gamingLaptop.setKapasitasRAM(32);
        gamingLaptop.setKartuGrafis("NVIDIA RTX 4080");
        gamingLaptop.setRefreshRate(165);

        System.out.println("\n=== Gaming Laptop ===");
        System.out.println("Merek: " + gamingLaptop.getMerek());
        System.out.println("Tahun Produksi: " + gamingLaptop.getTahunProduksi());
        System.out.println("Garansi: " + gamingLaptop.getGaransi() + " tahun");
        System.out.println("Ukuran Layar: " + gamingLaptop.getUkuranLayar() + " inch");
        System.out.println("RAM: " + gamingLaptop.getKapasitasRAM() + " GB");
        System.out.println("Kartu Grafis: " + gamingLaptop.getKartuGrafis());
        System.out.println("Refresh Rate: " + gamingLaptop.getRefreshRate() + " Hz");

        smartWatch sw = new smartWatch();
        sw.setMerek("Apple");
        sw.setTahunProduksi(2023);
        sw.setGaransi(1);
        sw.setKapasitasBaterai(400);
        sw.setJumlahKamera(1);
        sw.setUkuranLayar(2);
        sw.setTahanAir(true);

        System.out.println("\n=== SmartWatch ===");
        System.out.println("Merek: " + sw.getMerek());
        System.out.println("Tahun Produksi: " + sw.getTahunProduksi());
        System.out.println("Garansi: " + sw.getGaransi() + " tahun");
        System.out.println("Baterai: " + sw.getKapasitasBaterai() + " mAh");
        System.out.println("Jumlah Kamera: " + sw.getJumlahKamera());
        System.out.println("Ukuran Layar: " + sw.getUkuranLayar() + " inch");
        System.out.println("Tahan Air: " + (sw.isTahanAir() ? "Yes" : "No"));
    }   
}
