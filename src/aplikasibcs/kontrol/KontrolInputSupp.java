/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasibcs.kontrol;

import aplikasibcs.dao.DaoSupplier;
import aplikasibcs.exception.FieldKosongException;
import aplikasibcs.model.Supplier;
import aplikasibcs.view.input.InSupplierFrame;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class KontrolInputSupp {
    InSupplierFrame fr;
    DaoSupplier ds;

    public KontrolInputSupp(InSupplierFrame fr) {
        this.fr = fr;
        ds = new DaoSupplier();
    }
    
    public void cekField() throws FieldKosongException {
        if (fr.getIdF().getText().equals("") || fr.getNmF().getText().equals("")) {
            throw new FieldKosongException();
        }
    }
    
    public void insertSup () throws SQLException, FieldKosongException{
        Supplier s = new Supplier();
        cekField();
        if (fr.getAlmF().getText().equals("")) {
            s.setId_sup(fr.getIdF().getText());
            s.setNama_sup(fr.getNmF().getText());
            ds.insertSup(s);
        } else {
            s.setId_sup(fr.getIdF().getText());
            s.setNama_sup(fr.getNmF().getText());
            s.setAlamat_sup(fr.getAlmF().getText());
            ds.insertSup2(s);
        }
        
    }
    
}
