/**
 * @author NewOmega
 * @version 
 */

public class Batik extends tiketPesawat{
    private Pesawat tiketBatik;

    public tiketBatik()
    {
        tiketBatik = new Pesawat (500000, "Batik", "Kuala Namu", "Ekonomi");
    }

    @Override
    public Pesawat getTiket()
    {
        return this.tiketBatik;
    }

    @Override
    public void beliTiket(User user, int jumlahTiket, String tujuan, String kelas)
    {
        tiketBatik.kurangi(jumlah);
        user.kurangi()
    }

    @Override
    public boolean cekBeliTiket(int jumlahTiket)
    {
        return tiketBatik.getBeliTiket() >= jumlah;
    }

    @Override
    public boolean cekSaldoUser(double saldo)
    {
        return saldo >= tiketBatik.getHarga();
    }
}