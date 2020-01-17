/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labassign1;

import labassign1.Person;
/**
 *
 * @author chief_kmv
 */
public class LabAssign1 {

    /**
     * @param args the command line arguments
     */
    
    Person Person1=new Person();
  
    
    public static void main(String[] args) {
        // TODO code application logic here
        LabAssign1 Details=new LabAssign1();
        Details.displayDetails();
        Details.displayWorkAddress();
        Details.displayLocalAddress();
        Details.displayHomeAddress();
    }
    
    public void displayDetails(){
        
        Person1.setFirst_name("Krutarth");
        System.out.println("First Name:\t"+Person1.getFirst_name());
        
        
        Person1.setLast_name("Vanesa");
        System.out.println("Last Name:\t"+Person1.getLast_name());
        
        
        Person1.setAge("22");
        System.out.println("Age:\t\t"+Person1.getAge());
        
    }
    
    public void displayWorkAddress(){
        Person1.work.setAddress_line_1("137 Park Drive");
        Person1.work.setAddress_line_2("B45");
        Person1.work.setCity("Boston");
        Person1.work.setState("MA");
        Person1.work.setZip_code("02215");
        Person1.work.setCountry("US");
        
       
        
        System.out.println("Work Address Details");
        System.out.println("Address Line 1:\t"+Person1.work.getAddress_line_1());
        System.out.println("Address Line 2:\t"+Person1.work.getAddress_line_2());
        System.out.println("City:\t\t"+Person1.work.getCity());
        System.out.println("Zip code:\t"+Person1.work.getZip_code());
        System.out.println("State:\t\t"+Person1.work.getState());
        System.out.println("Country:\t"+Person1.work.getCountry());
    }
    
    public void displayLocalAddress(){
        Person1.local.setAddress_line_1("848 Huntington Avenue");
        Person1.local.setAddress_line_2("201");
        Person1.local.setCity("Boston");
        Person1.local.setState("MA");
        Person1.local.setZip_code("02115");
        Person1.local.setCountry("US");
        
        
        
        System.out.println("Home Address Details");
        System.out.println("Address Line 1:\t"+Person1.local.getAddress_line_1());
        System.out.println("Address Line 2:\t"+Person1.local.getAddress_line_2());
        System.out.println("City:\t\t"+Person1.local.getCity());
        System.out.println("Zip code:\t"+Person1.local.getZip_code());
        System.out.println("State:\t\t"+Person1.local.getState());
        System.out.println("Country:\t"+Person1.local.getCountry());
    }
    
    public void displayHomeAddress(){
        Person1.home.setAddress_line_1("44 Jay Ambe Soc.,");
        Person1.home.setAddress_line_2("Bhatar Road");
        Person1.home.setCity("Surat");
        Person1.home.setState("GUJ");
        Person1.home.setZip_code("395001");
        Person1.home.setCountry("India");
        
        
        
        System.out.println("Home Address Details");
        System.out.println("Address Line 1:\t"+Person1.home.getAddress_line_1());
        System.out.println("Address Line 2:\t"+Person1.home.getAddress_line_2());
        System.out.println("City:\t\t"+Person1.home.getCity());
        System.out.println("Zip code:\t"+Person1.home.getZip_code());
        System.out.println("State:\t\t"+Person1.home.getState());
        System.out.println("Country:\t"+Person1.home.getCountry());
    }
}
