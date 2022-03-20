/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import tugas3.bidang.PersegiPanjang;
import tugas3.ruang.Balok;

/**
 *
 * @author User
 */
public class GUI extends JFrame implements ActionListener {
    JLabel judul=new JLabel("Kalkulator Balok");
    
    JLabel Panjang = new JLabel("Panjang");
    final JTextField fPanjang = new JTextField(99);  
    JLabel Lebar = new JLabel("Lebar");
    final JTextField fLebar = new JTextField(99);  
    JLabel Tinggi = new JLabel("Tinggi");
    final JTextField fTinggi = new JTextField(99);
    
    JLabel Hasil = new JLabel("Hasil : ");
    JLabel LuasPersegi = new JLabel(); 
    JLabel KelilingPersegi = new JLabel();
    JLabel VolumeBalok = new JLabel();
    JLabel LuasBalok = new JLabel(); 
    
    JButton bHitung = new JButton("Hitung");
    JButton bReset = new JButton("Reset");
    
    GUI()
    { 
        setTitle("Tugas 3");
        setSize(320,320);
        setLayout(null);
        
        add(judul,"North");
        add(Panjang);
        //f=field
        add(fPanjang);
        add(Lebar);
        add(fLebar);
        add(Tinggi);
        add(fTinggi);
        add(Hasil);
        //b=button
        add(bHitung);
        add(bReset);
        
        judul.setForeground(Color.DARK_GRAY);
        Panjang.setForeground(Color.PINK);
        Lebar.setForeground(Color.PINK);
        Tinggi.setForeground(Color.PINK);
        Hasil.setForeground(Color.BLUE);
       
        fPanjang.setBackground(Color.YELLOW);
        fLebar.setBackground(Color.YELLOW);
        fTinggi.setBackground(Color.YELLOW);
        bHitung.setBackground(Color.GREEN);
        bReset.setBackground(Color.RED);
        
        judul.setBounds(120,5,100,20);
        Panjang.setBounds(20,30,200,20);
        fPanjang.setBounds(90, 30, 200, 20);
        Lebar.setBounds(20,60,150,20);
        fLebar.setBounds(90, 60, 200, 20);
        Tinggi.setBounds(20,90,150,20);
        fTinggi.setBounds(90, 90, 200, 20);
        Hasil.setBounds(50, 120, 150, 20);
        bHitung.setBounds(50, 240, 100, 30);
        bReset.setBounds(155, 240, 100, 30);
        bHitung.addActionListener(this);
        bReset.addActionListener(this);      
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == bHitung) 
        {
            
            try{
                double panjang, lebar, tinggi;
                panjang = Double.parseDouble(fPanjang.getText());
                lebar = Double.parseDouble(fLebar.getText());
                tinggi = Double.parseDouble(fTinggi.getText());
                PersegiPanjang persegi = new PersegiPanjang(panjang, lebar);
                Balok balok = new Balok(panjang, lebar, tinggi);               

                LuasPersegi.setText("Luas Persegi Panjang : " + Double.toString(persegi.luas()));
                add(LuasPersegi);
                LuasPersegi.setBounds(90, 140, 200, 20);
                LuasPersegi.setForeground(Color.MAGENTA);
                
                KelilingPersegi.setText("Keliling Persegi Panjang : " + Double.toString(persegi.keliling()));
                add(KelilingPersegi);
                KelilingPersegi.setBounds(90, 160, 200, 20);
                KelilingPersegi.setForeground(Color.MAGENTA);
                
                VolumeBalok.setText("Volume Balok : " + Double.toString(balok.volume()));
                add(VolumeBalok);
                VolumeBalok.setBounds(90, 180, 200, 20);
                VolumeBalok.setForeground(Color.BLACK);
                
                LuasBalok.setText("Luas Permukaan Balok : " + Double.toString(balok.luaspermukaan()));
                add(LuasBalok);
                LuasBalok.setBounds(90, 200, 200, 20);
                LuasBalok.setForeground(Color.BLACK);
            }
            catch(NumberFormatException ae){
                JOptionPane.showMessageDialog(null, ""+ae.getMessage());
            }
        }
        if (e.getSource() == bReset) 
        {
            fPanjang.setText(null);
            fLebar.setText(null);
            fTinggi.setText(null);
            LuasPersegi.setText(null);
            KelilingPersegi.setText(null);
            VolumeBalok.setText(null);
            LuasBalok.setText(null);
        }
    }
}
