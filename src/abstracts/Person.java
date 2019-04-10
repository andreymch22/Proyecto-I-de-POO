/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracts;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrey M
 */
public abstract class Person {
    /*De un cliente se conoce su identificación, el nombre, sus teléfonos 
    y emails*/
    private int id;
    private String name;
    private List<String> phonesList = new ArrayList<String>();
    private List<String> emailsList = new ArrayList<String>();
    /**
     * 
     * @param id
     * @param name
     * @param firstPhone
     * @param firstEmail 
     */
    public Person(int id, String name, String firstPhone, String firstEmail) {
        this.id = id;
        this.name = name;
        addPhoneToTheList(firstPhone);
        addEmailToTheList(firstEmail);
    }
    /**
     * 
     * @return id
     */
    public int getId() {
        return id;
    }
    /**
     * 
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
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
     * @return phonesList
     */
    public List<String> getPhonesList() {
        return phonesList;
    }
    /**
     * 
     * @param phonesList 
     */
    public void setPhonesList(List<String> phonesList) {
        this.phonesList = phonesList;
    }
    /**
     * 
     * @param phone 
     */    
    public void addPhoneToTheList(String phone){
        phonesList.add(phone);
    }
    /**
     * 
     * @return emailsList
     */
    public List<String> getEmailsList() {
        return emailsList;
    }
    /**
     * 
     * @param emailsList 
     */
    public void setEmailsList(List<String> emailsList) {
        this.emailsList = emailsList;
    }
    /**
     * 
     * @param email 
     */    
    public void addEmailToTheList(String email){
        emailsList.add(email);
    }
    
    
}
