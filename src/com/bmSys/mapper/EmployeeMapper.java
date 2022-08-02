package com.bmSys.mapper;

import com.bmSys.model.EmployeeModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

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
            model.setDiaChi(rs.getString("diaChi"));
            model.setSoDT(rs.getString("soDT"));
            model.setEmail(rs.getString("email"));
            return model;
        } catch (SQLException ex) {
            System.out.print(ex);
        }
        return null;
    }

    @Override
    public Vector<EmployeeModel> mapper(EmployeeModel model) {
         Vector v = new Vector<>();
        v.add(model.getId());
        v.add(model.getHoTen());
        v.add(model.getDiaChi());
        v.add(model.getSoDT());
        v.add(model.getEmail());
        return v;
    }

}
