/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpm2i.DAO;

/**
 *
 * @author Loïc
 */

import java.util.List;
import tpm2i.Model.User;
import java.sql.*;
import java.util.ArrayList;
import tpm2i.Config.Iconfig;
import static tpm2i.Config.Iconfig.dbPassword;
import static tpm2i.Config.Iconfig.dbUser;
import tpm2i.Model.Article;

public class UserDAO implements Iconfig{

    private User user = new User();
    private DataBase db = new DataBase();
    
    public UserDAO(){};
    
    public void add() {       
        String sql = "INSERT INTO user (userId, lastname, firstname, mail, login, password) VALUES "
                + "('" + user.getUserId() + "', '" + user.getLastName() +"', "
                + "'" + user.getFirstName() + "', '" + user.getMail() + "', "
                + "'" + user.getLogin() + "', '" + user.getPassword() + "')";
        db.insert(sql);    
    }
    
    public void delete(Integer userId){
    
    }
    
    public void update(Integer userId){
    
    }
    
    public List<User> getUsers() {        
        String sql = "SELECT * FROM user";
        List<User> users = new ArrayList<>();
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306?useSSL=false", dbUser, dbPassword);
            List<ResultSet> resArray = db.getDatas(sql, conn);
            ResultSet res = resArray.get(0);
            while(res.next()) {
                User user = new User();
                user.setUserId(res.getString("userId"));
                user.setLastName(res.getString("lastname"));
                user.setFirstName(res.getString("firstname"));                
                user.setMail(res.getString("mail"));
                user.setLogin(res.getString("login"));
                user.setPassword(res.getString("password"));
                users.add(user);
            }
            
            conn.close();
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return users;
    }
    
    public User getUser(){
        return user;
    }
    
    public void setUser(User user){
        this.user = user;
    }
}
