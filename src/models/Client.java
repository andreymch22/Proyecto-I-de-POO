/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import abstracts.Person;
import enums.Category;
/**
 *
 * @author Andrey M
 */
public class Client extends Person{
    private Category category;
    /**
     * 
     * @param id
     * @param name
     * @param firstPhone
     * @param firstEmail
     * @param category 
     */
    public Client(int id, String name, String firstPhone, String firstEmail,
            Category category) {
        super(id, name, firstPhone, firstEmail);
        this.category = category;
    }
    /**
     * 
     * @return category
     */
    public Category getCategory() {
        return category;
    }
    /**
     * 
     * @param category 
     */
    public void setCategory(Category category) {
        this.category = category;
    }   
    
}
