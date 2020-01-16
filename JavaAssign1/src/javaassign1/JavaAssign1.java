/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassign1;

import java.util.Scanner;

/**
 *
 * @author chief_kmv
 */
public class JavaAssign1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scan=new Scanner(System.in);
         person p1=new person();
         address w=new address();
         address l=new address();
         address h=new address();
         
         p1.getDetails();
         System.out.println("Enter Details of Your Work Address");
         w.getInput();
         System.out.println("Enter Details of Your Local Address");
         l.getInput();
         System.out.println("Enter Details of Your Home Address");
         h.getInput();
         
         p1.printOutput();
         System.out.println("Work Address");
         w.printOutput();
         System.out.println("Local Address");
         l.printOutput();
         System.out.println("Home Address");
         h.printOutput();
        
    
         
    }
    
}

class person{
    String fname;
    String lname;
    String DOB;
    
    Scanner scan=new Scanner(System.in);
    
    void getDetails(){
        
         System.out.println("Enter First Name:");
         fname=scan.nextLine();
         System.out.println("Enter Last Name:");
         lname=scan.nextLine();  
         System.out.println("Enter DOB(MM/DD/YYYY):");
         DOB=scan.nextLine();
        
    }
    
    void printOutput(){
        System.out.println("Person Details");

        System.out.println("1)\tFirst Name:\t"+fname);

        System.out.println("2)\tLast Name:\t"+lname);
        System.out.println("3)\t Date of Birth:\t"+DOB);
    }
    
    
}


class address{
    
    String address1;
    String address2;
    String city;
    String zipcode;  
    String state;
    String country;
    
    Scanner scan=new Scanner(System.in);

    void getInput(){
        System.out.println("Enter Address Line 1:");
        address1=scan.nextLine();
        
        System.out.println("Enter Address Line 2:");
        address2=scan.nextLine();

        
        System.out.println("Enter City:");
        city=scan.nextLine();
        System.out.println("Enter State:");
        state=scan.nextLine();
        System.out.println("Enter Zip Code:");
        zipcode=scan.nextLine();

        System.out.println("Enter Country:");
        country=scan.nextLine();

    }
    
    void printOutput(){
        System.out.println("1)\tAddress 1:\t"+address1);
        System.out.println("2)\tAddress 2:\t"+address2);
        System.out.println("3)\tCity:\t\t"+city);
        System.out.println("4)\tState:\t\t"+state);
        System.out.println("5)\tZip Code:\t"+zipcode);

        System.out.println("6)\tCountry:\t"+country);
    }
    
}