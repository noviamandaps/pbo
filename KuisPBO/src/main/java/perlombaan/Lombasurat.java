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
    public void setStruktur(double struktur){
        this.struktur=struktur;
    }
    
    public double getIsi() {
        return isi;
    }
    public void setIsi(double isi){
        this.isi=isi;
    }
    public double getKreatif(){
        return kreatif;
    }
    public void setKreatif(double kreatif){
        this.kreatif=kreatif;
    }
    public double getKaidah(){
        return kaidah;
    }
    public void setKaidah(double kaidah){
        this.kaidah=kaidah;
    }

    /**
     *
     * @return
     */
    @Override
    public double nilaiakhir() {
        
        return (this.getStruktur()*10/100) + (this.getIsi()*40/100)+(this.getKreatif()*3/10)+(this.getKaidah()*2/10);
    }
}

