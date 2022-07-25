package com.bmSys.dao;

import com.bmSys.mapper.EmployeeMapper;
import com.bmSys.model.EmployeeModel;
import java.util.List;

public class EmployeeDAO extends AbstractDAO<EmployeeModel> {

    public List<EmployeeModel> findAll() {
        String sql = "select * from NhanVien";
        return query(sql, new EmployeeMapper());
    }

}
