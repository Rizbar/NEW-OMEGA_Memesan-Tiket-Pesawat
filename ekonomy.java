/**
 * @author (New-Omega)
 * @version (01/12/2021)
 * Class ekonomi berisi Harga tiket pesawat untuk penumpang Ekonomi
 * Class ekonomi merupakan SubClass dari class Pesawat
 */

public class ekonomi extends Pesawat {

    // Harga Tiket Ekonomi Pesawat Lion Air
    private double HARGA_JAKARTA_LIONAIR;
    private double HARGA_MEDAN_LIONAIR;
    private double HARGA_BATAM_LIONAIR;

    // Harga Tiket Ekonomi Pesawat Garuda
    private double HARGA_JAKARTA_GARUDA;
    private double HARGA_MEDAN_GARUDA;
    private double HARGA_BATAM_GARUDA;

    // Harga Tiket Ekonomi Pesawat Batik
    private double HARGA_JAKARTA_BATIK;
    private double HARGA_MEDAN_BATIK;
    private double HARGA_BATAM_BATIK;

    /** Method Constructor Class Ekonomi
     * Method Setter untuk tiap pesawat dan tujuan                                                                                    
     * 
     * @param jenis pesawat
     * @param tujuan pesawat */

    /** Penentuan Harga tiket berdasarkan tujuan */
    
    public ekonomi(String jenis, String tujuan) {
        super(jenis, tujuan);
        super.setHarga_Jakarta_LionAir(HARGA_JAKARTA_LIONAIR);
        super.setHarga_Medan_LionAir(HARGA_MEDAN_LIONAIR);
        super.setHarga_Batam_LionAir(HARGA_BATAM_LIONAIR);
        super.setHarga_Jakarta_Garuda(HARGA_JAKARTA_GARUDA);
        super.setHarga_Medan_Garuda(HARGA_MEDAN_GARUDA);
        super.setHarga_Batam_Garuda(HARGA_BATAM_GARUDA);
        super.setHarga_Jakarta_Batik(HARGA_JAKARTA_BATIK);
        super.setHarga_Medan_Batik(HARGA_MEDAN_BATIK);
        super.setHarga_Batam_Batik(HARGA_BATAM_BATIK); 
    }

    /** Method Getter untuk HARGA_BATAM_BATIK */
    public double getHARGA_BATAM_BATIK() {
        return HARGA_BATAM_BATIK;
    }

    /** Method Getter untuk HARGA_BATAM_GARUDA */
    public double getHARGA_BATAM_GARUDA() {
        return HARGA_BATAM_GARUDA;
    }

    /** Method Getter untuk HARGA_BATAM_LIONAIR */
    public double getHARGA_BATAM_LIONAIR() {
        return HARGA_BATAM_LIONAIR;
    }

    /** Method Getter untuk HARGA_JAKARTA_BATIK */
    public double getHARGA_JAKARTA_BATIK() {
        return HARGA_JAKARTA_BATIK;
    }
    
    /** Method Getter untuk HARGA_JAKARTA_GARUDA */
    public double getHARGA_JAKARTA_GARUDA() {
        return HARGA_JAKARTA_GARUDA;
    }

    /**  Method Getter untuk HARGA_JAKARTA_LIONAIR */
    public double getHARGA_JAKARTA_LIONAIR() {
        return HARGA_JAKARTA_LIONAIR;
    }

    /**  Method Getter untuk HARGA_MEDAN_BATIK */
    public double getHARGA_MEDAN_BATIK() {
        return HARGA_MEDAN_BATIK;
    }

    /** Method Getter untuk HARGA_MEDAN_GARUDA */
    public double getHARGA_MEDAN_GARUDA() {
        return HARGA_MEDAN_GARUDA;
    }

    /** Method Getter untuk HARGA_MEDAN_LIONAIR */
    public double getHARGA_MEDAN_LIONAIR() {
        return HARGA_MEDAN_LIONAIR;
    }