// 2109106107
// Grace Ligit Nuh

package posttest1;

public class Pembeli {
    public String nama_pembeli;
    int jumlah_beli;
    
    public Pembeli(String nama_pembeli, int jumlah_beli) {
        this.nama_pembeli = nama_pembeli;
        this.jumlah_beli = jumlah_beli;
    }

    public void show() {
        System.out.println("Nama pembeli : " + this.nama_pembeli);
        System.out.println("Jumlah beli : " + this.jumlah_beli);
    }

 
}

