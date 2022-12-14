/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.teamdev.qlsv.utility;

import com.teamdev.qlsv.model.SinhVien;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dunlok
 */
public class ClassTableModel {
    public DefaultTableModel setTableSinhVien(List<SinhVien> listItem, String[] listColumn) {
        int columns = listColumn.length;
        DefaultTableModel dtm = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 7 ? Boolean.class : String.class;
            }
        };
        dtm.setColumnIdentifiers(listColumn);
        Object[] obj;
        int num = listItem.size();
        SinhVien sinhVien = null;
        for (int i = 0; i < num; i++) {
            sinhVien = listItem.get(i);
            obj = new Object[columns];
            obj[0] = sinhVien.getMaSinhVien();
            obj[1] = (i + 1);
            obj[2] = sinhVien.getHoTen();
            obj[3] = sinhVien.getNgaySinh();
            obj[4] = sinhVien.isGioiTinh() == true ? "Nam" : "Nữ";
            obj[5] = sinhVien.getSoDienThoai();
            obj[6] = sinhVien.getDiaChi();
            obj[7] = sinhVien.isTinhTrang();
            dtm.addRow(obj);
        }
        return dtm;
    }
}
