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
public class Mobil extends Kendaraan1{
    String bhnbakar;
    int kptsmesin;

    public void setBahanBakar(String bhnbakar) {
        this.bhnbakar = bhnbakar;
    }

    public String getBahanBakar() {
        return bhnbakar;
    }

    public void setKapasitasMesin(int kptsmesin) {
        this.kptsmesin = kptsmesin;
    }

    public int getKapasitasMesin() {
        return kptsmesin;
    }
}
