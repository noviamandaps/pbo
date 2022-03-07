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
public class Balok extends tugas2.bidang.PersegiPanjang implements hitungruang{
    private double tinggi;
    
    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    @Override
    public double volume() {
        return this.luas()*this.tinggi;
    }

    @Override
    public double luaspermukaan() {
        
        return 2*(this.getPanjang()*this.tinggi + this.getLebar()*this.getPanjang()+this.tinggi*this.getLebar());
    }
}
