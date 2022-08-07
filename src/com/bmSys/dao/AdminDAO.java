/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bmSys.dao;
import com.bmSys.mapper.AdminMapper;
import com.bmSys.model.AdminModel;
import java.util.List;
/**
 *
 * @author Integ
 */
public class AdminDAO extends AbstractDAO<AdminModel>{
    public List<AdminModel> findAll() {
        String sql = "select * from QuanLy";
        return query(sql, new AdminMapper());
    }
    
    public AdminModel findByUsername(String username){
        String sql = "select * from QuanLy where username=?";
        List<AdminModel> list = this.query(sql, new AdminMapper(), username);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    
    public void update(AdminModel model){
        String sql = "update QuanLy set hoTen=?, diaChi=?, soDT=?, linkImg=?, username=?, password=? where id_quanLy=?";
        update(sql, model.getHoTen(), model.getDiaChi(), model.getSoDT(), model.getLinkImg(), model.getUsername(), model.getPassword(), model.getId_quanLy());
    }
}
