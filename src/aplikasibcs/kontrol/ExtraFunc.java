/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasibcs.kontrol;

import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author admin
 */
public class ExtraFunc {
    public static void centerComp (JDesktopPane desk, JInternalFrame inter) {
        Dimension d = desk.getSize(),
                i = inter.getSize();
        
        inter.setLocation((d.width-i.width)/2, (d.height-i.height)/2);
    }
}
