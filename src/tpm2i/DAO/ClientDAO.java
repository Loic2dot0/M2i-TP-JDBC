/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpm2i.DAO;
import java.util.List;
import tpm2i.Model.Client;
import tpm2i.DAO.DataBase;
import java.sql.*;
import java.util.ArrayList;
import tpm2i.Config.Iconfig;
import tpm2i.Model.Client;


/**
 *
 * @author phili
 */
public class ClientDAO {
    public class ClientDAO implements Iconfig{
    
    private Client client = new Client();
    private DataBase db = new DataBase();
    
    public ClientDAO(){};
    
    
     public void add() {
        
         String sql = "INSERT INTO CLIENT (clientId, lastName, firstName, mail, adress)VALUES "
                 + "(" + client.getNumberClient() + ",'" + client.getLastName() +"'"
                 + "," + client.getFirstName()+ ",'"  +  client.getMail() +  ",'" + client.getAdress() +  "')";
         db.insert(sql);
         
    }
    
    public void delete(Integer clientId) {
        
    }
    
    public void update(Integer clientId) {
        
    }
    
    public List<Client> getClient() {
        
        String sql = "SELECT * FROM CLIENT";
        List<Client> clients = new ArrayList<>();
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306?useSSL=false", "root", dbPassword);
            List<ResultSet> resArray = db.getDatas(sql, conn);
            ResultSet res = resArray.get(0);
            while(res.next()) {
                Client client = new Client();
                client.setNumberClient(res.getString("ClientId"));
                client.setLastName(res.getString("LastName"));
                client.setFirstName(res.getString("FirstName"));
                client.setMail(res.getString("mail"));
                client.setAdress(res.getString("adress"));
                clients.add(client);
            }
            
            conn.close();
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return clients;
    }
    
    /*public Article getProviderById(Integer idNumber) {
        
    }*/

    public Client getClient() {
        return client;
    }

    public void setArticle(Client client) {
        this.client = client;
    }
}

    
}
