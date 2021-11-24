public class User implements TambahKurang {

    private String email;
    private String password;
    private String nama;
    private String alamat;
    private String noHp;
    private int saldo;
    
    
    public User(String email, String password) {
        this.email = email;
        this.password = password;
        this.nama = "";
        this.alamat = "";
        this.noHp = "";
        this.saldo = 10000;
    }
    
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getEmail() {
        return this.email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    public String getPassword() {
        return this.password;
    }

    
    public void setNama(String nama) {
        this.nama = nama;
    }

    
    public String getNama() {
        return this.nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    
    public String getAlamat() {
        return this.alamat;
    }
    

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getNoHp() {
        return this.noHp;
    }

    @Override
    public void tambah(int saldo) {
        this.saldo += saldo;
    }

    @Override
    public void kurangi(int saldo) {
        this.saldo -= saldo;
    }

    public int getSaldo() {
        return this.saldo;
    }

}