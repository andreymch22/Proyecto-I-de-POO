/* Cashier
*
* 1.0v 
*
* 26/04/19
*
* Copyright
*/
package models;

import abstracts.Person;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * 
 * @version 1.0 
 * @author Andrey Marín Chacón
 *//**
 * 
 * @version 1.0 
 * @author Andrey Marín Chacón
 *//**
 * 
 * @version 1.0 
 * @author Andrey Marín Chacón
 */
public class Cashier extends Person {
    private String password;
    private Image photo;
    /**
     * 
     * @param password
     * @param id
     * @param name
     * @param firstPhone
     * @param firstEmail 
     * @param imageDirection 
     */
    public Cashier(String password, int id, String name,
            String firstPhone, String firstEmail,File imageDirection){
        super(id, name, firstPhone, firstEmail);
        this.password = password;
        try {
            this.photo = ImageIO.read(imageDirection);
        } catch (IOException exception) {
            System.out.println("La imagen no fue encontrada.");//change_me
        }
        
        
    }
    /**
     * 
     */
    public Cashier() {
    }
    /**
     * 
     * @return password
     */
    public String getPassword() {
        return password;
    }
    /**
     * 
     * @param password 
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
}
