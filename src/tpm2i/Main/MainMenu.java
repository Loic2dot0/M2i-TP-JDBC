/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpm2i.Main;

/**
 *
 * @author N Duquesne
 */

import java.util.ArrayList;
import java.util.List;
import tpm2i.Model.Article;
import tpm2i.DAO.*;
import tpm2i.Model.Client;

public class MainMenu {
    
    private ArticleDAO articleDAO = new ArticleDAO();
    private ClientDAO clientDAO = new ClientDAO();
    public MainMenu() {};
    
    public void start() {
        DataBase db = new DataBase();
        db.create();
    }
    
    public void insertArticle() {
        Article article = new Article();
        
        article.setIdNumber("AP784UV");
        article.setName("Pneu");
        article.setDescription("Pneu de velo");
        article.setIsForSell(true);
        articleDAO.add(article);
    }
    
    public void getArticles() {
        List<Article> articles = new ArrayList<>();
        articles = this.articleDAO.getArticles();
        
        System.out.println("");
        articles.forEach(article -> {
         System.out.println(article.getName());
         System.out.println(article.getDescription());
         System.out.println(article.getIsForSell());
        });
        
    }
    
    public void insertClient() {
        Client client = new Client();
        client.setNumberClient("784UH78");
        client.setAdress("15 bd Argon prime");
        client.setFirstName("Nico");
        client.setLastName("Duke");
        client.setMail("nico.duke@domain.com");
        clientDAO.add(client);
    }
    
    public void getClients() {
        List<Client> clients = new ArrayList<>();
        clients = this.clientDAO.getClients();
        System.out.println("");
        clients.forEach(client -> {
         System.out.println(client.getFirstName());
         System.out.println(client.getLastName());
         System.out.println(client.getAdress());
        });
    }
    
}
