/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Menu.MenuDirectory;

/**
 *
 * @author Sravya
 */
public class Restaurant {
    private String restaurantName;
    private String restaurantAddress;
    private String restaurantManagerName;
    private String phNo;
    private MenuDirectory menuDirectory;
    
    public Restaurant(String restaurantName,
            String restaurantAddress,
            String restaurantManagerName,
            String phNo){
        this.phNo = phNo;
        this.restaurantAddress = restaurantAddress;
        this.restaurantManagerName = restaurantManagerName;
        this.restaurantName = restaurantName;
        
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public String getRestaurantManagerName() {
        return restaurantManagerName;
    }

    public void setRestaurantManagerName(String restaurantManagerName) {
        this.restaurantManagerName = restaurantManagerName;
    }

    public String getPhNo() {
        return phNo;
    }

    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }

    public MenuDirectory getMenuDirectory() {
        return menuDirectory;
    }

    public void setMenuDirectory(MenuDirectory menuDirectory) {
        this.menuDirectory = menuDirectory;
    }
    
    @Override
    public String toString(){
        return restaurantName;
    }
    
    
}
