/**
 * 
 * @author (NEW-OMEGA)
 * @version (09-11-2021)
 */
public class Pesawat
{
    private int harga;
    private String jenis;
    private String tujuan;
    private String kelas;

    
    
    public Pesawat(int harga, String jenis, String tujuan, String kelas)
    {
        this.harga = harga;
        this.jenis = jenis;
        this.tujuan = tujuan;
        this.kelas = kelas;
    }
    
    
    public int getHarga()
    {
        return this.harga;
    }
    
    
    public String getJenis()
    {
        return this.jenis;
    }
    
    
    public String getTujuan()
    {
        return this.tujuan;
    }

    public String getkelas()
    {
        return this.kelas;
    }
    
    public String toString()
    {
        return "Harga: " +harga+ "\nJenis: " +jenis+ "\nTujuan: " +tujuan+ "\nKelas: " +kelas;
    }
}