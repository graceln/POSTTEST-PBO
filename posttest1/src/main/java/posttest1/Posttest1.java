// 2109106107
// Grace Ligit Nuh

package posttest1;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import posttest1.Sembako;
import posttest1.Pembeli;

public class Posttest1 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        InputStreamReader prepare = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(prepare);
        ArrayList <Sembako> dataSembako = new ArrayList<>();
        ArrayList <Pembeli> dataPembeli = new ArrayList<>();
        while (true) {
            System.out.println("====== Toko Sembako ======");
            System.out.println("1. Create Sembako");
            System.out.println("2. Read Sembako");
            System.out.println("3. Update Sembako");
            System.out.println("4. Delete Sembako");
            System.out.println("5. Buy Sembako");
            System.out.println("6. Exit");
            System.out.println("==========================");
            System.out.print("Input Menu : ");
            int menu = Integer.parseInt(input.readLine());
            switch (menu) {
                case 1:
                    System.out.println("Create Sembako");
                    System.out.print("Kode Barang : ");
                    String kode = input.readLine();
                    System.out.print("Nama Barang : ");
                    String nama = input.readLine();
                    System.out.print("Harga Barang : ");
                    String harga = input.readLine();
                    int hargas = 0,stoks = 0;
                    try{
                        hargas = Integer.parseInt(harga);
                    }
                    catch(NumberFormatException e) {
                        System.out.println("Input harus angka!");
                    }
                    System.out.print("Stok Barang : ");
                    String stok = input.readLine();
                    try{
                        stoks = Integer.parseInt(stok);
                    }
                    catch(NumberFormatException e) {
                        System.out.println("Input harus angka!");
                    }
                    Sembako dataBaru = new Sembako(kode, nama, hargas, stoks);
                    dataSembako.add(dataBaru);
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Read Sembako");
                    for (int i = 0; i < dataSembako.size(); i += 1) {
                        System.out.println("Barang Sembako ke- " + (i + 1));
                        System.out.println("Kode Barang    : " + dataSembako.get(i).getKode());
                        System.out.println("Nama Barang : " + dataSembako.get(i).getNama());
                        System.out.println("Harga Barang   : " + dataSembako.get(i).getHarga());
                        System.out.println("Stok Barang      : " + dataSembako.get(i).getStok());
                        System.out.println("");
                    }
                    System.out.println("");
                    break;
                    
                case 3:
                    System.out.println("Update Sembako");
                    System.out.println("Kode Barang : ");
                    String nomor = input.readLine();
                    for (Sembako sembako : dataSembako) {
                        if (sembako.getKode().equals(nomor)) {
                            System.out.print("Kode Barang : ");
                            sembako.SetKode(input.readLine());
                            System.out.print("Nama Barang : ");
                            sembako.SetNama(input.readLine());
                            System.out.print("Harga Barang : ");
                            sembako.SetHarga(Integer.parseInt(input.readLine()));
                            System.out.print("Stok Barang : ");
                            sembako.SetStok(Integer.parseInt(input.readLine()));
                            System.out.println("Data updated successfully!");
                            System.out.println("");
                            break;
                        }
                    }
                    break;
                    
                case 4:
                    System.out.println("Delete Sembako");
                    System.out.print("Kode Barang : ");
                    String nobrg = input.readLine();
                    for (int i = 0; i < dataSembako.size(); i++) {
                        if (dataSembako.get(i).getKode().equals(nobrg)) {
                            dataSembako.remove(i);
                            System.out.println("Data deleted successfully!");
                            System.out.println("");
                            break;
                        }
                    }
                    break;
                    
                case 5:
                    System.out.println("Buy Sembako");
                    System.out.print("Nama Pembeli : ");
                    String nama_pembeli = input.readLine();
                    System.out.print("Kode Barang yang dibeli : ");
                    String kode_barang = input.readLine();
                    System.out.print("Jumlah Beli : ");
                    int jumlah_beli = Integer.parseInt(input.readLine());
                    for (int i = 0; i < dataSembako.size(); i += 1) {                        
                        if (dataSembako.get(i).getKode().equals(kode_barang)){
                           dataSembako.get(i).SetStok(dataSembako.get(i).getStok() - jumlah_beli); 
                        }
                    }
                    System.out.println("");
                    break;
                    
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Menu tidak ada");
                    break;
        }
    
        }
        
    }
}
