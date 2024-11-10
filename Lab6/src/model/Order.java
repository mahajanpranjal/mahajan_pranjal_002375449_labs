/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author pshah
 */
public class Order {
    
    ArrayList<OrderItems> orderItemList;
    
    
    public Order() {
    
    this.orderItemList = new ArrayList<OrderItems>();
    
    }

    public ArrayList<OrderItems> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItems> orderItemList) {
        this.orderItemList = orderItemList;
    }
    
    public void addNewOrderItem(Product product,double price,int quantity) {
    OrderItems orderItem=new OrderItems(product,price,quantity);
    orderItemList.add(orderItem);
    
    }
    
    public void deleteItem(OrderItems item) {
    this.orderItemList.remove(item);
    
    }
    
    public OrderItems findProduct(Product product){
    
        for (OrderItems oi : this.getOrderItemList()) {
         if(oi.getProduct().equals(product)){
             return oi;
        }
    }
return null;
    
}
    }
