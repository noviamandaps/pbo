/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perlombaan;

/**
 *
 * @author user
 */
public class Lombasurat implements hitungnilai{
    private double struktur, isi, kreatif, kaidah;

    public Lombasurat(double struktur, double isi, double kreatif, double kaidah) {
        this.struktur = struktur;
        this.isi = isi;
        this.kreatif = kreatif;
        this.kaidah = kaidah;
    }

    public double getStruktur() {
        return struktur;
    }
    
    
    public double getIsi() {
        return isi;
    }
    
    public double getKreatif(){
        return kreatif;
    }
    
    public double getKaidah(){
        return kaidah;
    }

    public double nilaiakhir() {
        return (this.isi*0.4)+(this.struktur*0.1)+(this.kreatif*0.3)+(this.kaidah*0.2);
    }
     

}
