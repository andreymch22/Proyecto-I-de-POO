/*
 */
package main;

import abstracts.Person;
import models.Administrator;
import models.Cashier;
import models.Client;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrey M
 */
public class Main {

    /**
     * Fecha de inicio: 05/04/2019
     * Fecha de inicio: ?/04/2019
     * @param args the command line arguments
     */
    
    public static List <Person> personsList = new ArrayList <Person>();
    
    public static void loadData(){
        personsList.add(new Cashier("123", 123, "Marta",
            "123456789", "marta@gmail.com"));
    }
    
    public static void main(String[] args) {
        loadData();
        for (Person perTemp : personsList) {
            System.out.println(perTemp.getName());
        }
    }
    
}
