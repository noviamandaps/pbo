/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

import java.util.Scanner;
import tugas2.ruang.Tabung;
import tugas2.ruang.Balok;

/**
 *
 * @author User
 */
public class Main {
    
    public static void main(String[] args) {
        int pilih, rerun;
        
        Scanner cin=new Scanner(System.in);
        do {
            System.out.println("======================");
            System.out.println("Nama : Novi Amanda PS ");
            System.out.println("NIM  : 123200065      ");
            System.out.println("======================");
            System.out.println("       Menu Utama     ");
            System.out.println("======================");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            pilih=cin.nextInt();
            switch (pilih) {
                case 1:
                    {
                        double pjg,lebar,tinggi;
                        System.out.print("Input Panjang = ");
                        pjg=cin.nextDouble();
                        System.out.print("Input Lebar = ");
                        lebar=cin.nextDouble();
                        System.out.print("Input Tinggi = ");
                        tinggi=cin.nextDouble();
                        tugas2.ruang.Balok balok=new Balok(pjg,lebar,tinggi);
                        System.out.println("========OUTPUT===========");
                        System.out.println("Luas Persegi Panjang\t = "+balok.luas());
                        System.out.println("Keliling Persegi panjang= "+balok.keliling());
                        System.out.println("Volume Balok\t = "+balok.volume());
                        System.out.println("Luas Permukaan Balok\t = "+balok.luaspermukaan());
                        break;
                    }
                case 2:
                    {
                        double jarijari,tinggi;
                        System.out.print("Jari-Jari = ");
                        jarijari=cin.nextDouble();
                        System.out.print("Tinggi = ");
                        tinggi=cin.nextDouble();
                        tugas2.ruang.Tabung tabung=new Tabung(jarijari,tinggi);
                        System.out.println("======OUTPUT=======");
                        System.out.println("Luas Lingkaran\t\t = "+tabung.luas());
                        System.out.println("Keliling Lingkaran\t = "+tabung.keliling());
                        System.out.println("Volume Tabung\t\t = "+tabung.volume());
                        System.out.println("Luas Permukaan Tabung\t = "+tabung.luaspermukaan());
                        break;
                    }
                default:
                    return;
            }
            System.out.print("Ulangi?(Ya : 1 || Tidak: 0)");
            rerun=cin.nextInt();
        } while (rerun==1);
        
        
    }
    
}
