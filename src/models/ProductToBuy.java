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
public class ProductToBuy {
    private Product productToBuy;
    private int units;

    public ProductToBuy(Product productToBuy, int units) {
        this.productToBuy = productToBuy;
        this.units = units;
    }

    public Product getProductToBuy() {
        return productToBuy;
    }

    public void setProductToBuy(Product productToBuy) {
        this.productToBuy = productToBuy;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }
    
}
