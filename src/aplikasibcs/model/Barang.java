/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasibcs.model;

/**
 *
 * @author admin
 */
public class Barang {
    private int jumlah_brg, harga_brg;
    private String id_brg, nama_brg, id_sup;

    public Barang() {
    }

    public Barang(int harga_brg, String id_brg, String nama_brg, String id_sup) {
        this.harga_brg = harga_brg;
        this.id_brg = id_brg;
        this.nama_brg = nama_brg;
        this.id_sup = id_sup;
    }

    
    public Barang(String id_brg, String nama_brg, int jumlah_brg, int harga_brg, String id_sup) {
        this.jumlah_brg = jumlah_brg;
        this.harga_brg = harga_brg;
        this.id_brg = id_brg;
        this.nama_brg = nama_brg;
        this.id_sup = id_sup;
    }

    public int getJumlah_brg() {
        return jumlah_brg;
    }

    public void setJumlah_brg(int jumlah_brg) {
        this.jumlah_brg = jumlah_brg;
    }

    public int getHarga_brg() {
        return harga_brg;
    }

    public void setHarga_brg(int harga_brg) {
        this.harga_brg = harga_brg;
    }

    public String getId_brg() {
        return id_brg;
    }

    public void setId_brg(String id_brg) {
        this.id_brg = id_brg;
    }

    public String getNama_brg() {
        return nama_brg;
    }

    public void setNama_brg(String nama_brg) {
        this.nama_brg = nama_brg;
    }

    public String getId_sup() {
        return id_sup;
    }

    public void setId_sup(String id_sup) {
        this.id_sup = id_sup;
    }
    
    
}
