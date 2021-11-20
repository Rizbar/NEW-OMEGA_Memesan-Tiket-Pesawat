/**
 * 
 * @author (NEW-OMEGA)
 * @version (09-11-2021)
 */
public class Pesawat
{
    private String jenis;
    private String tujuan;
    private String kelas;
    private double Harga_Jakarta_LionAir;
    private double Harga_Medan_LionAir;
    private double Harga_Batam_LionAir;
    private double Harga_Jakarta_Garuda;
    private double Harga_Medan_Garuda;
    private double Harga_Batam_Garuda;
    private double Harga_Jakarta_Batik;
    private double Harga_Medan_Batik;
    private double Harga_Batam_Batik;
    
    
    public Pesawat(String jenis, String kelas, String tujuan)
    {
        this.jenis = jenis;
        this.kelas = kelas;
        this.tujuan = tujuan;
    }
    
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getJenis()
    {
        return this.jenis;
    }
    

    public void setTujuan(String tujuan)
    {
        this.tujuan = tujuan;
    }


    public String getTujuan()
    {
        return this.tujuan;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }


    public String getkelas()
    {
        return this.kelas;
    }

    public void setHarga_Jakarta_LionAir(double Harga_Jakarta_LionAir) {
        this.Harga_Jakarta_LionAir = Harga_Jakarta_LionAir;
    }

    public void setHarga_Medan_LionAir(double Harga_Medan_LionAir) {
        this.Harga_Medan_LionAir = Harga_Medan_LionAir;
    }

    public void setHarga_Batam_LionAir(double Harga_Batam_LionAir) {
        this.Harga_Batam_LionAir = Harga_Batam_LionAir;
    }
    
    public void setHarga_Batam_Garuda(double Harga_Batam_Garuda) {
        this.Harga_Batam_Garuda = Harga_Batam_Garuda;
    }

    public void setHarga_Jakarta_Garuda(double Harga_Jakarta_Garuda) {
        this.Harga_Jakarta_Garuda = Harga_Jakarta_Garuda;
    }

    public void setHarga_Medan_Garuda(double Harga_Medan_Garuda) {
        this.Harga_Medan_Garuda = Harga_Medan_Garuda;
    }

    public void setHarga_Batam_Batik(double Harga_Batam_Batik) {
        this.Harga_Batam_Batik = Harga_Batam_Batik;
    }

    public void setHarga_Jakarta_Batik(double Harga_Jakarta_Batik) {
        this.Harga_Jakarta_Batik = Harga_Jakarta_Batik;
    }

    public void setHarga_Medan_Batik(double Harga_Medan_Batik) {
        this.Harga_Medan_Batik = Harga_Medan_Batik;
    }
}