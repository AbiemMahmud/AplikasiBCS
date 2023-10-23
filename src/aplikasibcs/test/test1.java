/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasibcs.test;

import aplikasibcs.dao.DaoBarang;
import aplikasibcs.model.Barang;
import aplikasibcs.model.TabelBarang;
import aplikasibcs.view.invetory.InventoryFrame;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class test1 {
    public static void main(String[] args) {
        InventoryFrame fr = new InventoryFrame();
        DaoBarang db = new DaoBarang();
        try {
            //        System.out.println(fr.getCombo().getSelectedItem().getClass());
            TabelBarang tm = new TabelBarang(db.cariSup(fr.getCombo().getSelectedItem().toString()));
            List<Barang> a = db.getAll();
            System.out.println(a);
        } catch (SQLException ex) {
            Logger.getLogger(test1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
//        System.out.println(a);
    }
}
