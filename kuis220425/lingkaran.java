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
public class lingkaran
{
    private double r;    
    
    public lingkaran()
            {
                
            }
    public lingkaran(double r)
    {
        this.r = r;
    }
    public void setR(double r)
    {
        this.r = r;
    }
    public double getR()
    {
        return r;
    }
    public double getDiameter()
    {
        return 2 * r;
    }
    public double getKeliling()
    {
        return 2 * Math.PI * r;
    }
    public double getLuas()
    {
        return Math.PI * r * r;
    }
    @Override
    public String toString()
    {
        return "Lingkaran memiliki jari jari : "+r+"\nLuas : "+getLuas()+"\nKeliling : "+getKeliling();
        
    }
}
