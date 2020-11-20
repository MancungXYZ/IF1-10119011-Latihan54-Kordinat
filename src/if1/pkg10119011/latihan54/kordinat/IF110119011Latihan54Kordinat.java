/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan54.kordinat;

/**
 *
 * @author 
 *  Nama        : Reihan Wiyanda
 *  Kelas       : IF-1
 *  Nim         : 10119011
 */
public class IF110119011Latihan54Kordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WarnaKoordinat wk = new WarnaKoordinat(10, 4, "Jingga");
        System.out.println("Warna Koordinat : " + wk.getNamaWarna());
        System.out.println("Koordinat X : " + wk.getX() + " Y : " + wk.getY());
    }
    
}
