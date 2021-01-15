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

public class Ardiansyah07197_GUI {

    JFrame LogApl = new JFrame();
    JLabel labeladmin, labelpassadmin, labelcovtampilan;
    JTextField textadmin;
    JPasswordField textpassadmin;
    JButton login;
    private boolean ceklogin = false;

    public Ardiansyah07197_GUI() {
        LogApl.setSize(700, 600);
        LogApl.setLayout(null);
        LogApl.getContentPane().setBackground(Color.CYAN);
        labelcovtampilan = new JLabel("Sistem Informasi Catering");
        labelcovtampilan.setBounds(150, 80, 460, 40);
        labelcovtampilan.setFont(new Font("Times New Roman", Font.BOLD, 35));
        LogApl.add(labelcovtampilan);

        labeladmin = new JLabel("Nama Admin");
        labeladmin.setBounds(270, 170, 140, 30);
        LogApl.add(labeladmin);
        textadmin = new JTextField();
        textadmin.setBounds(270, 210, 140, 30);
        LogApl.add(textadmin);

        labelpassadmin = new JLabel("Password");
        labelpassadmin.setBounds(270, 250, 140, 30);
        LogApl.add(labelpassadmin);
        textpassadmin = new JPasswordField();
        textpassadmin.setBounds(270, 290, 140, 30);
        LogApl.add(textpassadmin);

        login = new JButton("LOGIN");
        login.setBounds(270, 340, 140, 30);
        login.setBackground(Color.GREEN);
        LogApl.add(login);

        LogApl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LogApl.setVisible(true);
        LogApl.setLocationRelativeTo(null);

        login.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                String namaadmin = "ARDI", passadmin = "123";
                if (namaadmin.equals(textadmin.getText()) && passadmin.equals(textpassadmin.getText())) {
                    JOptionPane.showMessageDialog(null, "Selamat Datang" + namaadmin, "Information", JOptionPane.INFORMATION_MESSAGE);
                    LogApl.dispose();
                    Ardiansyah07197_MenuGUI menu = new Ardiansyah07197_MenuGUI();
                    kosong();
                } else {
                    JOptionPane.showMessageDialog(null, "Nama atau Password Salah", "Information", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }
            }
        });
    }

    void kosong() {
        textadmin.setText(null);
        textpassadmin.setText(null);
    }
}
