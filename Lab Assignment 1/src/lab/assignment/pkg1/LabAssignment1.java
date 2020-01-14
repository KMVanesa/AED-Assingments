/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.assignment.pkg1;

import java.util.*;
/**
 *
 * @author chief_kmv
 */
public class LabAssignment1 {

    String fname;
    String lname;
    String waddress;
    String city;
    int zipcode;
         
    String country;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LabAssignment1 p1=new LabAssignment1();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter First Name:");
        p1.fname=scan.nextLine();

        System.out.println("Enter Last Name:");
        p1.lname=scan.nextLine();

        System.out.println("Enter Address:");
        p1.waddress=scan.nextLine();

        System.out.println("Enter City:");
        p1.city=scan.nextLine();

        System.out.println("Enter Country:");
        p1.country=scan.nextLine();

        System.out.println("Enter Zip Code:");
        p1.zipcode=scan.nextInt();



        System.out.println("Person Details");

        System.out.println("1)\tFirst Name:\t"+p1.fname);

        System.out.println("2)\tLast Name:\t"+p1.lname);

        System.out.println("Working Address");

        System.out.println("1)\tAddress:\t"+p1.waddress);

        System.out.println("2)\tCity:\t\t"+p1.city);

        System.out.println("3)\tZip Code:\t"+p1.zipcode);

        System.out.println("4)\tCountry:\t"+p1.country);


    }
    
}
