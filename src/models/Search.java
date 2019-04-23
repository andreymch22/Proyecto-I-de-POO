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
    public static Administrator searchAdmin(int id){
        for (Administrator temp : Main.administratorsList) {
            if (temp.getId() == id) {
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
    public static Cashier searchCashier(int id){
        for (Cashier temp : Main.cashiersList) {
            if (temp.getId() == id) {
                return temp;
            }
        }
        return null;
    }    
    
    public static Client searchClient(int id){
        for (Client temp : Main.clientsList) {
            if (temp.getId() == id) {
                return temp;
            }
        }
        return null;
    }
}
