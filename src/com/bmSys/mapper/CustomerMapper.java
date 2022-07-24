
package com.bmSys.mapper;

import java.sql.ResultSet;
import com.bmSys.model.CustomerModel;


public class CustomerMapper implements IRowMapper<CustomerModel>{

    @Override
    public CustomerModel mapper(ResultSet rs) {
            CustomerModel model = new CustomerModel();
            return null;
    }
    
}
