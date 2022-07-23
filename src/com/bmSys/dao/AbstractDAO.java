package com.bmSys.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.bmSys.mapper.IRowMapper;

public class AbstractDAO<T> {

    String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String url = "jdbc:sqlserver://localhost:1433;databaseName=BankingSys;integratedSecurity=true";
    String username = "nguyenchodien";
    String password = "123";

    public Connection getConnection() {
        try {
            Class.forName(driverName);
            return DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            return null;
        }
    }

    public List<T> query(String sql, IRowMapper<T> mapper, Object... parameters) {
        List<T> results = new ArrayList<T>();
        Connection conc = getConnection();
        PreparedStatement statement = null;
        ResultSet rs = null;
        if (conc != null) {
            try {
                statement = conc.prepareStatement(sql);
                setPara(statement, parameters);
                statement.execute();
                rs = statement.executeQuery();
                while (rs.next()) {
                    results.add(mapper.mapper(rs));
                }
                return results;
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (conc != null) {
                        conc.close();
                    }
                    if (statement != null) {
                        statement.close();
                    }
                    if (rs != null) {
                        rs.close();
                    }
                } catch (SQLException e) {

                }
            }

        }

        return null;
    }

    public void update(String sql, Object... paras) {
        Connection conc = getConnection();
        PreparedStatement statement = null;

        if (conc != null) {
            try {
                conc.setAutoCommit(false);
                statement = conc.prepareStatement(sql);
                setPara(statement, paras);
                statement.executeUpdate();
                conc.commit();
            } catch (SQLException e) {
                System.out.println(e);
                try {
                    conc.rollback();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            } finally {
                try {
                    if (conc != null) {
                        conc.close();
                    }
                    if (statement != null) {
                        statement.close();
                    }

                } catch (SQLException e) {

                }
            }

        }
    }

    private void setPara(PreparedStatement statement, Object... parameters) {
        // TODO Auto-generated method stub
        for (int i = 0; i < parameters.length; i++) {
            try {
                statement.setObject(i + 1, parameters[i]);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
