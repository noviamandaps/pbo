/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;
import perlombaan.Lombaanimasi;
import perlombaan.Lombasurat;

/**
 *
 * @author User
 */
public class Main {
    
    public static void main(String[] args) {
        String nama,asal, hasil;
        int pilih, rerun;
        
        Scanner cin=new Scanner(System.in);
        do {
            System.out.println("======================");
            System.out.println("Nama : Novi Amanda PS ");
            System.out.println("NIM  : 123200065      ");
            System.out.println("======================");
            System.out.println("       Menu Utama     ");
            System.out.println("======================");
            System.out.println("1. Lomba Animasi");
            System.out.println("2. Lomba Surat");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            pilih=cin.nextInt();
            switch (pilih) {
                case 1:
                    {
                        Scanner scansod = new Scanner(System.in);
                        System.out.print("  Form Pendaftaran  "); 
                        System.out.print("Nama \t\t: " );
                        nama = cin.nextLine();
                        System.out.print("Asal Sekolah \t\t: " );
                        asal = cin.nextLine();
                        PesertaLomba lomba=new PesertaLomba(nama, asal);
                        
                        System.out.println("==Form Penilaian==");
                        System.out.println("Nilai yang valid antara 0-100");                        
                        double alur,kreatif, konten, sinema;
                        System.out.print("Nilai Alur = ");
                        alur=cin.nextDouble();
                        System.out.print("Nilai Kreatif = ");
                        konten=cin.nextDouble();
                        System.out.print("Nilai Konten = ");
                        kreatif=cin.nextDouble();
                        System.out.print("Nilai Sinematografi = ");
                        sinema=cin.nextDouble();
                        
                        perlombaan.Lombaanimasi animasi=new Lombaanimasi(alur,kreatif, konten, sinema);
                        
                        System.out.println("     Menu      ");
                        System.out.println("1. Tampil");
                        System.out.println("2. Edit");
                        System.out.println("3. Exit");

                        System.out.print("Pilih : ");
                        pilih=cin.nextInt();
                        if(pilih==1){
                            //System.out.println("Luas Lingkaran\t\t = "+tabung.luas());
                            System.out.println("Nilai akhir"+animasi.nilaiakhir());
                            if(animasi.nilaiakhir()>85){
                                hasil="Lolos";
                            }else {
                                hasil="gagal";
                            }  
                            System.out.println("Tim " + nama + " dari " + asal + " telah " + hasil + " dalam lomba seleksi Animasi");
                        } else if(pilih==2){
                            System.out.println("   Edit data   ");
                            System.out.print("Nilai Alur = ");
                            alur=cin.nextDouble();
                            System.out.print("Nilai Kreatif = ");
                            konten=cin.nextDouble();
                            System.out.print("Nilai Konten = ");
                            kreatif=cin.nextDouble();
                            System.out.print("Nilai Sinematografi = ");
                            sinema=cin.nextDouble();
                            
                        }else {
                            
                        }
                        
                        
                        
                        break;
                    }
                case 2:
                    {
                        Scanner scansod = new Scanner(System.in);
                        System.out.print("  Form Pendaftaran  "); 
                        System.out.print("Nama \t\t: " );
                        nama = cin.nextLine();
                        System.out.print("Asal Sekolah \t\t: " );
                        asal = cin.nextLine();
                        PesertaLomba lomba=new PesertaLomba(nama, asal);
                        
                        
                        System.out.println("==Form Penilaian==");
                        System.out.println("Nilai yang valid antara 0-100");
                
                        double struktur, isi, kreatif, kaidah;
                        System.out.println("==Form Penilaian==");
                        System.out.println("Nilai yang valid antara 0-100");
                        
                        System.out.print("Nilai Struktur       = ");
                        struktur=cin.nextDouble();
                        System.out.print("Nilai Isi            = ");
                        isi=cin.nextDouble();
                        System.out.print("Nilai Kreativitas    = ");
                        kreatif=cin.nextDouble();
                        System.out.print("Nilai Kaidah Bahasa  = ");
                        kaidah=cin.nextDouble();
                        perlombaan.Lombasurat lombasurat=new Lombasurat(struktur, isi, kreatif, kaidah);
                                                System.out.println("     Menu      ");
                        System.out.println("1. Tampil");
                        System.out.println("2. Edit");
                        System.out.println("3. Exit");

                        System.out.print("Pilih : ");
                        pilih=cin.nextInt();
                        if(pilih==1){
                            //System.out.println("Luas Lingkaran\t\t = "+tabung.luas());
                            System.out.println("Nilai akhir"+lombasurat.nilaiakhir());
                            if(lombasurat.nilaiakhir()>85){
                                hasil="Lolos";
                            }else {
                                hasil="gagal";
                            }  
                            System.out.println("Tim " + nama + " dari " + asal + " telah " + hasil + " dalam lomba seleksi Animasi");
                        } else if(pilih==2){
                            System.out.print("Nilai Struktur       = ");
                            struktur=cin.nextDouble();
                            System.out.print("Nilai Isi            = ");
                            isi=cin.nextDouble();
                            System.out.print("Nilai Kreativitas    = ");
                            kreatif=cin.nextDouble();
                            System.out.print("Nilai Kaidah Bahasa  = ");
                            kaidah=cin.nextDouble();
                            
                        }else {
                            
                        }
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
        
        
 
