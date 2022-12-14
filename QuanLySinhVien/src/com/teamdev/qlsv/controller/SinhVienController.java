/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.teamdev.qlsv.controller;

import com.teamdev.qlsv.model.SinhVien;
import com.teamdev.qlsv.service.SinhVienService;
import com.teamdev.qlsv.service.SinhVienServiceImpl;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author dunlok
 */
public class SinhVienController {

    private JButton btnSubmit;
    private JTextField jtfMaSinhVien;
    private JTextField jtfHoTen;
    private JDateChooser jdcNgaySinh;
    private JRadioButton jrdNam;
    private JRadioButton jrdNu;
    private JTextField jtfSoDienThoai;
    private JTextArea jtaDiaChi;
    private JCheckBox jcbTinhTrang;
    private SinhVien sinhVien = null;
    private JLabel jlbMSg;
    private SinhVienService sinhVienService = null;

    public SinhVienController(JButton btnSubmit, JTextField jtfMaSinhVien, JTextField jtfHoTen, JDateChooser jdcNgaySinh, JRadioButton jrdNam, JRadioButton jrdNu, JTextField jtfSoDienThoai, JTextArea jtaDiaChi, JCheckBox jcbTinhTrang, JLabel jlbMSg) {
        this.btnSubmit = btnSubmit;
        this.jtfMaSinhVien = jtfMaSinhVien;
        this.jtfHoTen = jtfHoTen;
        this.jdcNgaySinh = jdcNgaySinh;
        this.jrdNam = jrdNam;
        this.jrdNu = jrdNu;
        this.jtfSoDienThoai = jtfSoDienThoai;
        this.jtaDiaChi = jtaDiaChi;
        this.jcbTinhTrang = jcbTinhTrang;
        this.jlbMSg = jlbMSg;
        this.sinhVienService = new SinhVienServiceImpl();
    }

    public void setView(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
        jtfMaSinhVien.setText(String.valueOf(sinhVien.getMaSinhVien()));
        jtfHoTen.setText(sinhVien.getHoTen());
        jdcNgaySinh.setDate(sinhVien.getNgaySinh());
        if (sinhVien.isGioiTinh()) {
            jrdNam.setSelected(true);
            jrdNu.setSelected(false);
        } else {
            jrdNam.setSelected(false);
            jrdNu.setSelected(true);
        }
        jtfSoDienThoai.setText(sinhVien.getSoDienThoai());
        jtaDiaChi.setText(sinhVien.getDiaChi());
        jcbTinhTrang.setSelected(sinhVien.isTinhTrang());
    }
}
