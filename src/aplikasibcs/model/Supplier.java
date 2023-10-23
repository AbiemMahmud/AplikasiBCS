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
public class Supplier {
    private String id_sup, nama_sup, alamat_sup;

//    Overflow constructor
    public Supplier() {
    }

    public Supplier(String id_sup, String nama_sup) {
        this.id_sup = id_sup;
        this.nama_sup = nama_sup;
    }

    public Supplier(String id_sup, String nama_sup, String alamat_sup) {
        this.id_sup = id_sup;
        this.nama_sup = nama_sup;
        this.alamat_sup = alamat_sup;
    }

//    Getter and Setter
    public String getId_sup() {
        return id_sup;
    }

    public void setId_sup(String id_sup) {
        this.id_sup = id_sup;
    }

    public String getNama_sup() {
        return nama_sup;
    }

    public void setNama_sup(String nama_sup) {
        this.nama_sup = nama_sup;
    }

    public String getAlamat_sup() {
        return alamat_sup;
    }

    public void setAlamat_sup(String alamat_sup) {
        this.alamat_sup = alamat_sup;
    }

    
}
