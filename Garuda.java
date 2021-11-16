/**
 * @author NewOmega
 * @version 
 */

public class Garuda extends tiketPesawat{
    private Pesawat tiketGaruda;

    public tiketGaruda()
    {
        tiketGaruda = new Pesawat (900000, "Garuda", "Kuala Namu", "Bisnis");
    }

    @Override
    public Pesawat getTiket()
    {
        return this.tiketGaruda;
    }

    @Override
    public void beliTiket(User user, int jumlahTiket, String tujuan, String kelas)
    {
        tiketGaruda.kurangi(jumlah);
        user.kurangi()
    }

    @Override
    public boolean cekBeliTiket(int jumlahTiket)
    {
        return tiketGaruda.getBeliTiket() >= jumlah;
    }

    @Override
    public boolean cekSaldoUser(double saldo)
    {
        return saldo >= tiketGaruda.getHarga();
    }
}