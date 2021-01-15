package View_07197;

import Entity_07197.DaftarMenu_Entity;
import Entity_07197.Ardiansyah07197_FasEntity;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;

public class Ardiansyah07197_DaftarGUI {

    JFrame Daftar = new JFrame();
    JLabel labelcovdaftar, labelpengguna, labelnotelp, labelalamat, labeltglpesan, labeltglambil,
            labelmenu, labelfas;
    JTextField textnmpengguna, textnotelp, textalamat, texttglpesan, texttglambil;
    JButton daftarpesan, back;
    JComboBox pilmenu = new JComboBox(DaftarMenu_Entity.Ardiansyah07197_NamaPaket);
    JComboBox pilfas = new JComboBox(Ardiansyah07197_FasEntity.fasilitas);

    public Ardiansyah07197_DaftarGUI() {
        Daftar.setSize(700, 630);
        Daftar.setLayout(null);
        Daftar.getContentPane().setBackground(Color.CYAN);
        labelcovdaftar = new JLabel("Daftar Pesanan");
        labelcovdaftar.setBounds(250, 30, 460, 40);
        labelcovdaftar.setFont(new Font("Times New Roman", Font.BOLD, 30));
        Daftar.add(labelcovdaftar);

        Daftar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Daftar.setVisible(true);
        Daftar.setLocationRelativeTo(null);

        labelpengguna = new JLabel("Nama Pemesan");
        labelpengguna.setBounds(140, 70, 100, 50);
        Daftar.add(labelpengguna);
        textnmpengguna = new JTextField();
        textnmpengguna.setBounds(140, 110, 200, 30);
        Daftar.add(textnmpengguna);

        labelnotelp = new JLabel("No. Telp");
        labelnotelp.setBounds(140, 130, 100, 50);
        Daftar.add(labelnotelp);
        textnotelp = new JTextField();
        textnotelp.setBounds(140, 170, 200, 30);
        Daftar.add(textnotelp);

        labelalamat = new JLabel("Alamat");
        labelalamat.setBounds(140, 190, 100, 50);
        Daftar.add(labelalamat);
        textalamat = new JTextField();
        textalamat.setBounds(140, 230, 200, 30);
        Daftar.add(textalamat);

        labeltglpesan = new JLabel("Tanggal Pesan (mm-dd-yyyy)");
        labeltglpesan.setBounds(140, 250, 170, 50);
        Daftar.add(labeltglpesan);
        texttglpesan = new JTextField();
        texttglpesan.setBounds(140, 290, 200, 30);
        Daftar.add(texttglpesan);

        labeltglambil = new JLabel("Tanggal Ambil (mm-dd-yyyy)");
        labeltglambil.setBounds(140, 310, 170, 50);
        Daftar.add(labeltglambil);
        texttglambil = new JTextField();
        texttglambil.setBounds(140, 350, 200, 30);
        Daftar.add(texttglambil);

        labelmenu = new JLabel("Pilih Paket");
        labelmenu.setBounds(140, 370, 100, 50);
        Daftar.add(labelmenu);
        pilmenu.setBounds(140, 410, 200, 30);
        Daftar.add(pilmenu);

        labelfas = new JLabel("Pilih Fasilitas");
        labelfas.setBounds(140, 430, 100, 50);
        Daftar.add(labelfas);
        pilfas.setBounds(140, 470, 200, 30);
        Daftar.add(pilfas);

        daftarpesan = new JButton("Daftar Pesanan");
        daftarpesan.setBounds(420, 260, 140, 30);
        daftarpesan.setBackground(Color.GREEN);
        Daftar.add(daftarpesan);

        back = new JButton("Back");
        back.setBounds(420, 320, 140, 30);
        back.setBackground(Color.GREEN);
        Daftar.add(back);

        daftarpesan.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    String nama = textnmpengguna.getText();
                    String notelp = textnotelp.getText();
                    String alamat = textalamat.getText();
                    Date tglpesan = new Date(texttglpesan.getText());
                    Date tglambil = new Date(texttglambil.getText());
                    int menu = pilmenu.getSelectedIndex();
                    int fas = pilfas.getSelectedIndex();
                    Ardiansyah07197_allobjcontrol.pesananall.insert(nama, alamat, notelp, tglpesan, tglambil,
                            fas, menu);
                    JOptionPane.showMessageDialog(null, "Sukses Daftar", "Information", JOptionPane.INFORMATION_MESSAGE);
                    Daftar.dispose();
                    Ardiansyah07197_MenuGUI daftarpesan = new Ardiansyah07197_MenuGUI();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Format Pengisian Salah", "Information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        back.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                Daftar.dispose();
                Ardiansyah07197_MenuGUI back = new Ardiansyah07197_MenuGUI();
            }
        });

    }

}
