package com.jdbc.AdminOperation;

import com.jdbc.Utility.Utility;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.jdbc.Controller.Controller.bf;

public class Update {
    public static void update() throws IOException, SQLException {
        System.out.println("enter the id that you want to update");
        int uid= Integer.parseInt(bf.readLine());
        Connection connection= Utility.myConnection();
        Statement statement=connection.createStatement();
        String sql1="Select * from student where id="+uid;
      ResultSet rs= statement.executeQuery(sql1);
      boolean flag=false;
        while(rs.next()){
            flag=true;
            System.out.println("enter new name ");
            String newName=bf.readLine();
            System.out.println("enter gmail");
            String newGmail= bf.readLine();
            String sql2="Update student set name='"+newName+"'"+" where id="+uid;
            String sql3="Update student set gmail='"+newGmail+"'"+" where id="+uid;
            statement.execute(sql2);
            statement.executeQuery(sql3);
            System.out.println("update successfully");

        }
        if(flag==false){
            System.out.println("Record not found");
        }

    }
}
