/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bmSys.mapper;
import com.bmSys.model.AdminModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
/**
 *
 * @author Integ
 */
public class AdminMapper implements  IRowMapper<AdminModel> {
    @Override
    public AdminModel mapper(ResultSet rs) {
        try {
            AdminModel model = new AdminModel();
            model.setId_quanLy(rs.getString("id_quanLy"));
            model.setHoTen(rs.getString("hoTen"));
            model.setSoDT(rs.getString("soDT"));
            model.setDiaChi(rs.getString("diaChi"));
            model.setUsername(rs.getString("username"));
            model.setPassword(rs.getString("password"));
            model.setLinkImg(rs.getString("linkImg"));
            return model;
        } catch (SQLException ex) {
            System.out.print(ex);
        }
        return null;
    }

    @Override
    public Vector<AdminModel> mapper(AdminModel model) {
        return null;
    }
}
