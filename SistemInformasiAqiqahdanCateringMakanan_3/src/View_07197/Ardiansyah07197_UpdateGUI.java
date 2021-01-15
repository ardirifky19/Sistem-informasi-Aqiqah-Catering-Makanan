/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View_07197;

import Entity_07197.DaftarMenu_Entity;
import Entity_07197.Ardiansyah07197_FasEntity;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

public class Ardiansyah07197_UpdateGUI {
    
    JFrame Update = new JFrame();
    JLabel labelcovupdate, labelpengguna, labelnotelp, labelalamat, labeltglpesan, labeltglambil,
            labelmenu, labelfas;
    JButton updt, back;
    JTextField textnmpengguna, textnotelp, textalamat, texttglpesan, texttglambil;
    JComboBox pilmenu = new JComboBox(DaftarMenu_Entity.Ardiansyah07197_NamaPaket);
    JComboBox pilfas = new JComboBox(Ardiansyah07197_FasEntity.fasilitas);
   
    
    public Ardiansyah07197_UpdateGUI(int index) {
        
        Update.setSize(700, 630);
        Update.setLayout(null);
        Update.getContentPane().setBackground(Color.CYAN);
        labelcovupdate = new JLabel("Update Pesanan");
        labelcovupdate.setBounds(250, 30, 460, 40);
        labelcovupdate.setFont(new Font("Times New Roman", Font.BOLD, 30));
        Update.add(labelcovupdate);

        Update.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Update.setVisible(true);
        Update.setLocationRelativeTo(null);

        labelpengguna = new JLabel("Nama Pemesan");
        labelpengguna.setBounds(140, 70, 100, 50);
        Update.add(labelpengguna);
        textnmpengguna = new JTextField();
        textnmpengguna.setBounds(140, 110, 200, 30);
        Update.add(textnmpengguna);

        labelnotelp = new JLabel("No. Telp");
        labelnotelp.setBounds(140, 130, 100, 50);
        Update.add(labelnotelp);
        textnotelp = new JTextField();
        textnotelp.setBounds(140, 170, 200, 30);
        Update.add(textnotelp);

        labelalamat = new JLabel("Alamat");
        labelalamat.setBounds(140, 190, 100, 50);
        Update.add(labelalamat);
        textalamat = new JTextField();
        textalamat.setBounds(140, 230, 200, 30);
        Update.add(textalamat);

        labeltglpesan = new JLabel("Tanggal Pesan (mm/dd/yyyy)");
        labeltglpesan.setBounds(140, 250, 170, 50);
        Update.add(labeltglpesan);
        texttglpesan = new JTextField();
        texttglpesan.setBounds(140, 290, 200, 30);
        Update.add(texttglpesan);

        labeltglambil = new JLabel("Tanggal Ambil (mm/dd/yyyy)");
        labeltglambil.setBounds(140, 310, 170, 50);
        Update.add(labeltglambil);
        texttglambil = new JTextField();
        texttglambil.setBounds(140, 350, 200, 30);
        Update.add(texttglambil);

        labelmenu = new JLabel("Pilih Paket");
        labelmenu.setBounds(140, 370, 100, 50);
        Update.add(labelmenu);
        pilmenu.setBounds(140, 410, 200, 30);
        Update.add(pilmenu);

        labelfas = new JLabel("Pilih Fasilitas");
        labelfas.setBounds(140, 430, 100, 50);
        Update.add(labelfas);
        pilfas.setBounds(140, 470, 200, 30);
        Update.add(pilfas);

        updt = new JButton(" Update ");
        updt.setBounds(420, 280, 140, 30);
        updt.setBackground(Color.GREEN);
        Update.add(updt);

        back = new JButton("Back");
        back.setBounds(420, 320, 140, 30);
        back.setBackground(Color.GREEN);
        Update.add(back);
      
        textnmpengguna.setText(Ardiansyah07197_allobjcontrol.pesananall.getDataPesanan(index).getNama_pemesan());
        textnotelp.setText(Ardiansyah07197_allobjcontrol.pesananall.getDataPesanan(index).getNo_telp());
        textalamat.setText(Ardiansyah07197_allobjcontrol.pesananall.getDataPesanan(index).getAlamat());
        texttglpesan.setText(new SimpleDateFormat("dd/MM/yyyy").format(Ardiansyah07197_allobjcontrol.pesananall.getDataPesanan(index).getTgl_pesan()));
        texttglambil.setText(new SimpleDateFormat("dd/MM/yyyy").format(Ardiansyah07197_allobjcontrol.pesananall.getDataPesanan(index).getTgl_Ambil()));
        pilmenu.getItemAt(Ardiansyah07197_allobjcontrol.pesananall.getDataPesanan(index).getIndexMenu());
        pilfas.getItemAt(Ardiansyah07197_allobjcontrol.pesananall.getDataPesanan(index).getIndexFas());
        
        updt.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
               
                try {
                                
                    Ardiansyah07197_allobjcontrol.pesananall.setNama_pemesan(index, textnmpengguna.getText());
                    Ardiansyah07197_allobjcontrol.pesananall.setArdiansyah07197_alamat(index, textalamat.getText());
                    Ardiansyah07197_allobjcontrol.pesananall.setArdiansyah07197_notelp(index, textnotelp.getText());
                    Ardiansyah07197_allobjcontrol.pesananall.setTgl_pesan(index, new Date(texttglpesan.getText()));
                    Ardiansyah07197_allobjcontrol.pesananall.setTgl_ambil(index, new Date(texttglambil.getText()));
                    Ardiansyah07197_allobjcontrol.pesananall.setIndexFas(index, pilfas.getSelectedIndex());
                    Ardiansyah07197_allobjcontrol.pesananall.setIndexMenu(index, pilmenu.getSelectedIndex());
                   
                    JOptionPane.showMessageDialog(null, "Sukses Update", "Information", JOptionPane.INFORMATION_MESSAGE);
                    Update.dispose();
                    Ardiansyah07197_MenuGUI daftarpesan = new Ardiansyah07197_MenuGUI();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Data Index Tidak Tersedia", "Information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        back.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                Update.dispose();
                Ardiansyah07197_MenuGUI back = new Ardiansyah07197_MenuGUI();
            }
        });
    }

    

}
