package com.bmSys.mapper;

import com.bmSys.model.TransactionModel;
import java.sql.ResultSet;
import java.util.Vector;

/**
 *
 * @author Admin
 */
public class TransactionMapper implements IRowMapper<TransactionModel> {

    @Override
    public TransactionModel mapper(ResultSet rs) {
        try {
            TransactionModel model = new TransactionModel();
            model.setId(rs.getInt("id_giaoDich"));
            model.setNgayGd(rs.getTimestamp("ngayGiaoDich"));
            model.setSoTien(rs.getFloat("soTien"));
            model.setNoiDung(rs.getString("noiDung"));
            model.setNameTypeTrans(rs.getString("ten"));
            model.setSoTK(rs.getString("soTK"));
            model.setId_NV(rs.getString("id_nhanVien"));
            return model;
        } catch (Exception ex) {
            System.out.print(ex);
        }
        return null;
    }

    @Override
    public Vector mapper(TransactionModel model) {
        Vector v = new Vector<>();
        v.add(model.getId());
        v.add(model.getSoTK());
        v.add(model.getNgayGd());
        v.add(model.getNoiDung());
        v.add(model.getNameTypeTrans());
        v.add(model.getSoTien());
        v.add(model.getId_NV());
        return v;
    }

}
