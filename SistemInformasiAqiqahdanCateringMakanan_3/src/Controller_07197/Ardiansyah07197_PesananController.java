
package Controller_07197;

import Entity_07197.Ardiansyah07197_PesananEntity;
import Entity_07197.Ardiansyah07197_FasEntity;
import Entity_07197.DaftarMenu_Entity;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Ardiansyah07197_PesananController {
    int indexLogin;
    
    public Ardiansyah07197_PesananEntity getDataPesanan (int index){
        return Ardiansyah07197_AllObjectModel.pesanan.getDataPemesan(index);    
    }
    
    public void insert(String Ardiansyah07197_namapemesan, String Ardiansyah07197_alamat, 
            String Ardiansyah07197_no_telp, Date Ardiansyah07197_tglpesan,Date Ardiansyah07197_tglambil, 
            int indexFas, int indexmenu) {
            Ardiansyah07197_PesananEntity pesanan = new Ardiansyah07197_PesananEntity(
            Ardiansyah07197_namapemesan, Ardiansyah07197_alamat, Ardiansyah07197_no_telp, 
            Ardiansyah07197_tglpesan, Ardiansyah07197_tglambil, indexFas, indexmenu);
            Ardiansyah07197_AllObjectModel.pesanan.insert(pesanan);
        }
    
    public ArrayList<Ardiansyah07197_PesananEntity> getAllDataPesanan() {
        return Ardiansyah07197_AllObjectModel.pesanan.getAllPesanan();
    }
    
    public void deleteDataMahasiswa(int index) {
        Ardiansyah07197_AllObjectModel.pesanan.hapusPesanan(index);
    }
    
    public void setNama_pemesan(int update, String ardiansyah07197_nama){
        Ardiansyah07197_AllObjectModel.pesanan.editNamapemesan(update, ardiansyah07197_nama);
    }
    
    public void setArdiansyah07197_alamat(int update, String ardiansyah07197_alamat){
        Ardiansyah07197_AllObjectModel.pesanan.editAlamat(update, ardiansyah07197_alamat);
    }
    
    public void setArdiansyah07197_notelp(int update, String ardiansyah07197_notelp){
        Ardiansyah07197_AllObjectModel.pesanan.editNotelp(update, ardiansyah07197_notelp);
    }
    
    public void setTgl_pesan(int update, Date ardiansyah07197_tglpesan){
        Ardiansyah07197_AllObjectModel.pesanan.editTglpesan(update, ardiansyah07197_tglpesan);
    }
    
    public void setTgl_ambil(int update, Date ardiansyah07197_tglambil){
        Ardiansyah07197_AllObjectModel.pesanan.editTglambil(update, ardiansyah07197_tglambil);
    }
    
    public void setIndexFas(int update, int ardiansyah07197_fasilitas){
        Ardiansyah07197_AllObjectModel.pesanan.editFas(update, ardiansyah07197_fasilitas);
    }
    
    public void setIndexMenu(int update, int ardiansyah07197_menu){
        Ardiansyah07197_AllObjectModel.pesanan.editMenu(update, ardiansyah07197_menu);
    }
    
    public int size(){
        return Ardiansyah07197_AllObjectModel.pesanan.size();
    }   
    
     public DefaultTableModel daftarpes() {
        DefaultTableModel dtmdaftarpesanan = new DefaultTableModel();
        Object[] kolom = {"index", "Nama", "No.Telp", "Alamat", "Tgl Pesan", "Tgl Ambil", "Fasilitas", "Paket", "Harga", "Isi Paket"};
        dtmdaftarpesanan.setColumnIdentifiers(kolom);
        int size = Ardiansyah07197_AllObjectModel.pesanan.getAllPesanan().size();
        for (int i = 0; i < size; i++){
             Object[] data = new Object[10];
            data[0] = i;
            data[1] = Ardiansyah07197_AllObjectModel.pesanan.getAllPesanan().get(i).getNama_pemesan();
            data[2] = Ardiansyah07197_AllObjectModel.pesanan.getAllPesanan().get(i).getNo_telp();
            data[3] = Ardiansyah07197_AllObjectModel.pesanan.getAllPesanan().get(i).getAlamat();
            data[4] = new SimpleDateFormat("dd-MM-yyyy").format(Ardiansyah07197_AllObjectModel.pesanan.getAllPesanan().get(i).getTgl_pesan());
            data[5] = new SimpleDateFormat("dd-MM-yyyy").format(Ardiansyah07197_AllObjectModel.pesanan.getAllPesanan().get(i).getTgl_Ambil());
            data[6] = DaftarMenu_Entity.Ardiansyah07197_NamaPaket[Ardiansyah07197_AllObjectModel.pesanan.getAllPesanan().get(i).getIndexMenu()];
            data[7] = Ardiansyah07197_FasEntity.fasilitas[Ardiansyah07197_AllObjectModel.pesanan.getAllPesanan().get(i).getIndexFas()];
            data[8] = DaftarMenu_Entity.Ardiansyah07197_HargaPaketMenu[Ardiansyah07197_AllObjectModel.pesanan.getAllPesanan().get(i).getIndexMenu()];
            data[9] = DaftarMenu_Entity.Ardiansyah07197_IsiPaketMenu[Ardiansyah07197_AllObjectModel.pesanan.getAllPesanan().get(i).getIndexMenu()];
            dtmdaftarpesanan.addRow(data);
        }
        return dtmdaftarpesanan;
     }

}