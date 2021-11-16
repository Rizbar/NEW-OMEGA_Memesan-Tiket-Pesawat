/**
 * @author NewOmega
 * @version 
 */

public class Citilink extends tiketPesawat{
    private Pesawat tiketCitilink;

    public tiketCitilink()
    {
        tiketCitilink = new Pesawat (750000, "Citilink", "Bandung", "Ekonomi");
    }

    @Override
    public Pesawat getTiket()
    {
        return this.tiketCitilink;
    }

    @Override
    public void beliTiket(User user, int jumlahTiket, String tujuan, String kelas)
    {
        tiketCitilink.kurangi(jumlah);
        user.kurangi()
    }

    @Override
    public boolean cekBeliTiket(int jumlahTiket)
    {
        return tiketCitilink.getBeliTiket() >= jumlah;
    }

    @Override
    public boolean cekSaldoUser(double saldo)
    {
        return saldo >= tiketCitilink.getHarga();
    }
}