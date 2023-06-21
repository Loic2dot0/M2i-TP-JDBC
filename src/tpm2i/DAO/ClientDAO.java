/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpm2i.DAO;
import java.util.List;
import tpm2i.DAO.DataBase;
import java.sql.*;
import java.util.ArrayList;
import tpm2i.Config.Iconfig;
import tpm2i.Model.Client;


/**
 *
 * @author phili
 */
    public class ClientDAO implements Iconfig{
    
    private DataBase db = new DataBase();
    
    public ClientDAO(){};
    
    
     public void add(Client client) {
        
         String sql = "INSERT INTO CLIENT (clientId, lastName, firstName, mail, address)VALUES "
                 + "('" + client.getNumberClient() + "','" + client.getLastName() +"'"
                 + ",'" + client.getFirstName()+ "','"  +  client.getMail() +  "','" + client.getAdress() +  "')";
         db.insert(sql);
         
    }
    
    public void delete(Integer clientId) {
        
    }
    
    public void update(Integer clientId) {
        
    }
    
    public List<Client> getClients() {
        
        String sql = "SELECT * FROM CLIENT";
        List<Client> clients = new ArrayList<>();
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306?useSSL=false", dbUser, dbPassword);
            ResultSet res = db.getDatas(sql, conn);
            while(res.next()) {
                Client client = new Client();
                client.setNumberClient(res.getString("clientId"));
                client.setLastName(res.getString("lastName"));
                client.setFirstName(res.getString("firstName"));
                client.setMail(res.getString("mail"));
                client.setAdress(res.getString("address"));
                clients.add(client);
            }
            
            conn.close();
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return clients;
    }
    
    /*public Client getProviderById(Integer idNumber) {
        
    }*/
}

    

