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
public class Cashier extends Person{
    private String password;
    private String photo;//Se tiene que cambiar

    public Cashier(String username, String password, int id, String name, String firstPhone, String firstEmail) {
        super(id, name, firstPhone, firstEmail);
        this.password = password;
    }
    
}
