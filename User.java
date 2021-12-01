/**
 * Class User berisi data-data user.
 *@author (NEW-OMEGA)
 * @version (01-12-2021)
 */
public class User implements TambahKurang {

    private String email;
    private String password;
    private String nama;
    private String alamat;
    private String noHp;
    private double saldo;
  
   /**
    * Method constructor User
    * @param email
    * @param passwor
    */
    public User(String email, String password) {
        this.email = email;
        this.password = password;
        this.nama = "";
        this.alamat = "";
        this.noHp = "";
        this.saldo = 50000;
    }
	
   /**
    * Method setter untuk memasukkan email
    * @param email
    */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Method getter untuk mengembalikan email User
     * @return email 
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Method setter untuk memasukkan password User
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Method getter untuk mengembalikan Password User
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Method setter untuk memasukkan nama User
     * @param nama
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * Method getter untuk mengembalikan nama User
     * @return nama
     */
    public String getNama() {
        return this.nama;
    }

    /**
     * Method setter untuk memasukkan alamat User
     * @param alamat
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * Method getter untuk mengembalikan alamat User
     * @return alamat
     */
    public String getAlamat() {
        return this.alamat;
    }

    /**
     * Method setter untuk memasukkan no HP User
     * @param noHp
     */
    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    /**
     * Method getter untuk mengembalikan no HP User
     * @return noHp
     */
    public String getNoHp() {
        return this.noHp;
    }
	
   /**
    * Method untuk menambahkan jumlah saldo User
    * @param saldo
    */
   @Override
   public void tambah(double saldo) {
   	this.saldo += saldo;
   }

    /**
     * Method untuk mengurangi jumlah saldo User
     * @param saldo
     */
    @Override
    public void kurangi(double saldo) {
        this.saldo -= saldo;
    }

    /**
     * Method getter untuk mengembalikan saldo User
     * @return saldo
     */
    public double getSaldo() {
        return this.saldo;
    }
}