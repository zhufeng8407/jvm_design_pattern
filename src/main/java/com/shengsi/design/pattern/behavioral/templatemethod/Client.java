package com.shengsi.design.pattern.behavioral.templatemethod;

import java.sql.SQLException;

public class Client {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DataService service = new MysqlDataService();
        service.run();
    }
}
