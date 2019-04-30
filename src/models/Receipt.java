/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import enums.ClientsCategory;
import java.util.ArrayList;
import java.util.List;
import main.Main;

/**
 *
 * @author Andrey M
 */
public class Receipt {
    private String code;
    private Client client;
    private List <ProductToBuy> productsToBuy;
    private float vat;
    private float subtotal;
    private float total;
    
    /**
     * 
     * @param code
     * @param client 
     */
    public Receipt() {
        Main.receiptCode++;
        this.code = Integer.toString(Main.receiptCode);
        this.client = null;
        this.productsToBuy = new ArrayList <ProductToBuy>(); 
        this.subtotal =  0;
        this.total = 0;
    }
    
    
    /**
     * 
     * @return 
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
     * @return 
     */
    public Client getClient() {
        return client;
    }
    /**
     * 
     * @param client 
     */
    public void setClient(Client client) {
        this.client = client;
    }
    /**
     * 
     * @return 
     */
    public List<ProductToBuy> getProductsToBuy() {
        return productsToBuy;
    }
    /**
     * 
     * @param productsToBuy 
     */
    public void setProductsToBuy(List<ProductToBuy> productsToBuy) {
        this.productsToBuy = productsToBuy;
    }
    /**
     * 
     * @return 
     */
    public float getSubtotal() {
        return subtotal;
    }
    /**
     * 
     * @param subtotal 
     */
    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }
    /**
     * 
     * @return 
     */
    public float getTotal() {
        return total;
    }
    /**
     * 
     * @param total 
     */
    public void setTotal(float total) {
        this.total = total;
    }
    /**
     * 
     * @param ptb 
     */
    public void addProduct(ProductToBuy ptb){       
        productsToBuy.add(ptb);
    }
    /**
     * 
     */
    private void calculateSubtotal(){
        
        for (ProductToBuy prodTemp : productsToBuy) {
            float productPrice = prodTemp.getProductToBuy().getSalePrice();
            float productUnits = prodTemp.getUnits();
            float discount = productPrice * productUnits 
                    * prodTemp.getProductToBuy().getDiscount();
           
            subtotal += productPrice * productUnits - discount;             
        }
        
        if(client.getCategory() == ClientsCategory.Gold){
            subtotal -= subtotal * (float) 0.10;
        }else if(client.getCategory() == ClientsCategory.Silver){
            subtotal -= subtotal * (float) 0.07;
        }else{//ClientsCategory.Bronze
            subtotal -= subtotal * (float) 0.05;
        }        
    }
    /**
     * 
     */
    private void calculateVAT(){
        for (ProductToBuy prodTemp : productsToBuy) {
             if (prodTemp.getProductToBuy().isVat()) {
                float productPrice = prodTemp.getProductToBuy()
                        .getSalePrice();
                float productUnits = prodTemp.getUnits();        
                
                vat += productPrice * productUnits * Main.VAT;
             }             
        }
    }
    /**
     * 
     */
    private void calculateTotal(){
        total = subtotal + vat;
    }
    /**
     * 
     */
    public void calculateTotalSubtotalAndVAT(){
        calculateSubtotal();
        calculateVAT();
        calculateTotal();
    }
}
