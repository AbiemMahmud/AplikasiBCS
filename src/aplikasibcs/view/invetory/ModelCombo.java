/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasibcs.view.invetory;

import aplikasibcs.koneksi.Koneksi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

/**
 *
 * @author admin
 */
public class ModelCombo implements ComboBoxModel{
    private String selected;
    private final List<String> model;
    private final List<ListDataListener> listeners;
    
    public ModelCombo () {
        this.model = getNama();
        this.selected = model.get(0);
        this.listeners = new ArrayList<>();
    }

    @Override
    public void setSelectedItem(Object anItem) {
        if (model.contains(anItem)) {
            selected = (String) anItem;
            // Notify listeners that the selected item has changed
            for (ListDataListener listener : listeners) {
                listener.contentsChanged(new ListDataEvent(this, ListDataEvent.CONTENTS_CHANGED, -1, -1));
            }
        }
    }

    @Override
    public Object getSelectedItem() {
        return selected;
    }

    @Override
    public int getSize() {
        return model.size();
    }

    @Override
    public Object getElementAt(int index) {
        return model.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        listeners.add(l);
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        listeners.remove(l);
    }
    
    public List<String> getNama() {
        List<String> nama = new ArrayList<>();
        try {
            PreparedStatement ps = Koneksi.buatKoneksi().prepareStatement("SELECT nama_supplier FROM supplier");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                nama.add(rs.getString("nama_supplier"));
            }
        } catch (SQLException s) {
            System.out.println(s);
        }
        return nama;
    }
}
