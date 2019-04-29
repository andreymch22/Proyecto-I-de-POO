/* Product
*
* 1.1v 
*
* 26/04/19
*
* Copyright
*/
package models;

import java.io.File;

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
    private String entryDate;// = new SimpleDateFormat("DD/MM/YYYY");
    private File imagePath;
    //video
    private String description;
    private int quantityAvailable;
    private float discount;
    private boolean vat;
    /**
     * 
     * @param code
     * @param name
     * @param category
     * @param price
     * @param salePrice
     * @param entryDate
     * @param imagePath
     * @param description
     * @param quantityAvailable
     * @param discount
     * @param vat 
     */
    public Product(String code, String name, ProductCategory category, 
            float price, float salePrice, String entryDate, File imagePath,
            String description, int quantityAvailable, float discount,
            boolean vat) {
        this.code = code;
        this.name = name;
        this.category = category;
        this.price = price;
        this.salePrice = salePrice;
        this.entryDate = entryDate;        
        this.description = description;
        this.quantityAvailable = quantityAvailable;
        this.discount = discount;
        this.vat = vat;
        this.imagePath = imagePath;
    }
    /**
     * 
     * @param code
     * @param name
     * @param category
     * @param price
     * @param salePrice
     * @param entryDate
     * @param description
     * @param quantityAvailable
     * @param discount
     * @param vat 
     */
    public Product(String code, String name, ProductCategory category, 
            float price, float salePrice, String entryDate, 
            String description, int quantityAvailable, float discount,
            boolean vat) {
        this.code = code;
        this.name = name;
        this.category = category;
        this.price = price;
        this.salePrice = salePrice;
        this.entryDate = entryDate;        
        this.description = description;
        this.quantityAvailable = quantityAvailable;
        this.discount = discount;
        this.vat = vat;
    }
    /**
     * 
     * @return code
     */
    public String getCode() {
        return code;
    }
    /**
     * 
     * @param code 
     */
    public void setCode(String code) {
        this.code = code;
    }
    /**
     * 
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * 
     * @return category
     */
    public ProductCategory getCategory() {
        return category;
    }
    /**
     * 
     * @param category 
     */
    public void setCategory(ProductCategory category) {
        this.category = category;
    }
    /**
     * 
     * @return price
     */
    public float getPrice() {
        return price;
    }
    /**
     * 
     * @param price 
     */
    public void setPrice(float price) {
        this.price = price;
    }
    /**
     * 
     * @return salePrice
     */
    public float getSalePrice() {
        return salePrice;
    }
    /**
     * 
     * @param salePrice 
     */
    public void setSalePrice(float salePrice) {
        this.salePrice = salePrice;
    }
    /**
     * 
     * @return entryDate
     */
    public String getEntryDate() {
        return entryDate;
    }
    /**
     * 
     * @param entryDate 
     */
    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }
    /**
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }
    /**
     * 
     * @param description 
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * 
     * @return quantityAvailable
     */
    public int getQuantityAvailable() {
        return quantityAvailable;
    }
    /**
     * 
     * @param quantityAvailable 
     */
    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }
    /**
     * 
     * @return discount
     */
    public float getDiscount() {
        return discount;
    }
    /**
     * 
     * @param discount 
     */
    public void setDiscount(float discount) {
        this.discount = discount;
    }
    /**
     * 
     * @return vat
     */
    public boolean isVat() {
        return vat;
    }
    /**
     * 
     * @param vat 
     */
    public void setVat(boolean vat) {
        this.vat = vat;
    }
    /**
     * 
     * @return imagePath
     */
    public File getImagePath() {
        return imagePath;
    }
    /**
     * 
     * @param imagePath 
     */
    public void setImagePath(File imagePath) {
        this.imagePath = imagePath;
    }
    
    
    
}
