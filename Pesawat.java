/**
 * class pesawat untuk class induk
 * @author (NEW-OMEGA)
 * @version (01-12-2021)
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
    private String hari;
    private double jam;
    
    /**
     * method constructor kelas pesawat
     * @param jenis
     * @param tujuan
     */
    public Pesawat(String jenis, String tujuan)
    {
        this.jenis = jenis;
        this.tujuan = tujuan;
    }
    /**
     * method setter untuk memasukan jenis pesawat
     * @param jenis
     */
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    /**
     * method setter untuk mengembalikan jenis pesawat
     * @return this.jenis
     */
    public String getJenis()
    {
        return this.jenis;
    }
    
    /**
     * method setter untuk memasukan tujuan pesawat
     * @param tujuan
     */
    public void setTujuan(String tujuan)
    {
        this.tujuan = tujuan;
    }

    /**
     * method setter untuk mengembalikan tujuan pesawat
     * @return this.tujuan
     */
    public String getTujuan()
    {
        return this.tujuan;
    }

    /**
     * method setter untuk memasukan kelas pesawat
     * @param kelas
     */
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    /**
     * method setter untuk mengembalikan kelas pesawat
     * @return this.kelas
     */
    public String getkelas()
    {
        return this.kelas;
    }

    /**
     * method setter untuk memasukan harga jakarta lionair
     * @param Harga_Jakarta_LionAir
     */
    public void setHarga_Jakarta_LionAir(double Harga_Jakarta_LionAir) {
        this.Harga_Jakarta_LionAir = Harga_Jakarta_LionAir;
    }

    /**
     * method setter untuk memasukan harga medan lionair
     * @param Harga_Medan_LionAir
     */
    public void setHarga_Medan_LionAir(double Harga_Medan_LionAir) {
        this.Harga_Medan_LionAir = Harga_Medan_LionAir;
    }

    /**
     * method setter untuk memasukan harga batam lionair
     * @param Harga_Batam_LionAir
     */
    public void setHarga_Batam_LionAir(double Harga_Batam_LionAir) {
        this.Harga_Batam_LionAir = Harga_Batam_LionAir;
    }
    
    /**
     * method setter untuk memasukan harga batam garuda
     * @param Harga_Batam_Garuda
     */
    public void setHarga_Batam_Garuda(double Harga_Batam_Garuda) {
        this.Harga_Batam_Garuda = Harga_Batam_Garuda;
    }

    /**
     * method setter untuk memasukan harga jakarta garuda
     * @param Harga_Jakarta_Garuda
     */
    public void setHarga_Jakarta_Garuda(double Harga_Jakarta_Garuda) {
        this.Harga_Jakarta_Garuda = Harga_Jakarta_Garuda;
    }

    /**
     * method setter untuk memasukan harga medan garuda
     * @param Harga_Medan_Garuda
     */
    public void setHarga_Medan_Garuda(double Harga_Medan_Garuda) {
        this.Harga_Medan_Garuda = Harga_Medan_Garuda;
    }

    /**
     * method setter untuk memasukan harga batam batik
     * @param Harga_Batam_Batik
     */
    public void setHarga_Batam_Batik(double Harga_Batam_Batik) {
        this.Harga_Batam_Batik = Harga_Batam_Batik;
    }

    /**
     * method setter untuk memasukan harga jakarta batik
     * @param Harga_Jakarta_Batik
     */
    public void setHarga_Jakarta_Batik(double Harga_Jakarta_Batik) {
        this.Harga_Jakarta_Batik = Harga_Jakarta_Batik;
    }

    /**
     * method setter untuk memasukan harga medan batik
     * @param Harga_Medan_Batik
     */
    public void setHarga_Medan_Batik(double Harga_Medan_Batik) {
        this.Harga_Medan_Batik = Harga_Medan_Batik;
    }
    
    /**
     * method setter untuk memasukan hari pesawat
     * @param hari
     */
    public void setHari(String hari){
        this.hari = hari;
    }

    /**
     * method setter untuk mengembalikan hari pesawat
     * @return this.hari
     */
    public String getHari(){
        return hari;
    }

    /**
     * method setter untuk memasukan jam pesawat
     * @param jam
     */
    public void setJam(double jam){
        this.jam = jam;
    }

    /**
     * method setter untuk mengembalikan jam pesawat
     * @return this.jam
     */
    public double getJam(){
        return jam;
    }
    
}