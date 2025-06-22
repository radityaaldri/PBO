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
public class motor extends kendaraan
{
    private String jenisHelm;
    private int cc;
    
    public motor(String merk, int tahun, String jenisHelm, int cc)
    {
        super(merk, tahun);
        this.jenisHelm = jenisHelm;
        this.cc = cc;
    }
    
    public String getJenisHelm()
    {
        return jenisHelm;
    }
    
    public void setJenisHelm(String jenisHelm)
    {
        this.jenisHelm = jenisHelm;
    }
    
    public int getCc()
    {
        return cc;
    }
    
    public void setCc()
    {
        this.cc = cc;
    }
    
    public void nyalakan()
    {
        System.out.println("Motor " + merk + " dinyalakan.");
    }
    @Override
    public void matikan()
    {
        System.out.println("Motor " + merk + " dimatikan");
    }
    @Override
    public void info()
    {
        System.out.println("Motor " + merk + ",tahun " + tahun + "," + "CC: " + cc + ", Helm: " + jenisHelm);
    }
    
    @Override
    public void periksaKondisi()
    {
        System.out.println("Periksa rantai, oli mesin, dan tekanan ban motor.");
    }
    
    @Override
    public void servis()
    {
        System.out.println("Motor " + merk + " dijadwalkan servis setiap 3.000 Km.");
    }
}
