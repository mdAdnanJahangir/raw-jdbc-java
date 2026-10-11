package org.example;


import org.example.Repository.StudentRepository;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {


        StudentRepository s = new StudentRepository();
        s.createUser();






        }
    }
