public class tesGaruda extends Pesawat {
    private double Harga_Jakarta_Ekonomi = 500000;
    private double Harga_Jakarta_Bisnis = 700000;

    public Garuda(String jenis){
        super(jenis);
        super.setHarga_Jakarta_Ekonomi(Harga_Jakarta_Ekonomi);
        super.setHarga_Jakarta_Bisnis(Harga_Jakarta_Bisnis);
    } 
}
