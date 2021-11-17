/**
 * @author NewOmega
 * @version 
 */

public class AirAsia extends tiketPesawat{
    private Pesawat tiketAirAsia;

    public tiketAirAsia()
    {
        tiketAirAsia = new Pesawat (700000, "Air Asia", "CGK", "Bisnis");
    }

    @Override
    public Pesawat getTiket()
    {
        return this.tiketAirAsia;
    }

    @Override
    public void beliTiket(User user, int jumlahTiket, String tujuan, String kelas)
    {
        tiketAirAsia.kurangi(jumlah);
        user.kurangi()
    }

    @Override
    public boolean cekBeliTiket(int jumlahTiket)
    {
        return tiketAirAsia.getBeliTiket() >= jumlah;
    }

    @Override
    public boolean cekSaldoUser(double saldo)
    {
        return saldo >= tiketAirAsia.getHarga();
    }
}