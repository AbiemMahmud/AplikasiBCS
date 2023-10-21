/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasibcs.kontrol;

import aplikasibcs.view.InBarangFrame;
import aplikasibcs.view.InCustomerFrame;
import aplikasibcs.view.MainFrame;

/**
 *
 * @author admin
 */
public class KontrolMain {
    MainFrame mf;

    public KontrolMain(MainFrame mf) {
        this.mf = mf;
    }
    
    public void tampilInBarang () {
        InBarangFrame fr = new InBarangFrame();
        mf.getDesk().add(fr);
        fr.setVisible(true);
    }
    
    public void tampilInCust(){
        InCustomerFrame fr = new InCustomerFrame();
        mf.getDesk().add(fr);
        fr.setVisible(true);
    }
}
