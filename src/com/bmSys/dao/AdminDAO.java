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
}
