/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author USer
 */
public class mainkendaraan
{
    public static void main(String[] args)
    {
        mobil mobil = new mobil("Toyota Avanza", 2022, 4, "Automatic");
        motor motor = new motor("Yamaha NMAX", 2023, "Full Face", 155);
        
        mobil.nyalakan();
        mobil.info();
        mobil.periksaKondisi();
        mobil.servis();
        mobil.matikan();
        
        System.out.println();
        
        motor.nyalakan();
        motor.info();
        motor.periksaKondisi();
        motor.servis();
        motor.matikan();
        
    }
}
