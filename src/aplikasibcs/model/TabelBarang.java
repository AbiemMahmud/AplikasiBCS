/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasibcs.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author admin
 */
public class TabelBarang extends AbstractTableModel{
    private List<Barang> lb;
    
    public TabelBarang (List<Barang> lb) {
        this.lb = lb;
    }

    @Override
    public int getRowCount() {
        return this.lb.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }
    
    @Override
    public String getColumnName (int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "Nama";
            case 2:
                return "Jumlah";
            case 3:
                return "Harga";
            case 4:
                return "Supplier";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return lb.get(rowIndex).getId_brg();
            case 1:
                return lb.get(rowIndex).getNama_brg();
            case 2:
                return lb.get(rowIndex).getJumlah_brg();
            case 3:
                return lb.get(rowIndex).getHarga_brg();
            case 4:
                return lb.get(rowIndex).getId_sup();
            default:
                return null;
        }
    }
    
}
