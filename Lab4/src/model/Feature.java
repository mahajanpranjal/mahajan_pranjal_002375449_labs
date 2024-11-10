/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author archil
 */
public class Feature {
    private Product owner;
    private String name;
    private Object value;
    private Map<Product, String> productValues;
    
   public Feature(String name) {
        this.name = name;
        this.productValues = new HashMap<>(); // Initialize the productValues map
    }

    
    public void setValueForProduct(Product product, String value) {
        productValues.put(product, value);
    }

    // Get value for a specific product
    public String getValueForProduct(Product product) {
        return productValues.get(product);
    }
    
    
    
   

 

    public Product getOwner() {
        return owner;
    }

    public void setOwner(Product owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
    
    @Override
    public String toString(){
    return name;
    }
    
    

}


