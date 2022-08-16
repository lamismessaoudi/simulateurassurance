/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulateurassurance.tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Adminstrateur
 */
public class MyConnections {
     public final String url = "jdbc:mysql://localhost:3306/simulateurassurance";
    public final String user = "root";
    public final String mdp = "";
    private Connection cnx ;
    public static MyConnections ct;
    
    

    private MyConnections() {
        try {
            cnx = DriverManager.getConnection(url, user, mdp);
            System.out.println("Connexion etablie");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    //creation une seule instance de la classe MyConnexion + constructeur private 
    
    public static MyConnections getInstance() {
        if (ct == null) {
            ct = new MyConnections();
        }
        return ct;
    }

    
    public Connection getCnx() {
        return cnx;
    }
    
}
