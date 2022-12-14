/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.teamdev.qlsv.service;

import com.teamdev.qlsv.model.SinhVien;
import java.util.List;

/**
 *
 * @author dunlok
 */
public interface SinhVienService {

    public List<SinhVien> getList();

    public boolean insert(SinhVien sinhVien);

    public boolean update(SinhVien sinhVien);

    public boolean delete(int id);

}
