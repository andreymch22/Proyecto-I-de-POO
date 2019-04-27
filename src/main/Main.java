/* Main
*
* 1.0v 
*
* 26/04/19
*
* Copyright
*/
package main;

import models.Administrator;
import models.Cashier;
import models.Client;
import java.util.ArrayList;
import java.util.List;
import windows.Login;
import enums.ClientsCategory;

/**
 * 
 * @version 1.0 
 * @author Andrey Marín Chacón
 */
public class Main {

    /**
     * Fecha de inicio: 05/04/2019
     * Fecha de finalizacion: ?/04/2019
     * @param args the command line arguments
     */
    public static final float VAT = (float) 0.13;
    
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
//        cashiersList.add(new Cashier("123", 123, "Marta", "123456789",
//                "marta@gmail.com"));
//        cashiersList.add(new Cashier("234", 234, "Marco", "234567890",
//                "marco12@gmail.com"));
//        cashiersList.add(new Cashier("345", 345, "Elena", "103456789",
//                "maxx11@gmail.com")); 
//        cashiersList.add(new Cashier("456", 456, "Carlos", "323456089",
//                "red333@gmail.com"));
        
        administratorsList.add(new Administrator("1123", 1123, "Sofia",
                "80120912", "sofia321@gmail.com"));
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
//        new Login().setVisible(true);
//        System.out.println(VAT);

    }
    
}
