package com.teamdev.qlsv.dao;

import com.teamdev.qlsv.model.SinhVien;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dunlok
 */
public class SinhVienDAOImpl implements SinhVienDAO {

    @Override
    public List<SinhVien> getList() {
        try {
            Connection con = DBConnect.getConnection();
            String sql = "SELECT * FROM dbo.SinhVien";
            List<SinhVien> list = new ArrayList<>();
            PreparedStatement ps = con.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SinhVien sinhVien = new SinhVien();
                sinhVien.setMaSinhVien(rs.getInt("MaSinhVien"));
                sinhVien.setHoTen(rs.getString("HoTen"));
                sinhVien.setNgaySinh(rs.getDate("NgaySinh"));
                sinhVien.setGioiTinh(rs.getBoolean("GioiTinh"));
                sinhVien.setSoDienThoai(rs.getString("SoDienThoai"));
                sinhVien.setDiaChi(rs.getString("DiaChi"));
                sinhVien.setTinhTrang(rs.getBoolean("TinhTrang"));
                list.add(sinhVien);
            }
            DBConnect.closeConnection(con);
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean insert(SinhVien sinhVien) {
        try {
            Connection cons = DBConnect.getConnection();
            String sql = "INSERT INTO SinhVien(HoTen, NgaySinh, GioiTinh, SoDienThoai, DiaChi, TinhTrang) VALUES(?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setString(1, sinhVien.getHoTen());
            ps.setDate(2, new Date(sinhVien.getNgaySinh().getTime()));
            ps.setBoolean(3, sinhVien.isGioiTinh());
            ps.setString(4, sinhVien.getSoDienThoai());
            ps.setString(5, sinhVien.getDiaChi());
            ps.setBoolean(6, sinhVien.isTinhTrang());
            int result = ps.executeUpdate();
            ps.close();
            cons.close();
            return result > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(SinhVien sinhVien) {
        try {
            Connection cons = DBConnect.getConnection();
            int tinhTrang = sinhVien.isTinhTrang() ? 1 : 0;
            int gioiTinh = sinhVien.isGioiTinh() ? 1 : 0;
            String pattern = "MM/dd/yyyy";


            DateFormat df = new SimpleDateFormat(pattern);

            Date today = new Date(sinhVien.getNgaySinh().getTime());

            String ngaySinh = df.format(today);

            String sql = "UPDATE dbo.SinhVien SET HoTen = N'" + sinhVien.getHoTen() + "', NgaySinh = '" + ngaySinh + "', GioiTinh = " + gioiTinh + ", SoDienThoai = '" + sinhVien.getSoDienThoai() + "', DiaChi = N'" + sinhVien.getDiaChi() + "', TinhTrang = " + tinhTrang + " WHERE MaSinhVien = " + sinhVien.getMaSinhVien() + "";
            PreparedStatement ps = cons.prepareStatement(sql);
            int result = ps.executeUpdate();
            ps.close();
            cons.close();
            return result > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        try {
            Connection cons = DBConnect.getConnection();
            String sql = "DELETE FROM dbo.SinhVien WHERE MaSinhVien = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setInt(1, id);
            int result = ps.executeUpdate();
            ps.close();
            cons.close();
            return result > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
