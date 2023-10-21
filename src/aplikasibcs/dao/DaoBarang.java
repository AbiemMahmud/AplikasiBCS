/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasibcs.dao;

import aplikasibcs.koneksi.Koneksi;
import aplikasibcs.model.Barang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class DaoBarang {
    Connection c;
    
    final String INSERT = "INSERT INTO barang (id_barang,nama_barang,jumlah_barang,harga_barang,id_supplier)"
            + "VALUES (?,?,?,?,?)";

    public DaoBarang() {
        this.c = Koneksi.buatKoneksi();
    }
    
    public void insertBrg (Barang b) throws SQLException {
        PreparedStatement ps = c.prepareStatement(INSERT);
        ps.setString(1, b.getId_brg());
        ps.setString(2, b.getNama_brg());
        ps.setInt(3, b.getJumlah_brg());
        ps.setInt(4, b.getHarga_brg());
        ps.setString(5, b.getId_sup());            
        
        ps.executeUpdate();
    }
}