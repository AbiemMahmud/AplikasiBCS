/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasibcs.dao;

import aplikasibcs.koneksi.Koneksi;
import aplikasibcs.model.Supplier;
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
public class DaoSupplier {
    Connection con;
    final String INSERT;
    final String SELECTN = "SELECT nama_supplier FROM supplier";

    
    public DaoSupplier() {
        String tabel = "supplier";
        String[] kl = {"id_supplier","nama_supplier", "alamat_supplier"};
        this.INSERT = DaoFunc.getInsert(tabel, kl);
        con = Koneksi.buatKoneksi();
    }
    
    public void insertSup(Supplier s) throws SQLException {
        PreparedStatement ps = con.prepareStatement(INSERT);
        ps.setString(1, s.getId_sup());
        ps.setString(2, s.getNama_sup());
        ps.setString(3, null);
        
        ps.execute();
    }
    
//    Overflow untuk insert data yang tidak wajib
    public void insertSup2(Supplier s) throws SQLException {
        PreparedStatement ps = con.prepareStatement(INSERT);
        ps.setString(1, s.getId_sup());
        ps.setString(2, s.getNama_sup());
        ps.setString(3, s.getAlamat_sup());
        
        ps.execute();
    }
}
