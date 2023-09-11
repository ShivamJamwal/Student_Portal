package com.jdbc.Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class  Utility {
    public  static Connection myConnection () throws SQLException {
       String url="jdbc:mysql://localhost:3307/hptu";
       String userName="root";
       String pwd="admin";
       Connection connection= DriverManager.getConnection(url,userName,pwd);
       return connection;
    }
}

