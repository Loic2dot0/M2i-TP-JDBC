package tpm2i.DAO;

import tpm2i.Config.Iconfig;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author N Duquesne
 */
public class DataBase implements Iconfig{
    
    public DataBase() {}
    
    public void test() {
        System.out.println(dbPassword);
        System.out.println(dbUser);
    }
}
