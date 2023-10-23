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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class DaoBarang {
    Connection c;
    
    final String INSERT = "INSERT INTO barang (id_barang,nama_barang,jumlah_barang,harga_barang,id_supplier)"
            + "VALUES (?,?,?,?,?)";
    final String SELECTALL = "SELECT b.id_barang, b.nama_barang, b.jumlah_barang,"
            + "b.harga_barang, s.nama_supplier FROM barang AS b LEFT JOIN supplier AS s "
            + "ON b.id_supplier=s.id_supplier";
    final String SELECTSUP = "SELECT b.id_barang, b.nama_barang, b.jumlah_barang,"
            + "b.harga_barang, s.nama_supplier FROM barang AS b LEFT JOIN supplier AS s "
            + "ON b.id_supplier=s.id_supplier WHERE s.nama_supplier=?";

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
    
    public List<Barang> getAll() throws SQLException {
        List<Barang> lb = new ArrayList<>();
        PreparedStatement ps = c.prepareStatement(SELECTALL);
        ResultSet rs = ps.executeQuery();
        String id, nama, sup;
        int jumlah, harga;
        
        while (rs.next()) {
            id = rs.getString("id_barang");
            nama = rs.getString("nama_barang");
            jumlah = rs.getInt("jumlah_barang");
            harga = rs.getInt("harga_barang");
            sup = rs.getString("nama_supplier");
            lb.add(new Barang(id, nama, jumlah, harga, sup));
        }
        
        return lb;
    }
    
    public List<Barang> cariSup(String n) throws SQLException {
        List<Barang> lb = new ArrayList<>();
        PreparedStatement ps = c.prepareStatement(SELECTSUP);
        ps.setString(1, n);
        
        ResultSet rs = ps.executeQuery();
        String id, nama, sup;
        int jumlah, harga;
        
        while (rs.next()) {
            id = rs.getString("id_barang");
            nama = rs.getString("nama_barang");
            jumlah = rs.getInt("jumlah_barang");
            harga = rs.getInt("harga_barang");
            sup = rs.getString("nama_supplier");
            lb.add(new Barang(id, nama, jumlah, harga, sup));
        }
        
        return lb;
    }
}