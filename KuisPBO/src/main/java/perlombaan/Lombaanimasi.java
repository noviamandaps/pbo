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
public class Lombaanimasi implements hitungnilai{
    private double alur,kreatif, konten, sinema;
    public Lombaanimasi(double alur, double kreatif, double konten, double sinema) {
        this.alur = alur;
        this.kreatif = kreatif;
        this.konten = konten;
        this.sinema = sinema;
    }

    public double getAlur() {
        return alur;
    }
    public void setAlur(double alur){
        this.alur=alur;
    }
    
    public double getKonten() {
        return konten;
    }
    public void setKonten(double konten) {
        this.konten = konten;
    }
    
    public double getKreatif(){
        return kreatif;
    }
    public void setKreatif(double kreatif){
        this.kreatif=kreatif;
    }
    
    public double getSinema(){
        return sinema;
    }
    public void setSinema(double sinema){
        this.sinema=sinema;
    }

    @Override
    public double nilaiakhir() {
        return (this.getAlur()*15/100)+(this.getKonten()*35/100)+(this.getKreatif()*35/100)+(this.getSinema()*15/100);
        
    }

}

