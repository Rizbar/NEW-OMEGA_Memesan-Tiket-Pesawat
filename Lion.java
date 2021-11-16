/**
 * @author NewOmega
 * @version 
 */

public class Lion extends tiketPesawat{
    private Pesawat tiketLion;

    public tiketLion()
    {
        tiketLion = new Pesawat (800000, "Lion", "CGK", "Ekonomi");
    }

    @Override
    public Pesawat getTiket()
    {
        return this.tiketLion;
    }

    @Override
    public void beliTiket(User user, int jumlahTiket, String tujuan, String kelas)
    {
        tiketLion.kurangi(jumlah);
        user.kurangi()
    }

    @Override
    public boolean cekBeliTiket(int jumlahTiket)
    {
        return tiketLion.getBeliTiket() >= jumlah;
    }

    @Override
    public boolean cekSaldoUser(double saldo)
    {
        return saldo >= tiketLion.getHarga();
    }
}