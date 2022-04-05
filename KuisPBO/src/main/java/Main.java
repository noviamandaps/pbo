/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import perlombaan.Lombasurat;
/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pilih, rerun;
        
        Scanner input = new Scanner(System.in);
        String nama, nim, jenisKelamin, alamat;
        do {
 
            System.out.println("======================");
            System.out.println("   Kategori Lomba     ");
            System.out.println("======================");
            System.out.println("1. Lomba Animasi");
            System.out.println("2. Lomba Surat");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            pilih=input.nextInt();
            switch (pilih) {
                case 1:
                    {
                        Scanner scansod = new Scanner(System.in);
                        System.out.print("  Form Pendaftaran  "); 
                        System.out.print("Nama \t\t: " );
                        nama = input.nextLine();
                        System.out.print("NIM \t\t: " );
                        nim = input.nextLine();
                        
                        double alur,kreatif, konten, sinema;
                        System.out.println("==Form Penilaian==");
                        System.out.println("Nilai yang valid antara 0-100");
                        
                        System.out.print("Nilai Alur = ");
                        alur=input.nextDouble();
                        System.out.print("Nilai Kreatif = ");
                        konten=input.nextDouble();
                        System.out.print("Nilai Konten = ");
                        kreatif=input.nextDouble();
                        System.out.print("Nilai Sinematografi = ");
                        sinema=input.nextDouble();

                    }
                case 2:
                    {
                        Scanner scansod = new Scanner(System.in);
                        System.out.print("  Form Pendaftaran  "); 
                        System.out.print("Nama \t\t: " );
                        nama = input.nextLine();
                        System.out.print("NIM \t\t: " );
                        nim = input.nextLine();
                        
                        double struktur, isi, kreatif, kaidah;
                        System.out.println("==Form Penilaian==");
                        System.out.println("Nilai yang valid antara 0-100");
                        perlombaan.Lombasurat lombasurat=new Lombasurat(struktur, isi, kreatif, kaidah);
                        System.out.print("Nilai Struktur       = ");
                        struktur=input.nextDouble();
                        System.out.print("Nilai Isi            = ");
                        isi=input.nextDouble();
                        System.out.print("Nilai Kreativitas    = ");
                        kreatif=input.nextDouble();
                        System.out.print("Nilai Kaidah Bahasa  = ");
                        kaidah=input.nextDouble();
                    }
                default:
                    return;
            }
            
            
        } while (rerun==1);
        
        
    }
    
}
