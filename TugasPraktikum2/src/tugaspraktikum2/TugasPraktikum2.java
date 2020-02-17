/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum2;

/**
 *
 * @author ASUS
 */
public class TugasPraktikum2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hewan H[] = new Hewan[3];
        H[0] = new Kambing();
        H[1] = new Sapi();
        H[2] = new Kerbau();
        for (int i = 0; i < 3; i++) {
            System.out.println("Jumlah Hewan " + i + " adalah " + H[i].gettotalhewan());
        }
        for (int i = 0; i < 3; i++) {
            H[i].naikhewan();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Jumlah Hewan " + i + " sekarang adalah "
                    + H[i].gettotalhewan());
        }
 
    }
    
}
