package com.jdbc.AdminOperation;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;


public class AdminLogin {
    public static void adminLogin() throws SQLException, IOException {
        while(true){
            Scanner sc=new Scanner(System.in);
            String userId="Shivam@";
            String password="1234";
            System.out.println("Enter UserId : ");
            String getId=sc.nextLine();
            System.out.println("Enter Password");
            String getPass=sc.nextLine();

            if (getId.equals(userId)&&(getPass.equals(password))) {

                System.out.println("Login Successful");
                System.out.println("WELCOME SHIVAM");
                System.out.println("Press 1 for Doing Admin Operations");
                System.out.println("Press 0 for exit");
                     int ch = sc.nextInt();
                     if (ch == 1) {
                    System.out.println("---------Welcome to admin portal-------------");
                    System.out.println("Description::In this Portal admin can create,update,display,delete,search user details");
                    System.out.println("Press 1 for create user");

                    System.out.println("Press 2 for update user");
                    System.out.println("Press 3for delete user");
                    System.out.println("Press 4 for display user");
                    System.out.println("Press 0 for back the user");
                    int choice = sc.nextInt();
                    if(choice==1){
                        CreateStudent.create();
                    } else if (choice==2) {
                         Update.update();
                    } else if (choice==3) {
                        Delete.del();
                    } else if (choice==4) {
                        Show.showStudent();
                    } else if (choice==0) {
                        break;

                    }
                }
                if(ch==-0){
                    break;
                }
            }}}}
