
package Entity_07197;
import java.util.Date;
public class Ardiansyah07197_PesananEntity extends Ardiansyah07197_PemesanAbstractEntity {
    public Date Ardiansyah07197_tglpesan, Ardiansyah07197_tglambil; 
    public int indexFas, indexMenu;
    public Ardiansyah07197_PesananEntity(String Ardiansyah07197_namapemesan, String Ardiansyah07197_alamat, 
            String Ardiansyah07197_no_telp, Date Ardiansyah07197_tglpesan,Date Ardiansyah07197_tglambil, 
            int indexFas, int indexmenu) 
    {
        super(Ardiansyah07197_namapemesan,Ardiansyah07197_alamat,Ardiansyah07197_no_telp);
        this.Ardiansyah07197_tglpesan=Ardiansyah07197_tglpesan;
        this.Ardiansyah07197_tglambil=Ardiansyah07197_tglambil;
        this.indexFas = indexFas;
        this.indexMenu = indexmenu;
    }
    
    @Override
    public String getNama_pemesan() {
        return Ardiansyah07197_namapemesan;
    }
    public void setTgl_pesan(Date tglpesan ){
        this.Ardiansyah07197_tglpesan = tglpesan ;
    }
    public Date getTgl_pesan(){
        return Ardiansyah07197_tglpesan;
    }
    public void setTgl_ambil(Date tglambil ){
        this.Ardiansyah07197_tglambil = tglambil ;
    }
    public Date getTgl_Ambil(){
        return Ardiansyah07197_tglambil;
    }
    public void setIndexFas(int indexfasilitas ){
        this.indexFas = indexfasilitas ;
    }
    public int getIndexFas() {
        return indexFas;
    }
    public void setIndexMenu(int indexmenu ){
        this.indexMenu = indexmenu ;
    }
    public int getIndexMenu() {
        return indexMenu;
    }
}
