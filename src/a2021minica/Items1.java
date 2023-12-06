/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2021minica;

/**
 *
 * @author awa
 */
public class Items1 extends Shopping {
    
    // Properties
    String itemName = "Kinder Chocolate"; 
    
    double price = 1.99;
    
    
    
    
    // Getter, Setter methods
    public String getItemName() {
        
        return itemName;
    }

    public void setItemName(String itemName) {
        
        this.itemName = itemName;
    }

    public double getPrice() {
        
        return price;
    }

    public void setPrice(double price) {
        
        this.price = price;
    }
    
    @Override
    public String toString() {
        
        return itemName + " " + "€" + price;
    }
    
}
