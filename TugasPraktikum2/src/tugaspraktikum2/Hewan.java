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
public class Hewan {
    double jumlah;
    private double tambah;

    Hewan() {
        jumlah = 10;
        tambah = 2;
        System.out.println("Hewan mula-mula " + jumlah + " dan ditambah " + tambah);
    }

    private double hitunghewan(double jumlah, double tambah) {
        return jumlah + tambah;
    }

    void naikhewan() {
        System.out.println("Beda hewan beda jumlah");
    }

    void settambah(double tambah) {
        this.tambah = tambah;
    }

    double gettotalhewan() {
        return hitunghewan(jumlah, tambah);
    }

}
