package com.example.cinemareservationver2;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
public class DatabaseConnection {
    public Connection databaseLink;
    public Connection getConnection(){
        //sql7.freesqldatabase.com
        String databaseName="movies";
        String databaseUser="root";
        String databasePassword="";
        String url="jdbc:mysql://localhost/"+databaseName;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink= DriverManager.getConnection(url, databaseUser,databasePassword);
        }catch(Exception e){
            e.printStackTrace();
            e.getCause();
        }
        return databaseLink;
    }
}
