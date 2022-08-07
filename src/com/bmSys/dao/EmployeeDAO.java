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

    public void updateLastLogin(Date lastLogin, String id) {
        String sql = "update  NhanVien set lastLogin = ? where id_nhanVien=?";
        update(sql, lastLogin, id);
    }

    public void saveOne(EmployeeModel model) {
        String sql = "Insert into NhanVien values(?, ?, ?, ?, ? ,?, ?, ?, ?, ?)";
        update(sql, model.getId(), model.getHoTen(), model.getDiaChi(), model.getSoDT(),model.getLinkImg(),
                 model.getNgaySinh(), model.getEmail(), model.getUsername(), model.getPassword(), new Date());
    }

    public EmployeeModel findOne() {
        String sql = "select TOP 1 * from NhanVien ORDER BY id_nhanVien DESC";
        return query(sql, new EmployeeMapper()).get(0);
    }
    
    public EmployeeModel findByUsername(String username){
        String sql = "select * from NhanVien where username=?";
        List<EmployeeModel> list = this.query(sql, new EmployeeMapper(), username);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    
    public void update(EmployeeModel model){
        String sql = "update NhanVien set hoTen=?, diaChi=?, soDT=?, email=?, password=? where id_nhanVien=?";
        update(sql, model.getHoTen(), model.getDiaChi(), model.getSoDT(), model.getEmail(),model.getPassword(), model.getId());
    }
}
