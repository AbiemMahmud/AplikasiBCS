/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasibcs.kontrol;

import aplikasibcs.dao.DaoBarang;
import aplikasibcs.model.TabelBarang;
import aplikasibcs.view.invetory.InventoryFrame;
import aplikasibcs.view.invetory.ModelCombo;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class KontrolInventory {
    InventoryFrame fr;
    DaoBarang db;

    public KontrolInventory(InventoryFrame fr) {
        this.fr = fr;
        db = new DaoBarang();
    }
    
    public void tampilTabel () throws SQLException {
        TabelBarang tm = new TabelBarang(db.getAll());
        fr.getTb().setModel(tm);
    }
    
    public void setCombo() {
        ModelCombo mc = new ModelCombo();
        fr.getCombo().setModel(mc);
    }
    
    public void tampilCariSup () throws SQLException {
        String n = (String) fr.getCombo().getSelectedItem();
        TabelBarang tm = new TabelBarang(db.cariSup(n));
        fr.getTb().setModel(tm);
    }
}
