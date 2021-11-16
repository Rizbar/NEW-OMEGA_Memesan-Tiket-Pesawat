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

    
    
    public Pesawat(String jenis)
    {
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


    public void setKelas(String kelas)
    {
        this.kelas = kelas;
    }


    public String getkelas()
    {
        return this.kelas;
    }
    
    public String toString()
    {
        return"Jenis: " + jenis;
    }
}