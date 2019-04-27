/* Product
*
* 1.0v 
*
* 26/04/19
*
* Copyright
*/
package models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * 
 * @version 1.0 
 * @author Andrey Marín Chacón
 */
public class Product {
    private String code;
    private String name;
    private ProductCategory category;
    private float price;
    private float salePrice;
    private DateFormat entryDate = new SimpleDateFormat("DD/MM/YYYY");
    //foto
    //video
    private String description;
    private int quantityAvailable;
    private float discount;
    private boolean vat;
    
    
}
