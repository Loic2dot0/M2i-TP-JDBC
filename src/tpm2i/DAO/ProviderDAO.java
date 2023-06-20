/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpm2i.DAO;

/**
 *
 * @author N Duquesne
 */

import java.util.List;
import tpm2i.Model.Provider;
import tpm2i.DAO.DataBase;
import java.sql.*;
import java.util.ArrayList;
import tpm2i.Config.Iconfig;

public class ProviderDAO implements Iconfig{
    
    private Provider provider = new Provider();
    private DataBase db = new DataBase();
    
    public ProviderDAO(){};
    
    
    public void add() {
        
         String sql = "INSERT INTO PROVIDER (providerId, name, mail, address)VALUES "
                 + "('" + provider.getIdNumber() + "','" + provider.getName() +"'"
                 + "," + provider.getEmail()+ ",'"  +  provider.getAdress() + "')";
         db.insert(sql);
    }
    
     public void delete(Integer idNumber) {
        
    }
    
    public void update(Integer idNumber) {
        
    }
    
    
    public List<Provider> getArticles() {
        
        String sql = "SELECT * FROM ARTICLE";
        List<Provider> articles = new ArrayList<>();
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306?useSSL=false", dbUser, dbPassword);
            ResultSet res = db.getDatas(sql, conn);
            while(res.next()) {
                Provider provider = new Provider();
                provider.setIdNumber(res.getString("articleId"));
                provider.setName(res.getString("name"));
                provider.setEmail(res.getString("mail"));
                provider.setAdress(res.getString("address"));
                articles.add(provider);
            }
            
            conn.close();
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return articles;
    }
    
}
