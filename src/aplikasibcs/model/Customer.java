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
public class Customer {
    private String id_cust, nama_cust;

    public Customer() {}
    
    public Customer(String id_cust, String nama_cust) {
        this.id_cust = id_cust;
        this.nama_cust = nama_cust;
    }

//    Getter and Setter
    public String getId_cust() {
        return id_cust;
    }

    public void setId_cust(String id_cust) {
        this.id_cust = id_cust;
    }

    public String getNama_cust() {
        return nama_cust;
    }

    public void setNama_cust(String nama_cust) {
        this.nama_cust = nama_cust;
    }
    
    
}
