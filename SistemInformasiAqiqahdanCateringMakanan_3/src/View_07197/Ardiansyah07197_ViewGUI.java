/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View_07197;

import View_07197.Ardiansyah07197_MenuGUI;
import Controller_07197.Ardiansyah07197_PesananController;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class Ardiansyah07197_ViewGUI {

    private static Ardiansyah07197_PesananController pesanan = new Ardiansyah07197_PesananController();
    JFrame View = new JFrame();
    JTable tabelpesanan = new JTable();
    JScrollPane scrollpesanan = new JScrollPane(tabelpesanan);
    JButton edit, hapus, back;
    JLabel labelcovdatapesan;
    public int index;

    public Ardiansyah07197_ViewGUI() {

        View.setSize(700, 630);
        View.setLayout(null);
        View.getContentPane().setBackground(Color.CYAN);
        labelcovdatapesan = new JLabel("Data Pesanan");
        labelcovdatapesan.setBounds(270, 30, 460, 40);
        labelcovdatapesan.setFont(new Font("Times New Roman", Font.BOLD, 30));
        View.add(labelcovdatapesan);

        View.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        View.setVisible(true);
        View.setLocationRelativeTo(null);

        scrollpesanan.setBounds(50, 80, 580, 380);
        tabelpesanan.setModel(pesanan.daftarpes());
        View.add(scrollpesanan);

        edit = new JButton(" Edit ");
        edit.setBounds(120, 480, 120, 40);
        edit.setBackground(Color.GREEN);
        View.add(edit);

        hapus = new JButton(" Hapus ");
        hapus.setBounds(290, 480, 120, 40);
        hapus.setBackground(Color.GREEN);
        View.add(hapus);

        back = new JButton(" Back ");
        back.setBounds(460, 480, 120, 40);
        back.setBackground(Color.GREEN);
        View.add(back);

        edit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (Ardiansyah07197_allobjcontrol.pesananall.size() == 0) {
                    JOptionPane.showMessageDialog(null, "Data Kosong / Pilih Data Dahulu", "Information", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    View.dispose();
                    Ardiansyah07197_UpdateGUI daftarpesan = new Ardiansyah07197_UpdateGUI(index);
                }
            }
        });

        tabelpesanan.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = tabelpesanan.getSelectedRow();
                index = Integer.parseInt(Ardiansyah07197_allobjcontrol.pesananall.daftarpes().getValueAt(i, 0).toString()); //buat konversi
            }
        });

        hapus.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                View.dispose();
                Ardiansyah07197_HapusGUI delpesan = new Ardiansyah07197_HapusGUI();
            }
        });

        back.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                View.dispose();
                Ardiansyah07197_MenuGUI back = new Ardiansyah07197_MenuGUI();
            }
        });
    }

}
