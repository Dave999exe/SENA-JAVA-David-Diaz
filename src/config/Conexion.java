/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import com.mysql.jdbc.MysqlIO;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Dave999
 */
public class Conexion {
    Conexion con;
    public Conexion () {
        try {
            Class.forName ("com.mysql.jbdc.Driver");
            con=(Conexion) DriverManager.getConnection("jbdc:Mysql://localhost:3306/registro", "root","a10185938");
        } catch (Exception e){        
        }    
    }
    public Connection getConnection () {
        return (Connection) con;
    }
}
