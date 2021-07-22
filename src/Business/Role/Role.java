/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Menu.MenuDirectory;
import Business.Order.OrderDirectory;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Sravya
 */
public abstract class Role {
    
    public enum RoleType{

        RestaurantAdmin("RestaurantAdmin"),
        Customer("Customer"),
        DeliveryMan("Delivery Man"),
        SystemAdmin("SystemAdmin");
        
        private String value;
        
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(
            JPanel userProcessContainer, 
            UserAccount userAccount, 
            EcoSystem ecoSystem,
            CustomerDirectory customerDirectory, 
            RestaurantDirectory restaurantDirectory, 
            DeliveryManDirectory deliveryManDirectory, 
            MenuDirectory menuDirectory, 
            OrderDirectory orderDirectory);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}