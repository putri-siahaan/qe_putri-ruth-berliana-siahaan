package Eksplorasi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Buku {
    private UUID id;
    private String judul;
    private String penulis;
    private String kategori;

    public Buku(String judul, String penulis, String kategori){
        this.id = UUID.randomUUID();
        this.judul = judul;
        this.penulis = penulis;
        this.kategori = kategori;
    }

    public UUID getId(){
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis(){
        return penulis;
    }

    public void setPenulis(String penulis){
        this.penulis = penulis;
    }

    public String getKategori(){
        return kategori;
    }

    public void setKategori(String kategori){
        this.kategori = kategori;
    }
}
