/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasibcs.dao;

/**
 *
 * @author admin
 */
public class DaoFunc {

    public static String getInsert(String tabel, String[] kolom) {
        return "INSERT INTO "+tabel+" ("+setKolom(kolom)+") VALUES ("+setFormat(kolom)+")";
    }
    
    private static String setKolom(String[] kolom) {
        String st = "";
        for (int i=0; i<kolom.length;i++) {
            st= st.concat(kolom[i]);
            if (i==kolom.length-1) {
                break;
            }
            st = st.concat(",");
        }
        return st;
    }
    
    private static String setFormat(String[] kolom) {
        String st = "";
        for (int i=0; i<kolom.length;i++) {
            st= st.concat("?");
            if (i==kolom.length-1) {
                break;
            }
            st = st.concat(",");
        }
        return st;
    }
    
}
