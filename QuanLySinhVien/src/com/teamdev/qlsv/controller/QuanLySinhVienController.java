/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.teamdev.qlsv.controller;

import com.teamdev.qlsv.model.SinhVien;
import com.teamdev.qlsv.service.SinhVienService;
import com.teamdev.qlsv.service.SinhVienServiceImpl;
import com.teamdev.qlsv.utility.ClassTableModel;
import com.teamdev.qlsv.utility.MyAction;
import com.teamdev.qlsv.view.SinhVienJFrame;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author dunlok
 */
public class QuanLySinhVienController {

    private JPanel jpnView;
    private JButton btnAdd;
    private JButton btnDelete;

    private JTextField jtfSearch;
    private int idDelete;
    private List<SinhVien> listItem = null;
    private SinhVien sinhVien = null;

    private ClassTableModel classTableModel = null;

    private final String[] COLUMNS = {"Mã sinh viên", "STT", "Tên sinh viên", "Ngày sinh",
        "Giới tính", "Số điện thoại", "Địa chỉ", "Trạng thái"};

    private SinhVienService sinhVienService = null;

    private TableRowSorter<TableModel> rowSorter = null;

    public QuanLySinhVienController(JPanel jpnView, JButton btnAdd, JButton btnDelete, JTextField jtfSearch) {
        this.jpnView = jpnView;
        this.btnAdd = btnAdd;
        this.btnDelete = btnDelete;
        this.jtfSearch = jtfSearch;
        this.classTableModel = new ClassTableModel();
        this.sinhVienService = new SinhVienServiceImpl();
        this.sinhVien = new SinhVien();
    }

    public void setDataToTable() {
        this.listItem = sinhVienService.getList();
        DefaultTableModel model = classTableModel.setTableSinhVien(listItem, COLUMNS);
        JTable table = new JTable(model);

        rowSorter = new TableRowSorter<>(table.getModel());
        table.setRowSorter(rowSorter);

        jtfSearch.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = jtfSearch.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = jtfSearch.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });

        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                int selectedRowIndex = table.getSelectedRow();
                System.out.println("Table get selected row: " + selectedRowIndex);
                selectedRowIndex = table.convertRowIndexToModel(selectedRowIndex);
                System.out.println("Index seleted: " + selectedRowIndex);
                sinhVien.setMaSinhVien((int) model.getValueAt(selectedRowIndex, 0));
                sinhVien.setHoTen(model.getValueAt(selectedRowIndex, 2).toString());
                sinhVien.setNgaySinh((Date) model.getValueAt(selectedRowIndex, 3));
                sinhVien.setGioiTinh(model.getValueAt(selectedRowIndex, 4).toString().equalsIgnoreCase("Nam"));
                sinhVien.setSoDienThoai(model.getValueAt(selectedRowIndex, 5).toString());
                sinhVien.setDiaChi(model.getValueAt(selectedRowIndex, 6).toString());
                sinhVien.setTinhTrang((boolean) model.getValueAt(selectedRowIndex, 7));

                if (e.getClickCount() == 2 && table.getSelectedRow() != -1) {
                    // Handle update
                    System.out.println("ID update: " + sinhVien.getMaSinhVien());
                    SinhVienJFrame frame = new SinhVienJFrame(sinhVien, new MyAction() {
                        @Override
                        public void ReLoadTable(boolean changed) {
                            if (changed) {
                                setDataToTable();
                            }
                        }
                    });
                    frame.setTitle("Thông tin sinh viên");
                    frame.setResizable(false);
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                }
            }
        });

        // design
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        table.getTableHeader().setPreferredSize(new Dimension(100, 50));
        table.setRowHeight(50);
        table.validate();
        table.repaint();

        // 
        table.getColumnModel().getColumn(0).setMaxWidth(120);
        table.getColumnModel().getColumn(0).setMinWidth(120);
        table.getColumnModel().getColumn(0).setPreferredWidth(120);

        table.getColumnModel().getColumn(1).setMaxWidth(60);
        table.getColumnModel().getColumn(1).setMinWidth(60);
        table.getColumnModel().getColumn(1).setPreferredWidth(60);

        table.getColumnModel().getColumn(2).setMaxWidth(150);
        table.getColumnModel().getColumn(2).setMinWidth(150);
        table.getColumnModel().getColumn(2).setPreferredWidth(150);

        table.getColumnModel().getColumn(3).setMaxWidth(100);
        table.getColumnModel().getColumn(3).setMinWidth(100);
        table.getColumnModel().getColumn(3).setPreferredWidth(100);

        table.getColumnModel().getColumn(4).setMaxWidth(80);
        table.getColumnModel().getColumn(4).setMinWidth(80);
        table.getColumnModel().getColumn(4).setPreferredWidth(80);

        table.getColumnModel().getColumn(5).setMaxWidth(120);
        table.getColumnModel().getColumn(5).setMinWidth(120);
        table.getColumnModel().getColumn(5).setPreferredWidth(120);

        table.getColumnModel().getColumn(6).setMaxWidth(180);
        table.getColumnModel().getColumn(6).setMinWidth(180);
        table.getColumnModel().getColumn(6).setPreferredWidth(180);

        JScrollPane scroll = new JScrollPane();
        scroll.getViewport().add(table);
        scroll.setPreferredSize(new Dimension(1350, 450));
        jpnView.removeAll();
        jpnView.setLayout(new CardLayout());
        jpnView.add(scroll);
        jpnView.validate();
        jpnView.repaint();
    }

    private boolean showDialog() {
        int dialogResult = JOptionPane.showConfirmDialog(null,
                "Bạn muốn xoá dữ liệu hay không?", "Thông báo", JOptionPane.YES_NO_OPTION);
        return dialogResult == JOptionPane.YES_OPTION;
    }

    public void setEvent() {
        btnAdd.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SinhVienJFrame frame = new SinhVienJFrame(new SinhVien(), new MyAction() {
                    @Override
                    public void ReLoadTable(boolean changed) {
                        if (changed) {
                            setDataToTable();
                        }
                    }
                });
                frame.setTitle("Thông tin sinh viên");
                frame.setResizable(false);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnAdd.setBackground(new Color(0, 200, 83));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnAdd.setBackground(new Color(76, 175, 80));
            }
        });
        btnDelete.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Handle delete click - Id: " + sinhVien.getMaSinhVien());
                if (showDialog()) {
                    sinhVienService.delete(sinhVien.getMaSinhVien());
                    setDataToTable();
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnDelete.setBackground(new Color(226, 0, 0));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnDelete.setBackground(new Color(255, 0, 0));
            }
        });
    }
}
