
package Entity_07197;
public class Ardiansyah07197_PemesanAbstractEntity {
    protected String Ardiansyah07197_namapemesan, Ardiansyah07197_alamat, Ardiansyah07197_no_telp;
    public Ardiansyah07197_PemesanAbstractEntity(String Ardiansyah07197_namapemesan, String Ardiansyah07197_alamat, 
            String Ardiansyah07197_no_telp)
    {
        this.Ardiansyah07197_namapemesan = Ardiansyah07197_namapemesan;
        this.Ardiansyah07197_alamat = Ardiansyah07197_alamat;
        this.Ardiansyah07197_no_telp = Ardiansyah07197_no_telp;
    }
    
    public Ardiansyah07197_PemesanAbstractEntity(){
    }
    public void setNama_pemesan(String namapemesan) {
        this.Ardiansyah07197_namapemesan = namapemesan;
    }
    public void setArdiansyah07197_alamat(String alamat) {
        this.Ardiansyah07197_alamat = alamat;
    }
    public void setArdiansyah07197_notelp(String no_telp) {
        this.Ardiansyah07197_no_telp = no_telp;
    }
    public String getNama_pemesan(){
        return Ardiansyah07197_namapemesan;
    }
    public String getAlamat(){
        return Ardiansyah07197_alamat;
    }
    public String getNo_telp(){
        return Ardiansyah07197_no_telp;
    }
}
