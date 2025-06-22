/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

import Abstract.kendaraan;

/**
 *
 * @author USer
 */
public class mobil extends kendaraan
{
    private int jumlahPintu;
    private String transmisi;
    
    public mobil(String merk, int tahun, int jumlahPintu, String transmisi)
    {
        super(merk, tahun);
        this.jumlahPintu = jumlahPintu;
        this.transmisi = transmisi;
    }
    
    public int getJumlahPintu()
    {
        return jumlahPintu;
    }
    
    public void setJumlahPintu()
    {
        this.jumlahPintu = jumlahPintu;
    }
    
    public String getJumlahTransmisi()
    {
        return transmisi;
    }
    
    public void setJumlahTransmisi(String transmisi)
    {
        this.transmisi = transmisi;
    }
    
    @Override
    public void nyalakan()
    {
        System.out.println("Mobil " + merk + " dinyalakan.");
    }
    @Override
    public void matikan()
    {
        System.out.println("Mobil " + merk + " dimatikan");
    }
    @Override
    public void info()
    {
        System.out.println("Mobil " + merk + ",tahun " + tahun + "," + jumlahPintu + " pintu, Transmisi: " + transmisi);
    }
    
    @Override
    public void periksaKondisi()
    {
        System.out.println("Periksa oli, rem, dan tekanan ban mobil.");
    }
    
    @Override
    public void servis()
    {
        System.out.println("Mobil " + merk + " dijadwalkan servis setiap 10.000 Km.");
    }
}
