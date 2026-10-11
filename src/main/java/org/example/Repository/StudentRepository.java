package org.example.Repository;

import org.example.Model.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentRepository {
    String url="jdbc:mysql://localhost:3306/student_db";
    String username="root";
    String password="3434";

    public void createUser(){
        try{
            Connection connection = DriverManager.getConnection(url,username,password);

            Statement statement  = connection.createStatement();

            String sql = " Insert INTO student(name, email, age) " +
                    " VALUES ('adnan ', ' ad@gmail.com ' , 20  )";

            int rus = statement.executeUpdate(sql);

            if(rus == 1){
                System.out.println("sucess");
            }
            else{
                System.out.println("failed");
            }


            connection.close();
         } catch (Exception e) {
            e.printStackTrace();
         }

    }

    public void updateUser(){
        try{
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement  = connection.createStatement();

            String sql = " UPDATE student SET age = 21 " + "WHERE studentid = 1";

            int rus = statement.executeUpdate(sql);

            if(rus == 1){
                System.out.println("sucess");
            }
            else{
                System.out.println("failed");
            }


            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



}
