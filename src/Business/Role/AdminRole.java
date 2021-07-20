/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Menu.MenuDirectory;
import Business.Order.OrderDirectory;
import Business.Organization;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.RestaurantAdminRole.AdminWorkAreaJPanel;

/**
 *
 * @author Sravya
 */
public class AdminRole extends Role {
    
    @Override
    public JPanel createWorkArea(
            JPanel userProcessContainer, 
            UserAccount userAccount, 
            EcoSystem ecoSystem,
            CustomerDirectory customerDirectory, 
            RestaurantDirectory restaurantDirectory, 
            DeliveryManDirectory deliveryManDirectory, 
            MenuDirectory menuDirectory, 
            OrderDirectory orderDirectory) {
        return new AdminWorkAreaJPanel(
                userProcessContainer, 
                userAccount, 
                ecoSystem,
                customerDirectory,
                restaurantDirectory, 
                deliveryManDirectory, 
                menuDirectory, 
                orderDirectory);
    }
    
}
