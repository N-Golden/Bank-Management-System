package com.bmSys.dao;

import com.bmSys.mapper.AccountMapper;
import com.bmSys.model.AccountModel;
import java.util.List;

public class AccountDAO extends AbstractDAO<AccountModel> {

    public void save(AccountModel model) {
        String sql = "insert into TaiKhoan values(?, ?, ?, ?, ?)";
        update(sql, model.getSoTK(), model.getSoDuTK(), model.getLoaiTK(), model.getId_KH(), model.getEmail());
    }

    public AccountModel findOne(String soTK) {
        String sql = "select tk.*, kh.hoTen from TaiKhoan tk join KhachHang kh ON tk.id_KH = kh.id_KH where tk.soTK= ?";
        List<AccountModel> results = query(sql, new AccountMapper(), soTK);
        return results.size() != 0 ? results.get(0) : null;
    }

    public AccountModel findByIdKH(String idKH) {
        String sql = "select * from TaiKhoan where id_KH=?";
        return query(sql, new AccountMapper(), idKH).get(0);
    }

    public void deleteByIdKH(String id) {
        String sql = "delete from TaiKhoan where id_KH=?";
        update(sql, id);
    }

    public void updateMoney(String soTK, float money, String type) {
        String sql = "{call Bank_Account_UpdateMoney(?, ?, ?)}";
        update(sql, soTK, money, type);
    }

}
