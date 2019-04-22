/*
 */
package main;

import abstracts.Person;
import models.Administrator;
import models.Cashier;
import models.Client;
import java.util.ArrayList;
import java.util.List;
import windows.Login;

/**
 *
 * @author Andrey M
 */
public class Main {

    /**
     * Fecha de inicio: 05/04/2019
     * Fecha de finalizacion: ?/04/2019
     * @param args the command line arguments
     */
    
    public static List <Administrator> administratorsList = 
            new ArrayList <Administrator>();
    public static List <Cashier> cashiersList = new ArrayList <Cashier>();
    public static List <Client> clientsList = new ArrayList <Client>();
    
    public static Administrator administratorConnected;//  = new Administrator();
    public static Cashier cashierConnected;// = new Cashier();
    /**
     * 
     */
    public static void loadData() {
        cashiersList.add(new Cashier("123", 123, "Marta", "123456789",
                "marta@gmail.com"));
    }
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        loadData();
//        for(Person perTemp : personsList) {
//            System.out.println(perTemp.getName());
//        }
        new Login().setVisible(true);
    }
    
}
