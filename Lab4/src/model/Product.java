/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Rushabh
 */
public class Product {
    
    private String name;
    private int price;
    private int id;
    private ImageIcon logoImage;
    


    public ImageIcon getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(ImageIcon logoImage) {
        this.logoImage = logoImage;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Product.count = count;
    }

    private ArrayList<Feature> features;

    public ArrayList<Feature> getFeatures() {
        return features;
    }
    
    
    
    private static int count = 0;
    
    public Product() {
        count++;
        id = count;
        
        features= new ArrayList<Feature>();
        
    }

  public void addFeature(Feature feature, String value) {
        features.add(feature);
        feature.setValueForProduct(this, value);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
    @Override
    public String toString() {
        return name;
    }

   

   
    
}
