/* Main
*
* 1.0v 
*
* 26/04/19
*
* Copyright
*/
package main;

import enums.ClientsCategory;
import models.Administrator;
import models.Cashier;
import models.Client;
import java.util.ArrayList;
import java.util.List;
import windows.Login;
import java.io.File;
import models.Bill;
import models.Department;
import models.Product;
import models.ProductCategory;
import models.Search;
import windows.menu.AdministratorMenu;
import windows.menu.CashierMenu;

/**
 * Class that loads the default data, contains the main objects and 
 * executes the window that starts the program
 * @version 1.0 
 * @author Andrey Marín Chacón
 */
public class Main {

    /**
     * Fecha de inicio: 05/04/2019
     * Fecha de finalizacion: 30/04/2019
     * @param args the command line arguments
     */
    
    // Constants
    public static final float VAT = (float) 0.13;
    
    // Static windows
    public static Login login = new Login();
    public static AdministratorMenu administratorMenu 
            = new AdministratorMenu();
    public static CashierMenu cashierMenu = new CashierMenu();
    
    //Static lists
    public static List <Administrator> administrators 
            = new ArrayList <Administrator>();
    public static List <Cashier> cashiers = new ArrayList <Cashier>();
    public static List <Client> clients = new ArrayList <Client>();
    public static List <Product> inventory = new ArrayList <Product>();
    public static List <Bill> bills = new ArrayList <Bill>();
    public static List <Department> departments 
            = new ArrayList <Department>();
    public static List <ProductCategory> categories 
            = new ArrayList <ProductCategory>();
   
    //Static users connected
    public static Administrator administratorConnected = null;    
    public static Cashier cashierConnected = null;
    
    
    /**
     * Method that loads the data to the static lists
     */
    public static void loadData() {
        //Paths of the cashiers photos
        File marcoPhotoPath =  new File("src" + File.separator + "Images" 
                + File.separator + "Marco.png");
        File elenaPhotoPath = new File("src" + File.separator + "Images" 
                + File.separator + "Elena.jpg");
        File carlosPhotoPath = new File("src" + File.separator + "Images" 
                + File.separator + "Carlos.jpg");      
        
        //Paths of the cashiers photos
        File sofiaPhotoPath = new File("src" + File.separator + "Images" 
                + File.separator + "Sofia.jpg");
        File jaimePhotoPath = new File("src" + File.separator + "Images" 
                + File.separator + "Jaime.jpg");
        
        //Adding the cashiers
        cashiers.add(new Cashier("234", "12/12/18", 315000, "7:30", 
                "16:00", marcoPhotoPath, 234, "Marco", "84567890",
                "marco12@gmail.com"));
        cashiers.add(new Cashier("345", "20/10/17", 300000, "7:00",
                "17:00", elenaPhotoPath, 345, "Elena", "6456789",
                "maxx11@gmail.com")); 
        cashiers.add(new Cashier("456", "01/01/19", 310000, "8:00",
                "18:00", carlosPhotoPath, 456, "Carlos", "8456089",
                "red333@gmail.com"));

        //Adding the administrators
        administrators.add(new Administrator("112", 112, "Sofia",
                "80120912", "sofia321@gmail.com",sofiaPhotoPath));
        administrators.add(new Administrator("235", 235, "Jaime",
                "80120922", "jaime321@gmail.com", jaimePhotoPath));
        
        //Adding the clients
        clients.add(new Client(987, "Ricardo", "88888888", 
                "ricard321@gmail.com", ClientsCategory.Gold));
        clients.add(new Client(876, "Raquel", "87654321", 
                "raque21@gmail.com", ClientsCategory.Bronze));
        clients.add(new Client(654, "Alberto", "81234567", 
                "alv231@gmail.com", ClientsCategory.Silver));
        
        //Adding the product categories
        categories.add(new ProductCategory("C-001","Meats"));
        categories.add(new ProductCategory("C-002","Alcoholic Drinks"));
        categories.add(new ProductCategory("C-003","Dairy Products"));
        categories.add(new ProductCategory("C-004","Home Appliances"));
        categories.add(new ProductCategory("C-005","Oral Hygiene"));
        
        //Adding the depatments
        departments.add(new Department("D-001", "Foods"));
        departments.add(new Department("D-002", "Home Appliances"));
        departments.add(new Department("D-003", "Medicines"));
        departments.add(new Department("D-004", "Products of toilet and "
                + "hygiene personal"));
        //Paths of the products photos
        File milkSemiPhotoPath = new File("src" + File.separator + "Images" 
                + File.separator + "Leche  2%  Grasa Dos Pinos 1.8 L.png");
        File milkInPhotoPath = new File("src" + File.separator + "Images" 
                + File.separator + "Leche  2%  Grasa Dos Pinos 1.8 L.png");
        File tunaOilPhotoPath = new File("src" + File.separator + "Images" 
                + File.separator + "Leche  2%  Grasa Dos Pinos 1.8 L.png");
        File tunaWathPhotoPath = new File("src" + File.separator + "Images" 
                + File.separator + "Leche  2%  Grasa Dos Pinos 1.8 L.png");
        File colgTripPhotoPath = new File("src" + File.separator + "Images" 
                + File.separator + "Leche  2%  Grasa Dos Pinos 1.8 L.png");
        
        //Adding the products
        inventory.add(new Product("P-001", "Leche Semidescremada Dos Pinos",
                Search.searchProductCategory("C-003"), 2080, 2200,
                "29/04/2019", milkSemiPhotoPath, "Liquida, 2% Grasa, "
                        + "1.8 mL", 12, 0, true));
        inventory.add(new Product("P-002", "Leche In-Line Dos Pinos",
                Search.searchProductCategory("C-003") ,
                2370, 2500, "29/04/2019", milkInPhotoPath,
                "En polvo, Descremada, 1.5 kg", 10, 0, false));
        inventory.add(new Product("P-012", "PRONTO ATUN LOMO EN TROZOS EN"
                + " ACEITE", Search.searchProductCategory("C-001"),2010,
                2210, "01/04/2019", tunaOilPhotoPath, "lata 354 g", 25, 0,
                true));
        inventory.add(new Product("P-011", "PRONTO ATUN LOMO EN TROZOS EN"
                + " AGUA", Search.searchProductCategory("C-001"), 1295,
                1650, "01/04/2019", tunaWathPhotoPath, "lata 160 g", 20, 0,
                true));
        inventory.add(new Product("P-023", "Pasta Dental Colgate Triple "
                + "Acción", Search.searchProductCategory("C-005"), 2900,
                3000, "10/04/2019", colgTripPhotoPath, "160 mL", 22, 
                (float)0.05, true));
        inventory.add(new Product("P-020", "Samsung Refrigeradora",
                Search.searchProductCategory("C-004"), 200000, 210000,
                "20/03/2019", "Color: negra", 5, (float)0.10, true));
    }
    
    /**
     * Method that executes the login window to start the program
     * @param args 
     */
    public static void main(String[] args) {
        loadData();
        login.setVisible(true);

    }
    
}
