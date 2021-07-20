/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author Sravya
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerList;

    public CustomerDirectory() {
        this.customerList = new ArrayList<Customer>();
    }
    
    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    
    //method creates customers
    public Customer createCustomer(String name,
            String emailID,
            String phNo,
            int age,
            String homeAddress,
            String userName){
        
        Customer customer = new Customer(name, emailID, phNo, age, homeAddress, userName );
        customerList.add(customer);
        return customer;
    }
    
    public void deleteCustomer(Customer customer){
        customerList.remove(customer);
    }
    
    public Customer getCustomer(String name){
        for(Customer customer: customerList){
            if(customer.getName().equalsIgnoreCase(name)){
                return customer;
            }
        }
        return null;
    }
    
}
