package com.jdbc.AdminOperation;

import com.jdbc.Utility.Utility;

import java.io.IOException;
import java.sql.*;

import static com.jdbc.Controller.Controller.bf;

public class Delete {
    public static void del() throws IOException, SQLException {
        ResultSet rs;
        System.out.println("enter the id that you want to delete");
        int vid = Integer.parseInt(bf.readLine());
        Connection connection = Utility.myConnection();

        String sql = "select * from student where id=" + vid;
        Statement statement=connection.createStatement();
       rs=statement.executeQuery(sql);
        boolean s=false;
        if((rs.next())){
            s=true;
            String sql1="delete from student where id="+vid;
            statement.execute(sql1);
            System.out.println("deleted succesfully");
        }
        if (s==false){
            System.out.println("no record found");
        }



    }
}
