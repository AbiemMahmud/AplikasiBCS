/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasibcs.kontrol;

import aplikasibcs.dao.DaoCustomer;
import aplikasibcs.exception.FieldKosongException;
import aplikasibcs.model.Customer;
import aplikasibcs.view.input.InCustomerFrame;
import java.sql.SQLException;

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
    
    public void cekField() throws FieldKosongException{
        if (fr.getIdCustF().getText().equals("")||fr.getNamaCustF().getText().equals("")) {
            throw new FieldKosongException();
        }
    }
    
    public void input() throws SQLException, FieldKosongException {
        cekField();
        Customer c = new Customer();
        c.setId_cust(fr.getIdCustF().getText());
        c.setNama_cust(fr.getNamaCustF().getText());
        dc.insertCust(c);
    }
}
