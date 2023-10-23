/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasibcs.kontrol;

import aplikasibcs.dao.DaoBarang;
import aplikasibcs.exception.FieldKosongException;
import aplikasibcs.model.Barang;
import aplikasibcs.view.input.InBarangFrame;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class KontrolInputBarang {
    InBarangFrame fr;
    DaoBarang db;

    public KontrolInputBarang(InBarangFrame fr) {
        this.fr = fr;
        db = new DaoBarang();
    }
    
//    Fungsi untuk cek apakah field yang diisi valid
    public void cekField() throws FieldKosongException{
        if (fr.getJumlahF().getText().equals("")){
            fr.getJumlahF().setText("0");
        }
        if (fr.getKodeF().getText().equals("")||fr.getNamaF().getText().equals("")||fr.getHargaF().getText().equals("")
                ||fr.getIdSupF().getText().equals("")) {
           throw new FieldKosongException();
        }
    }
    
    public void inputBrg () throws SQLException, FieldKosongException {
        cekField();
        Barang b = new Barang();
        b.setId_brg(fr.getKodeF().getText());
        b.setNama_brg(fr.getNamaF().getText());
        b.setHarga_brg(Integer.valueOf(fr.getHargaF().getText()));
        b.setJumlah_brg(Integer.valueOf(fr.getJumlahF().getText()));
        b.setId_sup(fr.getIdSupF().getText());
        db.insertBrg(b);
    }
    
//    Fungsi untuk mereset field
    public void reset(){
        fr.getNamaF().setText("");
        fr.getKodeF().setText("");
        fr.getHargaF().setText("");
        fr.getJumlahF().setText("");
        fr.getIdSupF().setText("");
    }
}
