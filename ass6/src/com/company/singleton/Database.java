package com.company.singleton;

import java.sql.*;

public class Database {
    String connectionUrl;
    Connection con;
    ResultSet rs;
    Statement st;

    private static Database instance = new Database();

    private Database(){
        try {
            connectionUrl = "jdbc:postgresql://localhost/Projects";
            con = DriverManager.getConnection(connectionUrl, "postgres", "230801");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static Database getInstance(){
        if (Database.instance == null) {
            synchronized (Database.instance){
                if (Database.instance == null){
                    Database.instance = new Database();
                }
            }
        }
        return Database.instance;
    }

    public void query(String sql){
        try {
            st = con.createStatement();
            st.executeQuery(sql);
            if (st.executeQuery(sql) != null) {
                rs = st.executeQuery(sql);
                ResultSetMetaData rsmd = rs.getMetaData();
                for (int i = 1; i <= rsmd.getColumnCount(); i++)
                    System.out.print(rsmd.getColumnLabel(i) + " ");
                System.out.println("");
                while (rs.next()) {
                    for (int i = 1; i <= rsmd.getColumnCount(); i++)
                    System.out.print(rs.getString(i) + " ");
                }
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
