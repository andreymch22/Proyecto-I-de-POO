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
        for (Administrator temp : Main.administrators) {
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
        for (Cashier temp : Main.cashiers) {
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
    public static Client searchClient(int id){
        for (Client temp : Main.clients) {
            if (temp.getId() == id) {
                return temp;
            }
        }
        return null;
    }
    
    public static boolean globalUserSearch(int id){
        if((searchAdmin(id) == null) && (searchCashier(id) == null)
                && (searchClient(id)) == null){
            return true;
        }else{
            return false;
        }        
    }
    
    public static Product searchProduct(String code){
        for (Product temp : Main.inventory) {
            if (temp.getCode().equals(code)) {
                return temp;
            }
        }
        return null;
    }
    
    public static Receipt searchReceipt(String code){
        for (Receipt temp : Main.receipts) {
            if (temp.getCode().equals(code)) {
                return temp;
            }
        }
        return null;
    }
        
    public static Department searchDepartment(String code){
        for (Department temp : Main.departments) {
            if (temp.getCode().equals(code)) {
                return temp;
            }
        }
        return null;
    }   
    
    public static ProductCategory searchProductCategory(String code){
        for (ProductCategory temp : Main.categories) {
            if (temp.getCode().equals(code)) {
                return temp;
            }
        }
        return null;
    }   
}
