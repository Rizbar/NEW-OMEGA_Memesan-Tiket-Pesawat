/**
 * Class firstclass mewakili class Pesawat untuk transaksi bisnis
 * Class firstclass merupakan SubClass dari class Pesawat
 * @author (New-Omega)
 * @version (01/12/2021)
 */

public class firstclass extends Pesawat {
    // Harga Tiket First Class Lion Air ke berbagai daerah
    private double HARGA_JAKARTA_LIONAIR;
    private double HARGA_MEDAN_LIONAIR;
    private double HARGA_BATAM_LIONAIR;

    // Harga Tiket First Class Garuda ke berbagai daerah
    private double HARGA_JAKARTA_GARUDA;
    private double HARGA_MEDAN_GARUDA;
    private double HARGA_BATAM_GARUDA;

    // Harga Tiket First Class Batik ke berbagai daerah
    private double HARGA_JAKARTA_BATIK ;
    private double HARGA_MEDAN_BATIK ;
    private double HARGA_BATAM_BATIK;

    /**
     * Method constructor untuk class firstclass.
     * @param jenis
     * @param tujuan
     */
    public firstclass(String jenis, String tujuan){
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

    /**
    * Method getter untuk HARGA_BATAM_BATIK. 
    * @return HARGA_BATAM_BATIK
    */
    public double getHARGA_BATAM_BATIK() {
        return HARGA_BATAM_BATIK;
    }

    /**
    * Method getter untuk HARGA_BATAM_GARUDA. 
    * @return HARGA_BATAM_GARUDA
    */
    public double getHARGA_BATAM_GARUDA() {
        return HARGA_BATAM_GARUDA;
    }

    /**
    * Method getter untuk HARGA_BATAM_LIONAIR. 
    * @return HARGA_BATAM_LIONAIR
    */
    public double getHARGA_BATAM_LIONAIR() {
        return HARGA_BATAM_LIONAIR;
    }

    /**
    * Method getter untuk HARGA_JAKARTA_BATIK. 
    * @return HARGA_JAKARTA_BATIK
    */
    public double getHARGA_JAKARTA_BATIK() {
        return HARGA_JAKARTA_BATIK;
    }

    /**
    * Method getter untuk HARGA_JAKARTA_GARUDA. 
    * @return HARGA_JAKARTA_GARUDA
    */
    public double getHARGA_JAKARTA_GARUDA() {
        return HARGA_JAKARTA_GARUDA;
    }

    /**
    * Method getter untuk HARGA_JAKARTA_LIONAIR. 
    * @return HARGA_JAKARTA_LIONAIR
    */
    public double getHARGA_JAKARTA_LIONAIR() {
        return HARGA_JAKARTA_LIONAIR;
    }

    /**
    * Method getter untuk HARGA_MEDAN_BATIK. 
    * @return HARGA_MEDAN_BATIK
    */
    public double getHARGA_MEDAN_BATIK() {
        return HARGA_MEDAN_BATIK;
    }

    /**
    * Method getter untuk HARGA_MEDAN_GARUDA. 
    * @return HARGA_MEDAN_GARUDA
    */
    public double getHARGA_MEDAN_GARUDA() {
        return HARGA_MEDAN_GARUDA;
    }

     /**
    * Method getter untuk HARGA_MEDAN_LIONAIR. 
    * @return HARGA_MEDAN_LIONAIR
    */
    public double getHARGA_MEDAN_LIONAIR() {
        return HARGA_MEDAN_LIONAIR;
    }
}
