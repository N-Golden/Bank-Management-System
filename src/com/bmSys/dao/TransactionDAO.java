
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
        update(sql, model.getNgayGd(), model.getSoTien(), model.getNoiDung(), model.getSoTK_nguoiNhan(), model.getId_NV(),model.getLoaiGD(), model.getSoTK());
    }
    
    public List<TransactionModel> findList(Date... day ){
        String sql;
        if(day.length == 0){
               sql ="{call Bank_Transaction_GetList()}";
                return query(sql, new TransactionMapper());
        }else{
               sql="{call Bank_Transaction_GetList(?, ?)}";
               return query(sql, new TransactionMapper(), day[0], day[1]);
        }
        
    }
}
