/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.teamdev.qlsv.service;

import com.teamdev.qlsv.dao.SinhVienDAO;
import com.teamdev.qlsv.dao.SinhVienDAOImpl;
import com.teamdev.qlsv.model.SinhVien;
import java.util.List;

/**
 *
 * @author dunlok
 */
public class SinhVienServiceImpl implements SinhVienService {

    private SinhVienDAO sinhVienDAO = null;

    public SinhVienServiceImpl() {
        sinhVienDAO = new SinhVienDAOImpl();
    }

    @Override
    public List<SinhVien> getList() {
        return sinhVienDAO.getList();
    }

    @Override
    public boolean insert(SinhVien sinhVien) {
        return sinhVienDAO.insert(sinhVien);
    }

    @Override
    public boolean update(SinhVien sinhVien) {
        return sinhVienDAO.update(sinhVien);
    }

    @Override
    public boolean delete(int id) {
        return sinhVienDAO.delete(id);
    }

}
