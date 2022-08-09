package com.bmSys.mapper;

import com.bmSys.dao.CustomerDAO;
import java.sql.ResultSet;
import com.bmSys.model.CustomerModel;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class CustomerMapper implements IRowMapper<CustomerModel> {

    @Override
    public CustomerModel mapper(ResultSet rs) {
        try {
            CustomerModel model = new CustomerModel();
            model.setId(rs.getString("id_KH"));
            model.setHoTen(rs.getString("hoTen"));
            model.setSoDT(rs.getString("soDT"));
            model.setEmail(rs.getString("email"));
            model.setDiaChi(rs.getString("diaChi"));
            return model;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    @Override
    public Vector<CustomerModel> mapper(CustomerModel model) {
        Vector v = new Vector<>();
        v.add(model.getId());
        v.add(model.getHoTen());
        v.add(model.getDiaChi());
        v.add(model.getSoDT());
        v.add(model.getEmail());
        return v;
    }


}
