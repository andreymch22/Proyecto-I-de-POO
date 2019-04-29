/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Andrey M
 */
public class ProductCategory {
    private String code;
    private String description;
    
    /**
     * 
     * @param code
     * @param description 
     */
    public ProductCategory(String code, String description) {
        this.code = code;
        this.description = description;
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
    
}
