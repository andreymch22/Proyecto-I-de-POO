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
    //De un cliente se conoce su identificación, el nombre, sus teléfonos y emails
    private int id;
    private String name;
    private List<String> phonesList = new ArrayList<String>();
    private List<String> emailsList = new ArrayList<String>();

    public Person(int id, String name, String firstPhone, String firstEmail) {
        this.id = id;
        this.name = name;
        addPhoneToTheList(firstPhone);
        addEmailToTheList(firstEmail);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhonesList() {
        return phonesList;
    }

    public void setPhonesList(List<String> phonesList) {
        this.phonesList = phonesList;
    }
    
    public void addPhoneToTheList(String phone){
        phonesList.add(phone);
    }

    public List<String> getEmailsList() {
        return emailsList;
    }

    public void setEmailsList(List<String> emailsList) {
        this.emailsList = emailsList;
    }
    
    public void addEmailToTheList(String email){
        emailsList.add(email);
    }
    
    
}
