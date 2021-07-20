/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author Sravya
 */
public class RestaurantDirectory {
    
    private ArrayList<Restaurant> restaurantList;
    
    
    public RestaurantDirectory(){
        restaurantList = new ArrayList<Restaurant>();
    }

    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(ArrayList<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }
    
    //method creates new restaurant
    public Restaurant createRestaurant(String restaurantName,
            String restaurantAddress,
            String restaurantManagerName,
            String phNo){
        Restaurant restaurant = new Restaurant(restaurantName, restaurantAddress, restaurantManagerName, phNo);
        restaurantList.add(restaurant);
        System.out.println(restaurantList.size() + "New Restaurant");
        return restaurant;
    }
    
    public void deleteRestaurant(Restaurant restaurant){
        restaurantList.remove(restaurant); 
    }
    
    public Restaurant getRestaurant(String restaurantName){
        for(Restaurant restaurant: restaurantList){
            if(restaurant.getRestaurantName() == restaurantName){
                return restaurant;
            }
        }
        return null;
    }
    
}
