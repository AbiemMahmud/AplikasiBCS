/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasibcs.kontrol;

import aplikasibcs.view.input.InBarangFrame;
import aplikasibcs.view.input.InCustomerFrame;
import aplikasibcs.view.MainFrame;
import aplikasibcs.view.input.InSupplierFrame;

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
        ExtraFunc.centerComp(mf.getDesk(), fr);
    }
    
    public void tampilInCust(){
        InCustomerFrame fr = new InCustomerFrame();
        mf.getDesk().add(fr);
        fr.setVisible(true);
        ExtraFunc.centerComp(mf.getDesk(), fr);
    }
    
    public void tampilInSupp () {
        InSupplierFrame fr = new InSupplierFrame();
        mf.getDesk().add(fr);
        fr.setVisible(true);
        ExtraFunc.centerComp(mf.getDesk(), fr);
    }
}
