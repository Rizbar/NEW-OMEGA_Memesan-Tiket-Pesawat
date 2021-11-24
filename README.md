# NEW-OMEGA_Memesan-Tiket-Pesawat
@@ -1,3 +1,9 @@

public class User implements TambahKurang {

    private String email;
@@ -10,7 +16,9 @@

   
    public User(String email, String password) {
        this.email = email;
@@ -24,99 +32,125 @@ public User(String email, String password) {

   
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
   	this.saldo += saldo;
   }

   
    @Override
@@ -126,16 +160,20 @@ public void kurangi(int saldo) {

   
    public int getSaldo() {
        return this.saldo;
    }

}
