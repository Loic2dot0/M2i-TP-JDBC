/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpm2i.Main;

/**
 *
 * @author N Duquesne
 */

import tpm2i.DAO.DataBase;

public class MainMenu {
    
    public MainMenu() {};
    
    public void start() {
        DataBase db = new DataBase();
        db.create();
    }
    
}
