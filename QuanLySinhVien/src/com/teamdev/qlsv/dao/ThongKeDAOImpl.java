/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.teamdev.qlsv.dao;

import com.teamdev.qlsv.bean.LopHocBean;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dunlok
 */
public class ThongKeDAOImpl implements ThongKeDAO {

    @Override
    public List<LopHocBean> getListByLopHoc() {
        try {
            Connection con = DBConnect.getConnection();
            String sql = "SELECT NgayDangKy, COUNT(*) AS SoLuong FROM dbo.LopHoc GROUP BY NgayDangKy";
            List<LopHocBean> list = new ArrayList<>();
            PreparedStatement ps = con.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                LopHocBean lopHocBean = new LopHocBean();
                lopHocBean.setNgayDangKy(rs.getString("NgayDangKy"));
                lopHocBean.setSoLuongSinhVien(Integer.parseInt(rs.getString("SoLuong")));
                list.add(lopHocBean);

            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        ThongKeDAO thongKeDAO = new ThongKeDAOImpl();
        System.out.println(thongKeDAO.getListByLopHoc());
    }
}
