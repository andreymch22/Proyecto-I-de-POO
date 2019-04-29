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
 */
public class Cashier extends Person {
    private String password;
    private String entryDate;
    private float salary;
    private String entryTime;
    private String departureTime;
    private File imagePath;

    public Cashier(String password, String entryDate, float salary,
            String entryTime, String departureTime, File imagePath,
            int id, String name, String firstPhone, String firstEmail) {
        super(id, name, firstPhone, firstEmail);
        this.password = password;
        this.entryDate = entryDate;
        this.salary = salary;
        this.entryTime = entryTime;
        this.departureTime = departureTime;
        this.imagePath = imagePath;
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
