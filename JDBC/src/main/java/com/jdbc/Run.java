package com.jdbc;
import com.jdbc.Controller.Controller;
import com.jdbc.Constant.Menu;
import java.io.IOException;
import java.sql.SQLException;
public class Run {
    public static void main(String[] args) throws SQLException, IOException {
        Menu.menu();
        Controller.controller();
    }
}
