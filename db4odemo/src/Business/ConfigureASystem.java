package Business;

import Business.Employee.Employee;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("Admin","sysadmin", "sysadmin", employee, new SystemAdminRole());
        UserAccount ua1 =system.getUserAccountDirectory().createUserAccount("Restaurant Admin-1","kmv", "12345", employee, new AdminRole());
        UserAccount ua2 =system.getUserAccountDirectory().createUserAccount("Customer-1","raj", "12345", employee, new CustomerRole());
        UserAccount ua3 =system.getUserAccountDirectory().createUserAccount("Del Man-1","dax", "12345", employee, new DeliverManRole());
        return system;
    }
    
}
