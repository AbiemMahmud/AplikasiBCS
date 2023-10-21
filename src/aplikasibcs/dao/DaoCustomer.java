/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasibcs.dao;

import aplikasibcs.koneksi.Koneksi;
import aplikasibcs.model.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class DaoCustomer {
    Connection con;
    final String INSERT = "INSERT INTO customer (id_customer, nama_customer) VALUES (?,?)";
    
    public DaoCustomer() {
        con = Koneksi.buatKoneksi();
    }
    public void insertCust(Customer c) throws SQLException {
        PreparedStatement ps = con.prepareStatement(INSERT);
        ps.setString(1, c.getId_cust());
        ps.setString(2, c.getNama_cust());
        ps.execute();
    }
}
