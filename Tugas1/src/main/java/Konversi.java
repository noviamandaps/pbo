/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Konversi
{
    private int suhu;
    public float nilai, c, k, r , f;
    public Konversi(int suhu)
    {
        this.k= (float) (suhu + 273.15);
        this.r= (4 * suhu)/5;
        this.f=(9 * suhu)/5 + 32;
        this.c=suhu;
   

    };   
    public float getKelvin(){
        return this.k;
    }
    public float getReamur(){
        return this.r;
    }
    public float getFahren(){
        return this.f;

    }
    public float getCelcius(){
        return this.c;
    }

}