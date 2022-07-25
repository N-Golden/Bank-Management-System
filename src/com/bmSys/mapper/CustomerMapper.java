package com.bmSys.mapper;

import java.sql.ResultSet;
import com.bmSys.model.CustomerModel;
import java.sql.SQLException;

public class CustomerMapper implements IRowMapper<CustomerModel> {

    @Override
    public CustomerModel mapper(ResultSet rs) {
        try {
            CustomerModel model = new CustomerModel();
            model.setId(rs.getString("id_KH"));
            model.setHoTen(rs.getString("hoTen"));
            model.setSoDT(rs.getString("soDT"));
            model.setEmail(rs.getString("email"));
            return model;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

}
