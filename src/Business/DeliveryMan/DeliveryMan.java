/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

/**
 *
 * @author Sravya
 */
public class DeliveryMan {
    private String name;
    private String emailID;
    private String phNo;
    private int age;
    private String homeAddress;
    //private String userName;
    
    public DeliveryMan(String name,
            String emailID,
            String phNo,
            int age,
            String homeAddress){
        
        this.age = age;
        this.emailID = emailID;
        this.homeAddress = homeAddress;
        this.name = name;
        this.phNo = phNo;
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
    
    @Override
    public String toString(){
        return name;
    }
    
    
    
}
