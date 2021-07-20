/*
 * To change this template, choose Tools | Templates
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
import userinterface.SystemAdminRole.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Sravya
 */
public class SystemAdminRole extends Role{
   
    public JPanel createWorkArea(
            JPanel userProcessContainer, 
            UserAccount userAccount, 
            EcoSystem ecoSystem,
            CustomerDirectory customerDirectory, 
            RestaurantDirectory restaurantDirectory, 
            DeliveryManDirectory deliveryManDirectory, 
            MenuDirectory menuDirectory, 
            OrderDirectory orderDirectory) {
        
        return new SystemAdminWorkAreaJPanel(
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

