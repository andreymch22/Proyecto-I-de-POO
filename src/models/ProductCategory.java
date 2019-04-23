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
    private String id;
    private String description;
    
    /**
     * 
     * @param id
     * @param description 
     */
    public ProductCategory(String id, String description) {
        this.id = id;
        this.description = description;
    }
    
    /**
     * 
     * @return id
     */
    public String getId() {
        return id;
    }
    
    /**
     * 
     * @param id 
     */
    public void setId(String id) {
        this.id = id;
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
