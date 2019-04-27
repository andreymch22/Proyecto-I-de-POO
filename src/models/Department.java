/* Department
*
* 1.0v 
*
* 26/04/19
*
* Copyright
*/
package models;

/**
 * 
 * @version 1.0 
 * @author Andrey Marín Chacón
 */
public class Department {
    private String code;
    private String description;

    public Department(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
