/* Administrator
*
* 1.0v 
*
* 26/04/19
*
* Copyright
*/
package models;

import abstracts.Person;

/**
 * 
 * @version 1.0 
 * @author Andrey Marín Chacón
 */
public class Administrator extends Person{
    private String password;
    private String photo;//Se tiene que cambiar
    
    /**
     * 
     * @param username
     * @param password
     * @param photo
     * @param id
     * @param name
     * @param firstPhone
     * @param firstEmail 
     */
    public Administrator(String password, int id, String name,
            String firstPhone, String firstEmail) {
        super(id, name, firstPhone, firstEmail);
        this.password = password;
        //this.photo = photo;
    }

    public Administrator() {
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
