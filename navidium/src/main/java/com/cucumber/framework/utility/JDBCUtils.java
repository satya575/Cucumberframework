package com.cucumber.framework.utility;/*
 * @author murali
 */

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.sql.*;

public class JDBCUtils {

   public Connection getConnection(String DB_URL,String USER,String PASS) throws Exception {
       return DriverManager.getConnection(DB_URL, USER, PASS);
   }
   public void closeConnection(Connection con)throws Exception{
       con.close();
   }
   public ResultSet executeSelectQuery(Connection con,String query)throws Exception{
       Statement statement = con.createStatement();
     ResultSet rs=  statement.executeQuery(query);
     return rs;
   }

    public int executeUpdateQuery(Connection con,String query)throws Exception{
        Statement statement = con.createStatement();
        int rs=  statement.executeUpdate(query);
        return rs;
    }

   }

