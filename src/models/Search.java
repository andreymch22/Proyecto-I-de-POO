/* Search
*
* 1.0v 
*
* 26/04/19
*
* Copyright
*/
package models;
import main.Main;
/**
 * 
 * @version 1.0 
 * @author Andrey Marín Chacón
 */
public class Search {
    /**
     * 
     * @param id
     * @return temp or null 
     */
    public static Administrator searchAdmin(int id){
        for (Administrator temp : Main.administratorsList) {
            if (temp.getId() == id) {
                return temp;
            }
        }
        return null;
    }
    /**
     * 
     * @param id
     * @return temp or null 
     */
    public static Cashier searchCashier(int id){
        for (Cashier temp : Main.cashiersList) {
            if (temp.getId() == id) {
                return temp;
            }
        }
        return null;
    }    
    
    public static Client searchClient(int id){
        for (Client temp : Main.clientsList) {
            if (temp.getId() == id) {
                return temp;
            }
        }
        return null;
    }
}
