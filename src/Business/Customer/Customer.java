/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

/**
 *
 * @author Sravya
 */
public class Customer {
    private String name;
    private String emailID;
    private String phNo;
    private int age;
    private String homeAddress;
    private String userName;

    public Customer(String name,
            String emailID,
            String phNo,
            int age,
            String homeAddress,
            String userName) {
        
        this.name = name;
        this.age = age;
        this.emailID = emailID;
        this.homeAddress = homeAddress;
        this.phNo = phNo;
        this.userName = userName;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getPhNo() {
        return phNo;
    }

    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    
    
    @Override
    public String toString() {
        return name;
    }
     
}
