package com.bmSys.dao;

import com.bmSys.mapper.TransactionMapper;
import com.bmSys.model.TransactionModel;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Admin
 */
public class TransactionDAO extends AbstractDAO<TransactionModel> {

    public void save(TransactionModel model) {
        String sql = "insert into GiaoDich values(?, ?, ?, ?, ?, ?, ?)";
        update(sql, model.getNgayGd(), model.getSoTien(), model.getNoiDung(), model.getSoTK_nguoiNhan(), model.getId_NV(), model.getLoaiGD(), model.getSoTK());
    }

    public List<TransactionModel> findList(String soTK, Date... day) {
        String sql = "{call Bank_Transaction_GetList(?, ?, ?)}";
        return query(sql, new TransactionMapper(), day[0], day[1], soTK);

    }

    public List<TransactionModel> findById(String id) {
        String sql = "select gd.*, lgd.ten from GiaoDich gd join loaiGD lgd on gd.loaiGD = lgd.id_loaiGD  where gd.soTK = ?";
        return query(sql, new TransactionMapper(), id);
    }

    public List<TransactionModel> findAll() {
        String sql = "select * from GiaoDich gd join loaiGD lgd on gd.loaiGD = lgd.id_loaiGD";
        return query(sql, new TransactionMapper());
    }

    public List<TransactionModel> findMany(String id, Date day, String type) {
        String sql = "{call Bank_Transaction_GetMany(?, ?, ?)}";
        if (id.length() == 0) {
            id = "";
        }
        if (type.equals("All")) {
            type = "";
        }
        if (day == null) {
            return query(sql, new TransactionMapper(), id, "", type);
        } else {
            return query(sql, new TransactionMapper(), id, day, type);
        }
    }

    public void deleteBySoTK(String soTK) {
        String sql = "delete from GIaoDich where soTK=?";
        update(sql, soTK);
    }
}
