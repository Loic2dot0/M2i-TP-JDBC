/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tpm2i.Interface;

/**
 *
 * @author N Duquesne
 */
public interface IDataBase {
    final String str1 = "CREATE DATABASE IF NOT EXISTS Tpm2i CHARACTER SET utf8;";
    final String str2 = "use Tpm2i";
    final  String str3 = "CREATE TABLE IF NOT EXISTS user ("
                    + "id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, "
                    + "idNumber INT NOT NULL,"
                    + "name VARCHAR(50) NOT NULL, "
                    + "firstname VARCHAR(50) NOT NULL,"
                    + "email VARCHAR(50) NOT NULL,"
                    + "login VARCHAR(50) NOT NULL,"
                    + "password VARCHAR(50) NOT NULL)";
    final  String str4 = "CREATE TABLE IF NOT EXISTS provider ("
                    + "id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, "
                    + "idNumber INT NOT NULL,"
                    + "name VARCHAR(50) NOT NULL, "
                    + "email VARCHAR(50) NOT NULL,"
                    + "adresse VARCHAR(255) NOT NULL)";
    final  String str5 = "CREATE TABLE IF NOT EXISTS client ("
                    + "id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, "
                    + "idNumber INT NOT NULL,"
                    + "name VARCHAR(50) NOT NULL, "
                    + "firstname VARCHAR(50) NOT NULL,"
                    + "email VARCHAR(50) NOT NULL,"
                    + "adresse VARCHAR(255) NOT NULL)";
    final  String str6 = "CREATE TABLE IF NOT EXISTS article ("
                    + "id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, "
                    + "idNumber INT NOT NULL,"
                    + "name VARCHAR(50) NOT NULL, "
                    + "isforsell TINYINT(1) NOT NULL, "
                    + "description VARCHAR(255) NOT NULL)";
}