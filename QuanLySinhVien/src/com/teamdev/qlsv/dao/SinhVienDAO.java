/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.teamdev.qlsv.dao;

import com.teamdev.qlsv.model.SinhVien;
import java.util.List;

/**
 *
 * @author dunlok
 */
public interface SinhVienDAO {

    public List<SinhVien> getList();

    public boolean insert(SinhVien sinhVien);

    public boolean update(SinhVien sinhVien);
    public boolean delete(int id);

}
