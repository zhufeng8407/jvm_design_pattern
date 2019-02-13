package com.shengsi.design.pattern.behavioral.templatemethod;

import java.sql.*;

public class MysqlDataService extends DataService {

    private String url = "jdbc:mysql://10.0.11.6:3307/kddb?user=kdusr&password=kdusr_12";

    private Connection con;

    private Statement statement;

    private ResultSet set;

    @Override
    public void connect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url);
        statement = con.createStatement();
    }

    @Override
    public void select() throws SQLException {
        String sql = "SELECT contNo FROM insurancepolicyinfo where contNo is not null order by signDate desc";

        set = statement.executeQuery(sql);

        while(set.next()) {
            System.out.println(set.getString("contNo"));
        }
    }

    @Override
    public void close() throws SQLException {
        try {

        } finally {
            if (set != null)
                set.close();
            if (statement != null)
                statement.close();
            if (con != null)
                con.close();
        }
    }
}
