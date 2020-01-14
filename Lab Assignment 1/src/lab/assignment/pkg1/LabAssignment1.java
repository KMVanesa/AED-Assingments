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
    String DOB;
    
    
    String waddress1;
    String waddress2;
    String wcity;
    String wzipcode;  
    String wstate;
    String wcountry;
    
    String laddress1;
    String laddress2;
    String lcity;
    String lzipcode;  
    String lstate;
    String lcountry;
    
    String haddress1;
    String haddress2;
    String hcity;
    String hzipcode;  
    String hstate;
    String hcountry;
    
    
    
    
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
        
        
        System.out.println("Enter DOB(MM/DD/YYYY):");
        p1.DOB=scan.nextLine();
//--------------------------------------------------------------------------
        System.out.println("Enter Details of Your Working Address");
        
        System.out.println("Enter Address Line 1:");
        p1.waddress1=scan.nextLine();
        
        System.out.println("Enter Address Line 2:");
        p1.waddress2=scan.nextLine();

        
        System.out.println("Enter City:");
        p1.wcity=scan.nextLine();
        
        System.out.println("Enter State:");
        p1.wstate=scan.nextLine();
        System.out.println("Enter Zip Code:");
        p1.wzipcode=scan.nextLine();

        System.out.println("Enter Country:");
        p1.wcountry=scan.nextLine();

        
        
        //--------------------------------------------------------------------------
        System.out.println("Enter Details of Your Local Address");
        
        System.out.println("Enter Address Line 1:");
        p1.laddress1=scan.nextLine();
        
        System.out.println("Enter Address Line 2:");
        p1.laddress2=scan.nextLine();

        
        System.out.println("Enter City:");
        p1.lcity=scan.nextLine();
        System.out.println("Enter State:");
        p1.lstate=scan.nextLine();
        System.out.println("Enter Zip Code:");
        p1.lzipcode=scan.nextLine();

        System.out.println("Enter Country:");
        p1.lcountry=scan.nextLine();


        
        
        //--------------------------------------------------------------------------
        System.out.println("Enter Details of Your Home Address");
        
        System.out.println("Enter Address Line 1:");
        p1.haddress1=scan.nextLine();
        
        System.out.println("Enter Address Line 2:");
        p1.haddress2=scan.nextLine();

        
        
        System.out.println("Enter City:");
        p1.hcity=scan.nextLine();
        System.out.println("Enter State:");
        p1.hstate=scan.nextLine();
        System.out.println("Enter Zip Code:");
        p1.hzipcode=scan.nextLine();
        System.out.println("Enter Country:");
        p1.hcountry=scan.nextLine();

        



        System.out.println("Person Details");

        System.out.println("1)\tFirst Name:\t"+p1.fname);

        System.out.println("2)\tLast Name:\t"+p1.lname);
        System.out.println("3)\t Date of Birth:\t"+p1.DOB);

       
        System.out.println("Working Address");

        System.out.println("1)\tAddress 1:\t"+p1.waddress1);
        System.out.println("2)\tAddress 2:\t"+p1.waddress2);
        System.out.println("3)\tCity:\t\t"+p1.wcity);
        System.out.println("4)\tState:\t\t"+p1.wstate);
        System.out.println("5)\tZip Code:\t"+p1.wzipcode);

        System.out.println("6)\tCountry:\t"+p1.wcountry);

        System.out.println("Local Address");

         System.out.println("1)\tAddress 1:\t"+p1.laddress1);
        System.out.println("2)\tAddress 2:\t"+p1.laddress2);
        System.out.println("3)\tCity:\t\t"+p1.lcity);
        System.out.println("4)\tState:\t\t"+p1.lstate);
        System.out.println("5)\tZip Code:\t"+p1.lzipcode);

        System.out.println("6)\tCountry:\t"+p1.lcountry);
        
        System.out.println("Home Address");

         System.out.println("1)\tAddress 1:\t"+p1.haddress1);
        System.out.println("2)\tAddress 2:\t"+p1.haddress2);
        System.out.println("3)\tCity:\t\t"+p1.hcity);
        System.out.println("4)\tState:\t\t"+p1.hstate);
        System.out.println("5)\tZip Code:\t"+p1.hzipcode);

        System.out.println("6)\tCountry:\t"+p1.hcountry);



    }
    
}
