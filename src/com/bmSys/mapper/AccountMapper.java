package com.bmSys.mapper;

import com.bmSys.model.AccountModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class AccountMapper implements IRowMapper<AccountModel> {

    @Override
    public AccountModel mapper(ResultSet rs) {
        try {
            AccountModel model = new AccountModel();
            model.setSoTK(rs.getString("soTK"));
            model.setSoDuTK(Float.valueOf(rs.getString("soDuTK")));
            model.setLoaiTK(rs.getString("loaiTK"));
            model.setId_KH(rs.getString("id_KH"));
            try {
                model.setTenKH(rs.getString("hoTen"));
                model.setEmail(rs.getString("email"));
            } catch (Exception e) {

            }
            return model;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    @Override
    public Vector<AccountModel> mapper(AccountModel model) {
        return null;
    }

}
