/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import main.Main;
/**
 *
 * @author Andrey M
 */
public class Search {
    /**
     * 
     * @param id
     * @return temp or null 
     */
    public static Administrator searchAdmin(String id){
        for (Administrator temp : Main.administratorsList) {
            if (id.equals(temp.getId())) {
                return temp;
            }
        }
        return null;
    }
    /**
     * 
     * @param id
     * @return temp or null 
     */
    public static Cashier searchCashier(String id){
        for (Cashier temp : Main.cashiersList) {
            if (id.equals(temp.getId())) {
                return temp;
            }
        }
        return null;
    }    
    
    public static Client searchClient(String id){
        for (Client temp : Main.clientsList) {
            if (id.equals(temp.getId())) {
                return temp;
            }
        }
        return null;
    }
}
