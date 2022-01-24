package UAS.StrukturDataQueue;

public class DataNama {
    private String NamaDepan;
    private String NamaBelakang;
    private int id;

    public DataNama(String NamaDepan, String NamaBelakang, int id)
    {
        this.NamaDepan = NamaDepan;
        this.NamaBelakang = NamaBelakang;
        this.id = id;
    }

    public String getNamaDepan(){
        return NamaDepan;
    }
    public void setNamaDepan(String NamaDepan){
        this.NamaDepan = NamaDepan;
    }
    public String getNamaBelakang(){
        return NamaBelakang;
    }
    public void setNamaBelakang(String NamaBelakang){
        this.getNamaBelakang();
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DataNama dataNama = (DataNama) o;
        if (id !=dataNama.id) return false;
        if(!NamaDepan.equals(dataNama.NamaDepan)) return false;
        return NamaBelakang.equals(dataNama.NamaBelakang);
    }
    @Override
    public int hashCode(){
        int hasil  = NamaDepan.hashCode();
        hasil = 31 * hasil + NamaDepan.hashCode();
        hasil = 31 * hasil + id;
        return hasil;
    }
    @Override
    public String toString(){
        return "DataNama (" +
                "NamaDepan='" + NamaDepan+ '\'' +
                ", NamaBelakang='" + NamaBelakang + '\'' +
                ", id=" + id +
                ')';
    }
}
