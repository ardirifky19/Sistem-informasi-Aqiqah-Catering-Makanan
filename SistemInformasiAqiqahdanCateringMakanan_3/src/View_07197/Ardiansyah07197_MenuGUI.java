/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View_07197;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ardiansyah07197_MenuGUI {

    JFrame Menu = new JFrame();
    JButton Daftar, LihatData;
    JLabel labelcovmenu;

    public Ardiansyah07197_MenuGUI() {
        Menu.setSize(700, 600);
        Menu.setLayout(null);
        Menu.getContentPane().setBackground(Color.CYAN);
        labelcovmenu = new JLabel(" Menu ");
        labelcovmenu.setBounds(280, 100, 460, 40);
        labelcovmenu.setFont(new Font("Times New Roman", Font.BOLD, 40));
        Menu.add(labelcovmenu);

        Menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Menu.setVisible(true);
        Menu.setLocationRelativeTo(null);

        Daftar = new JButton("Daftar");
        Daftar.setBounds(280, 170, 120, 40);
        Daftar.setBackground(Color.GREEN);
        Menu.add(Daftar);

        LihatData = new JButton("Lihat Data");
        LihatData.setBounds(280, 230, 120, 40);
        LihatData.setBackground(Color.GREEN);
        Menu.add(LihatData);

        Daftar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                Menu.dispose();
                Ardiansyah07197_DaftarGUI daftar = new Ardiansyah07197_DaftarGUI();
                
            }
        });
        
        LihatData.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                Menu.dispose();
                Ardiansyah07197_ViewGUI daftar = new Ardiansyah07197_ViewGUI();
                
            }
        });
    }
}
