package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Sravya
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem ecoSystem = EcoSystem.getEcoSystemInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        Employee employee = ecoSystem.getEmployeeDirectory().createEmployee("ram");
        
        UserAccount ua = ecoSystem.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return ecoSystem;
    }
    
}

