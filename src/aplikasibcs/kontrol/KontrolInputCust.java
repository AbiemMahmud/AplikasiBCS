/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasibcs.kontrol;

import aplikasibcs.dao.DaoCustomer;
import aplikasibcs.model.Customer;
import aplikasibcs.view.InCustomerFrame;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.InputMismatchException;

/**
 *
 * @author admin
 */
public class KontrolInputCust {
    InCustomerFrame fr;
    DaoCustomer dc;
    
    public KontrolInputCust(InCustomerFrame fr){
        this.fr = fr;
        this.dc = new DaoCustomer();
    }
    
    public boolean cekField(){
        return !(fr.getIdCustF().getText().equals("")||fr.getNamaCustF().getText().equals(""));
    }
    
    public void cekField2() throws InputMismatchException{
        if (fr.getIdCustF().getText().equals("")||fr.getNamaCustF().getText().equals("")) {
            throw new InputMismatchException();
        }
    }
    
    public void input() throws SQLException {
        cekField2();
        Customer c = new Customer();
        c.setId_cust(fr.getIdCustF().getText());
        c.setNama_cust(fr.getNamaCustF().getText());
        dc.insertCust(c);
    }
}
