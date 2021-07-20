/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;

/**
 *
 * @author Sravya
 */
public class OrderDirectory {
    private ArrayList<Order> orderList;
    
    public OrderDirectory(){
       orderList = new ArrayList<Order>();
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    
    //mehtod creates new orders
    public Order createOrder(){
        Order order = new Order();
        orderList.add(order);
        return order;
    }
    
    public void deleteOrder(Order order){
        orderList.remove(order);
    }
    
    public Order getOrderID(String orderID){
        for(Order order: orderList){
            if(order.getOrderID() == orderID){
                return order;
            }
        }
        return null;
    }
     
}
