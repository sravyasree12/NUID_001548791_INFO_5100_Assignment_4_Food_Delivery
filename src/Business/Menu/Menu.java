/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;

/**
 *
 * @author Sravya
 */
public class Menu {
    private String dishName;
    private double price;
    private String restaurantName;
    
    public Menu(String dishName, double price, String restaurantName){
        this.dishName = dishName;
        this.price = price;
        this.restaurantName = restaurantName;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }
    
    @Override
    public String toString(){
        return dishName;
    }
    
    
    
}
