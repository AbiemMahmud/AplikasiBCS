/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasibcs.kontrol;

import aplikasibcs.view.InCustomerFrame;

/**
 *
 * @author admin
 */
public class KontrolInputCust {
    InCustomerFrame fr;
    
    public KontrolInputCust(InCustomerFrame fr){
        this.fr = fr;
    }
    
    public boolean cekField(){
        return !(fr.getIdCustF().getText().equals("")||fr.getNamaCustF().getText().equals(""));
    }
    
    public void cekField2() {
        NullPointerException e = null;
        if (fr.getIdCustF().getText().equals("")||fr.getNamaCustF().getText().equals("")) {
            throw (e);
        }
    }
    
    public void input() {
        fr.getIdCustF();
    }
}
