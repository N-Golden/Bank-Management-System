
package com.bmSys.mapper;

import java.sql.ResultSet;
import java.util.Vector;

public interface IRowMapper<T> {
       T  mapper(ResultSet rs);
       
       Vector<T> mapper(T model);
}
