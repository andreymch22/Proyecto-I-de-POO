/* Client
*
* 1.0v 
*
* 26/04/19
*
* Copyright
*/
package models;

import abstracts.Person;
import enums.ClientsCategory;
/**
 * 
 * @version 1.0 
 * @author Andrey Marín Chacón
 */
public class Client extends Person{
    private ClientsCategory category;
    /**
     * 
     * @param id
     * @param name
     * @param firstPhone
     * @param firstEmail
     * @param category 
     */
    public Client(int id, String name, String firstPhone, String firstEmail,
            ClientsCategory category) {
        super(id, name, firstPhone, firstEmail);
        this.category = category;
    }
    /**
     * 
     * @return category
     */
    public ClientsCategory getCategory() {
        return category;
    }
    /**
     * 
     * @param category 
     */
    public void setCategory(ClientsCategory category) {
        this.category = category;
    }   
    
}
