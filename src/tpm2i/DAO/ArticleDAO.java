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
import tpm2i.Model.Article;
import tpm2i.DAO.DataBase;
import java.sql.*;
import java.util.ArrayList;
import tpm2i.Config.Iconfig;

/**
 *
 * @author N Duquesne
 */
public class ArticleDAO implements Iconfig{
    
    private Article article = new Article();
    private DataBase db = new DataBase();
    
    public ArticleDAO(){};
    
    
     public void add() {
        
         String sql = "INSERT INTO ARTICLE (articleId, name, isforsell, description)VALUES "
                 + "('" + article.getIdNumber() + "','" + article.getName() +"'"
                 + "," + article.getIsForSell()+ ",'"  +  article.getDescription() + "')";
         db.insert(sql);
         
    }
    
    public void delete(Integer idNumber) {
        
    }
    
    public void update(Integer idNumber) {
        
    }
    
    public List<Article> getArticles() {
        
        String sql = "SELECT * FROM ARTICLE";
        List<Article> articles = new ArrayList<>();
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306?useSSL=false", dbUser, dbPassword);
            List<ResultSet> resArray = db.getDatas(sql, conn);
            ResultSet res = resArray.get(0);
            while(res.next()) {
                Article article = new Article();
                article.setIdNumber(res.getString("articleId"));
                article.setName(res.getString("name"));
                article.setDescription(res.getString("description"));
                article.setIsForSell(res.getBoolean("isforsell"));
                articles.add(article);
            }
            
            conn.close();
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return articles;
    }
    
    /*public Article getProviderById(Integer idNumber) {
        
    }*/

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
