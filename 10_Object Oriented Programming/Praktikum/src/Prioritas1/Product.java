package Prioritas1;

public class Product {
    private String nama;
    private String deskripsi;
    private int harga;
    private int jumlahStok;

    public Product(String nama, String deskripsi, int harga, int jumlahStok){
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.jumlahStok = jumlahStok;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }


    public void setJumlahStok(int jumlahStok) {
        this.jumlahStok = jumlahStok;
    }

    public int getJumlahStok() {
        return jumlahStok;
    }

    public void getInfo(){
        System.out.println("===");
        System.out.println("INFO PRODUK");
        System.out.println("nama: " + nama);
        System.out.println("deskripsi: " + deskripsi);
        System.out.println("harga: " + harga);
        System.out.println("jumlah stok: " + jumlahStok);
        System.out.println("===");
    }

    public static void main(String[] args) {
        Product produk1 = new Product("coffee", "this is cofee", 15000, 10);
        Product produk2 = new Product("milk", "this is fresh milk", 25000, 10);
        Product produk3 = new Product("aplle juice", "this is juice", 18000, 20);

        produk1.getInfo();
        produk2.getInfo();
        produk3.getInfo();
    }

}
