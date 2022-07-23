
package com.bmSys.mapper;

import java.sql.ResultSet;

public interface IRowMapper<T> {
       T  mapper(ResultSet rs);
}
