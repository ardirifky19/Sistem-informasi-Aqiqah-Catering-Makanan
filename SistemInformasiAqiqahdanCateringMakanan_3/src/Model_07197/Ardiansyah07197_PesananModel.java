
package Model_07197;
import Entity_07197.Ardiansyah07197_PesananEntity;
import Entity_07197.Ardiansyah07197_FasEntity;
import Entity_07197.DaftarMenu_Entity;
import java.util.ArrayList;
import java.util.Date;

public class Ardiansyah07197_PesananModel  {
    private ArrayList<Ardiansyah07197_PesananEntity> pesananEntityArrayList ;
    
    public Ardiansyah07197_PesananModel(){
        pesananEntityArrayList = new ArrayList<Ardiansyah07197_PesananEntity>();
    }
    
    public void insert(Ardiansyah07197_PesananEntity pesananEntity){
    pesananEntityArrayList.add(pesananEntity);
    }
    
    public Ardiansyah07197_PesananEntity getDataPemesan(int index) {
        return pesananEntityArrayList.get(index);
    }
    
    public ArrayList<Ardiansyah07197_PesananEntity> getAllPesanan(){
        return pesananEntityArrayList;
    }
    
    public void hapusPesanan(int index) {
       pesananEntityArrayList.remove(pesananEntityArrayList.get(index));
    }
     
    public int size(){
        return pesananEntityArrayList.size();
    } 
    public void editNamapemesan(int index, String data) {
        pesananEntityArrayList.get(index).setNama_pemesan(data);
    }
    
    public void editAlamat(int index, String data) {
        pesananEntityArrayList.get(index).setArdiansyah07197_alamat(data);
    }
    
    public void editNotelp(int index, String data) {
        pesananEntityArrayList.get(index).setArdiansyah07197_notelp(data);
    }
    
    public void editTglpesan(int index, Date data) {
        pesananEntityArrayList.get(index).setTgl_pesan(data);
    }
    
    public void editTglambil(int index, Date data) {
        pesananEntityArrayList.get(index).setTgl_ambil(data);
    }
    
    public void editFas(int index, int data) {
        pesananEntityArrayList.get(index).setIndexFas(data);
    }
    
    public void editMenu(int index, int data) {
        pesananEntityArrayList.get(index).setIndexMenu(data);
    }
}

