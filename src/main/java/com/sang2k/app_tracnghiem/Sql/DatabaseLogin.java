/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sang2k.app_tracnghiem.Sql;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Yahiko
 */
public class DatabaseLogin {
    public static Connection openConnection() throws Exception {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://localhost:1433;database=App_TracNghiem";
            Connection connect=DriverManager.getConnection(connectionUrl,"sa","123");
            return connect;
        } catch (Exception e) 
        {
            e.printStackTrace();
            return null;
        }
}
}
