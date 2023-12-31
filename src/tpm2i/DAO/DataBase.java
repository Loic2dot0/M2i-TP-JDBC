package tpm2i.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tpm2i.Config.Iconfig;
import tpm2i.Interface.IDataBase;
import static tpm2i.Interface.IDataBase.str1;
import static tpm2i.Interface.IDataBase.str2;
import static tpm2i.Interface.IDataBase.str3;
import static tpm2i.Interface.IDataBase.str4;
import static tpm2i.Interface.IDataBase.str5;
import static tpm2i.Interface.IDataBase.str6;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author N Duquesne
 */
public class DataBase implements Iconfig, IDataBase{
    
    public DataBase(){
    }
    
    public void create() {
        try {
            System.out.println(dbUser + dbPassword);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306?useSSL=false", dbUser, dbPassword );
            Statement stmt = conn.createStatement();
            System.out.println("Creation de la BDD...");
            stmt.executeUpdate(str1);
            stmt.executeUpdate(str2);
            System.out.println("Base de donnees cree avec succes.");
            stmt.executeUpdate(str3);
            System.out.println("Table cree avec succes.");
            stmt.executeUpdate(str4);
            System.out.println("Table cree avec succes.");
            stmt.executeUpdate(str5);
            System.out.println("Table cree avec succes.");
            stmt.executeUpdate(str6);
            System.out.println("Table cree avec succes.");
            conn.close();
        }
        catch (ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
    }
    
    
    public void insert(String sql) {
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306?useSSL=false", dbUser, dbPassword);
             Statement stmt = conn.createStatement();
             stmt.executeUpdate(str2);
             stmt.executeUpdate(sql);
             conn.close();
        }
        catch (ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
    }
    
    
    public ResultSet getDatas(String sql, Connection conn) {
        ResultSet res = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(str2);
            res = stmt.executeQuery(sql);
        }
        catch (ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
    
    return res;
       
    }
}
