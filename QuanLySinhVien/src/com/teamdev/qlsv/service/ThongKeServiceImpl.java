/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.teamdev.qlsv.service;

import com.teamdev.qlsv.bean.LopHocBean;
import com.teamdev.qlsv.dao.ThongKeDAO;
import com.teamdev.qlsv.dao.ThongKeDAOImpl;
import java.util.List;

/**
 *
 * @author dunlok
 */
public class ThongKeServiceImpl implements ThongKeService {

    private ThongKeDAO thongKeDAO = null;

    public ThongKeServiceImpl() {
        thongKeDAO = new ThongKeDAOImpl();
    }

    
    @Override
    public List<LopHocBean> getListByLopHoc() {
        return thongKeDAO.getListByLopHoc();
    }

}
