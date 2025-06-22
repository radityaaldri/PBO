/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTSPBO;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Kendaraan1Main {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Kendaraan1 kendaraan = new Kendaraan1();
        System.out.println("UTS M. RADITYA ALDRI");
        System.out.println("NIM : 2401081008");
        System.out.println("Kode Soal : B");

        System.out.print("Masukkan jumlah roda kendaraan: ");
        kendaraan.setJmlRoda(scanner.nextInt());
        scanner.nextLine(); 
        System.out.print("Masukkan warna kendaraan: ");
        kendaraan.setWarna(scanner.nextLine());

        
        Sepeda sepeda = new Sepeda();
        System.out.print("Masukkan jumlah sadel sepeda: ");
        sepeda.setJmlSadel(scanner.nextInt());
        System.out.print("Masukkan jumlah gir sepeda: ");
        sepeda.setJmlGir(scanner.nextInt());

       
        SepedaListrik sepedaListrik = new SepedaListrik();
        System.out.print("Masukkan kecepatan maksimum sepeda listrik: ");
        sepedaListrik.setKecepatanMaks(scanner.nextInt());
        System.out.print("Masukkan jarak tempuh sepeda listrik: ");
        sepedaListrik.setJarakTempuh(scanner.nextInt());

       
        Mobil mobil = new Mobil();
        scanner.nextLine(); 
        System.out.print("Masukkan jenis bahan bakar mobil: ");
        mobil.setBahanBakar(scanner.nextLine());
        System.out.print("Masukkan kapasitas mesin mobil: ");
        mobil.setKapasitasMesin(scanner.nextInt());

        
        Truk truk = new Truk();
        System.out.print("Masukkan muatan maksimum truk (kg): ");
        truk.setMuatanMaks(scanner.nextInt());

        
        Taksi taksi = new Taksi();
        System.out.print("Masukkan tarif awal taksi: ");
        taksi.setTarifAwal(scanner.nextInt());
        System.out.print("Masukkan tarif per km taksi: ");
        taksi.setTarifPerKm(scanner.nextInt());

        
        System.out.println("\n--- Data Kendaraan ---");
        System.out.println("Jumlah Roda: " + kendaraan.getJmlRoda());
        System.out.println("Warna: " + kendaraan.getWarna());

        System.out.println("\n--- Data Sepeda ---");
        System.out.println("Jumlah Sadel: " + sepeda.getJmlSadel());
        System.out.println("Jumlah Gir: " + sepeda.getJmlGir());

        System.out.println("\n--- Data Sepeda Listrik ---");
        System.out.println("Kecepatan Maksimum: " + sepedaListrik.getKecepatanMaks() + " km/jam");
        System.out.println("Jarak Tempuh: " + sepedaListrik.getJarakTempuh() + " km");

        System.out.println("\n--- Data Mobil ---");
        System.out.println("Bahan Bakar: " + mobil.getBahanBakar());
        System.out.println("Kapasitas Mesin: " + mobil.getKapasitasMesin() + " cc");

        System.out.println("\n--- Data Truk ---");
        System.out.println("Muatan Maksimum: " + truk.getMuatanMaks() + " kg");

        System.out.println("\n--- Data Taksi ---");
        System.out.println("Tarif Awal: Rp " + taksi.getTarifAwal());
        System.out.println("Tarif per Km: Rp " + taksi.getTarifPerKm());

        scanner.close();
    }
}
 
    
    
  

