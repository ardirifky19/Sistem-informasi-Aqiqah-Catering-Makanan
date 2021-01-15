package View_07197;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ardiansyah07197_HapusGUI {

    JFrame Hapus = new JFrame();
    JLabel labelcovdel, labeldelnama, labeldelnotelp;
    JButton del, back;
    JTextField textdelnama, textdelnotelp;

    public Ardiansyah07197_HapusGUI() {
        Hapus.setSize(700, 630);
        Hapus.setLayout(null);
        Hapus.getContentPane().setBackground(Color.CYAN);
        labelcovdel = new JLabel("Delete Pesanan");
        labelcovdel.setBounds(250, 30, 460, 40);
        labelcovdel.setFont(new Font("Times New Roman", Font.BOLD, 30));
        Hapus.add(labelcovdel);

        Hapus.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Hapus.setVisible(true);
        Hapus.setLocationRelativeTo(null);


        labeldelnama = new JLabel("Nama Pemesan");
        labeldelnama.setBounds(280, 170, 140, 30);
        Hapus.add(labeldelnama);
        textdelnama = new JTextField();
        textdelnama.setBounds(280, 200, 140, 30);
        Hapus.add(textdelnama);
        
         labeldelnotelp = new JLabel("No. Telp");
        labeldelnotelp.setBounds(280, 250, 140, 30);
        Hapus.add(labeldelnotelp);
        textdelnotelp = new JTextField();
        textdelnotelp.setBounds(280, 280, 140, 30);
        Hapus.add(textdelnotelp);

        del = new JButton(" Delete ");
        del.setBounds(200, 480, 120, 40);
        del.setBackground(Color.GREEN);
        Hapus.add(del);

        back = new JButton(" Back ");
        back.setBounds(350, 480, 120, 40);
        back.setBackground(Color.GREEN);
        Hapus.add(back);

        del.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (Ardiansyah07197_allobjcontrol.pesananall.size() == 0) {
                    JOptionPane.showMessageDialog(null, "Data Tidak Tersedia", "Information", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    for (int i = 0; i <= Ardiansyah07197_allobjcontrol.pesananall.size() - 1; i++) {

                        if (textdelnama.getText().equals(Ardiansyah07197_allobjcontrol.pesananall.getDataPesanan(i).getNama_pemesan())
                                && textdelnotelp.getText().equals(Ardiansyah07197_allobjcontrol.pesananall.getDataPesanan(i).getNo_telp())) {
                             JOptionPane.showMessageDialog(null, "DATA BERHASIL DIHAPUS", "Information", JOptionPane.INFORMATION_MESSAGE);
                           Ardiansyah07197_allobjcontrol.pesananall.deleteDataMahasiswa(i);
                            break;
                        } else if (i == Ardiansyah07197_allobjcontrol.pesananall.size() - 1 && textdelnama.getText() != Ardiansyah07197_allobjcontrol.pesananall.getDataPesanan(i).
                                getNama_pemesan()
                                && textdelnotelp.getText() != Ardiansyah07197_allobjcontrol.pesananall.getDataPesanan(i).getNo_telp()) {
                           JOptionPane.showMessageDialog(null, "Nama / No.Telp Salah", "Information", JOptionPane.INFORMATION_MESSAGE);
                        } else if (i <= Ardiansyah07197_allobjcontrol.pesananall.size() - 1 && textdelnama.getText() != Ardiansyah07197_allobjcontrol.pesananall.getDataPesanan(i).
                                getNama_pemesan()
                                && textdelnotelp.getText() != Ardiansyah07197_allobjcontrol.pesananall.getDataPesanan(i).getNo_telp()) {
                            continue;
                        }
                    }
                }
                Hapus.dispose();
                Ardiansyah07197_MenuGUI deletepesan = new Ardiansyah07197_MenuGUI();
            }
        });

        back.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                Hapus.dispose();
                Ardiansyah07197_MenuGUI back = new Ardiansyah07197_MenuGUI();
            }
        });
    }
}
