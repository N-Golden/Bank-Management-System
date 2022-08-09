
package com.bmSys.mapper;

import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public interface IRowMapper<T> {
       T  mapper(ResultSet rs);
      
     
       Vector<T> mapper(T model);
}
