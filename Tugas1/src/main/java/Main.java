/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        int suhu = 0,pilih;
        //float nilai;
        //membuat scanner baru
        pilih=2;
        Scanner cin=new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println(" PROGRAM KONVERSI SUHU ");
        System.out.println("-----------------------");
        Konversi kvs = null;
        do {
            switch (pilih) {
                case 1:
                    System.out.println("\nSuhu dalam Celcius : "+kvs.getCelcius()+" C ");
                    System.out.println("\nDalam kelvin       : "+kvs.getKelvin()+" K ");
                    System.out.println("\nDalam Reamur       : "+kvs.getReamur()+" R ");
                    System.out.println("\nDalam Fahrenheit   : "+kvs.getFahren()+" F ");
                    if(suhu<=0){
                        System.out.println("\n Kondisi Air Beku");
                     } else if(suhu>0 && suhu<100){
                         System.out.println("\n Kondisi Air Normal");
                     } else if(suhu>=100){
                         System.out.println("\n Kondisi Air Mendidihh");
                     }
                    break;
                case 2:
                    System.out.print("\n\nINPUT DATA\t : ");
                    System.out.print("\n Suhu\t : ");
                    suhu=cin.nextInt();
                    kvs =new Konversi(suhu);
                    break;
                default:
                    System.out.println("Opsi tidak tersedia, mohon masukkan opsi dnegan benar");
                    return;
            }
            System.out.println("\n\n\n==Opsi Data==");
            System.out.println("1. Tampilkan Hasil Konversi");
            System.out.println("2. Edit Suhu");
            System.out.println("3. Keluar");
            System.out.print("Pilih : ");
            pilih=cin.nextInt();
        } while (true);

    }
}