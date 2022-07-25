package com.bmSys.dao;

import com.bmSys.mapper.EmployeeMapper;
import com.bmSys.model.EmployeeModel;
import java.util.Date;
import java.util.List;

public class EmployeeDAO extends AbstractDAO<EmployeeModel> {

    public List<EmployeeModel> findAll() {
        String sql = "select * from NhanVien";
        return query(sql, new EmployeeMapper());
    }
    
    public  void updateLastLogin(Date lastLogin, String id){
        String sql = "update  NhanVien set lastLogin = ? where id_nhanVien=?";
        update(sql, lastLogin, id );
    }
}
