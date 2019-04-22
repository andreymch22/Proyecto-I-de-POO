/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import abstracts.Person;

/**
 *
 * @author Andrey M
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
    public Administrator(String username, String password, String photo,
            int id, String name, String firstPhone, String firstEmail) {
        super(id, name, firstPhone, firstEmail);
        this.password = password;
        this.photo = photo;
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
