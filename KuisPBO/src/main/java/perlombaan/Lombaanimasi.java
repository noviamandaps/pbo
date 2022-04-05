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
        this.konten = kreatif;
        this.sinema = sinema;
    }

    public double getAlur() {
        return alur;
    }
    
    
    public double getKonten() {
        return konten;
    }
    
    public double getKreatif(){
        return kreatif;
    }
    
    public double getSinema(){
        return sinema;
    }
    @Override
    public void nilaiakhir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
