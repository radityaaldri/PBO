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
public class kerucut extends lingkaran
{
    private double tinggi;
    
    public kerucut()
    {
        super();
    }
    public kerucut(double r, double t)
    {
        super(r);
        this.tinggi = t;
    }
    public void setTinggi(double tinggi)
    {
        this.tinggi = tinggi;
    }
    public double getTinggi()
    {
        return tinggi;
    }
    public double getVolume()
    {
        double r = getR();
        return (1.0/3) * Math.PI * r * r * tinggi;
    }
    @Override
    public double getLuas()
    {
        double r = getR();
        double s = getTinggi();
        return Math.PI * r *(r + s);
    }
    @Override
    public String toString()
    {
        return "Kerucut Memiliki Tinggi : "+tinggi+"\njari jari : "+getR()+"\nLuas : "+getLuas()+"\nVolume : "+this.getVolume();
    }
}
