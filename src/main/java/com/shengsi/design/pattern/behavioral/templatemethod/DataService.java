package com.shengsi.design.pattern.behavioral.templatemethod;

import java.sql.SQLException;

public abstract class DataService {

    public abstract void connect() throws ClassNotFoundException, SQLException;

    public abstract void select() throws SQLException;

    public abstract void close() throws SQLException;

    public void run() throws SQLException, ClassNotFoundException {
        this.connect();
        this.select();
        this.close();
    }
}
