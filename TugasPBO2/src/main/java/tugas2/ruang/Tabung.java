/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2.ruang;

/**
 *
 * @author user
 */
public class Tabung extends tugas2.bidang.Lingkaran implements hitungruang{
    private double tinggi;

    public Tabung(double jari, double tinggi) {
        super(jari);
        this.tinggi = tinggi;
    }
    
    @Override
    public double volume() {
        return this.luas()*this.tinggi;
    }

    @Override
    public double luaspermukaan() {
        return (2*this.luas())+(this.keliling()*this.tinggi);
    }
}
