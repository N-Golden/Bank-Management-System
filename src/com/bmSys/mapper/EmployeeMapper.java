package com.bmSys.mapper;

import com.bmSys.model.EmployeeModel;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeMapper implements IRowMapper<EmployeeModel> {

    @Override
    public EmployeeModel mapper(ResultSet rs) {
        try {
            EmployeeModel model = new EmployeeModel();
            model.setUsername(rs.getString("username"));
            model.setPassword(rs.getString("password"));
            model.setId(rs.getString("id_nhanVien"));
            model.setLinkImg(rs.getString("linkImg"));
            model.setHoTen(rs.getString("hoTen"));
            return model;
        } catch (SQLException ex) {
            System.out.print(ex);
        }
        return null;
    }

}
