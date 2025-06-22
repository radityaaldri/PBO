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
public class SepedaListrik extends Sepeda{
    int kecepatanMaks;
    int jarakTempuh;

    public void setKecepatanMaks(int kecepatanMaks) {
        this.kecepatanMaks = kecepatanMaks;
    }

    public void setJarakTempuh(int jarakTempuh) {
        this.jarakTempuh = jarakTempuh;
    }

    public int getJarakTempuh() {
        return jarakTempuh;
    }

    public int getKecepatanMaks() {
        return kecepatanMaks;
    }
}


