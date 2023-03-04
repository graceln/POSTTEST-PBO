// 2109106107
// Grace Ligit Nuh

package posttest1;

public class Sembako {
    private String kode, nama;
    private int harga, stok; 
;

    public Sembako(String kode, String nama, int harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public void display() {
        System.out.println("Kode Barang   : " + this.kode);
        System.out.println("Nama Barang : " + this.nama);
        System.out.println("Harga Barang   : " + this.harga);
        System.out.println("Stok Barang    : " + this.stok);
    }

    public void SetKode(String kode) {
        this.kode = kode;
    }

    public void SetNama(String nama) {
        this.nama = nama;
    }

    public void SetHarga(int harga) {
        this.harga = harga;
    }

    public void SetStok(int stok) {
        this.stok = stok;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

}