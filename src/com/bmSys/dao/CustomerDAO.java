package com.bmSys.dao;

import java.util.List;
import com.bmSys.mapper.CustomerMapper;
import com.bmSys.model.CustomerModel;

public class CustomerDAO extends AbstractDAO<CustomerModel> {

    public List<CustomerModel> findAll() {
        String sql = "select * from KhachHang";
        return query(sql, new CustomerMapper());
    }
    
    public void update(){
       String sql = "";
       update(sql);
    }
}
