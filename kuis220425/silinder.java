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
public class silinder extends lingkaran
{
    private double tinggi;
    public silinder()
    {
        super();
    }
    public silinder(double r, double t)
    {
        super(r);
        this.tinggi = tinggi;
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
        double h = getTinggi();
        return Math.PI * r * r * h;
    }
    @Override
    public double getLuas()
    {
        double r = getR();
        double h = getTinggi();
        return 2 * Math.PI * r * (r + h);
    }
    @Override
    public String toString()
    {
        return "Silinder ini Memiliki Tinggi : "+tinggi+"\njari jari : "+getR()+"\nLuas : "+getLuas()+"Volume : "+getVolume();
    }
}
