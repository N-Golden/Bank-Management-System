package com.bmSys.dao;

import java.util.List;
import com.bmSys.mapper.CustomerMapper;
import com.bmSys.model.CustomerModel;

public class CustomerDAO extends AbstractDAO<CustomerModel> {

    public List<CustomerModel> findAll() {
        String sql = "select * from KhachHang";
        return query(sql, new CustomerMapper());
    }

    public CustomerModel findOne() {
        String sql = "select TOP 1 * from KhachHang ORDER BY id_KH DESC";
        return query(sql, new CustomerMapper()).get(0);
    }

    public void saveOne(CustomerModel model) {
        String sql = "Insert into KhachHang values(?, ?, ?, ?, ?, ?, ?)";
        update(sql, model.getId(), model.getHoTen(), model.getDiaChi(), model.getSoDT(), model.isGioiTinh(), model.getNgaySinh(), model.getEmail());
    }

    public void update(CustomerModel model) {
        String sql = "update KhachHang set hoTen=?, diaChi=?, soDT=?, email=? where id_KH=?";
        update(sql, model.getHoTen(), model.getDiaChi(), model.getSoDT(), model.getEmail(), model.getId());
    }

    public void delete(String id) {
        String sql = "DELETE FROM KhachHang WHERE id_KH=?";
        update(sql, id);
    }
}
