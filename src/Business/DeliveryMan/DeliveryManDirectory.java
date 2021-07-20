/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author Sravya
 */
public class DeliveryManDirectory {
    private ArrayList<DeliveryMan> deliveryManList;
    
    public DeliveryManDirectory(){
        deliveryManList = new ArrayList<DeliveryMan>();
    }

    public ArrayList<DeliveryMan> getDeliveryManList() {
        return deliveryManList;
    }

    public void setDeliveryManList(ArrayList<DeliveryMan> deliveryManList) {
        this.deliveryManList = deliveryManList;
    }
    
    //method creates Delivery Man
    public DeliveryMan createDeliveryMan(String name,
            String emailID,
            String phNo,
            int age,
            String homeAddress){
        
        DeliveryMan deliveryMan = new DeliveryMan(name, emailID, phNo, age, homeAddress);
        deliveryManList.add(deliveryMan);
        return deliveryMan;
    }
    
    public void deleteDeliveryMan(DeliveryMan deliveryMan){
        deliveryManList.remove(deliveryMan);
    }
    
    
    
    
    
    
}
