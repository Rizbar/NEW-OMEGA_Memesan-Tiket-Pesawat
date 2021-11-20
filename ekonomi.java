public class ekonomi extends Pesawat {
    // Lion Air
    private double HARGA_JAKARTA_LIONAIR = 400000;
    private double HARGA_MEDAN_LIONAIR = 200000;
    private double HARGA_BATAM_LIONAIR = 250000;

    // Garuda
    private double HARGA_JAKARTA_GARUDA = 600000;
    private double HARGA_MEDAN_GARUDA = 450000;
    private double HARGA_BATAM_GARUDA = 500000;

    // Batik
    private double HARGA_JAKARTA_BATIK = 550000;
    private double HARGA_MEDAN_BATIK = 300000;
    private double HARGA_BATAM_BATIK = 450000;

    public ekonomi(String jenis, String kelas, String tujuan) {
        super(jenis, kelas, tujuan);
        if (tujuan == "Jakarta" && jenis == "Lion Air") {
            super.setHarga_Jakarta_LionAir(HARGA_JAKARTA_LIONAIR);
        } else if (tujuan == "Medan" && jenis == "Lion Air") {
            super.setHarga_Medan_LionAir(HARGA_MEDAN_LIONAIR);
        } else if (tujuan == "Batam" && jenis == "Lion Air") {
            super.setHarga_Batam_LionAir(HARGA_BATAM_LIONAIR);

        } else if (tujuan == "Jakarta" && jenis == "Garuda") {
            super.setHarga_Jakarta_Garuda(HARGA_JAKARTA_GARUDA);
        } else if (tujuan == "Medan" && jenis == "Garuda") {
            super.setHarga_Medan_Garuda(HARGA_MEDAN_GARUDA);
        } else if (tujuan == "Batam" && jenis == "Garuda") {
            super.setHarga_Batam_Garuda(HARGA_BATAM_GARUDA);

        } else if (tujuan == "Jakarta" && jenis == "Batik") {
            super.setHarga_Jakarta_Batik(HARGA_JAKARTA_BATIK);
        } else if (tujuan == "Medan" && jenis == "Batik") {
            super.setHarga_Medan_Batik(HARGA_MEDAN_BATIK);
        } else if (tujuan == "Batam" && jenis == "Batik") {
            super.setHarga_Batam_Batik(HARGA_BATAM_BATIK);
        } else {

        }
    }

}
