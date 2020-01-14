package com.company;
import java.util.*;
public class Main {
    String fname;
    String lname;
    String waddress;
    String city;
    int zipcode;
    String country;

    public static void main(String[] args) {

	// write your code here
        Main p1=new Main();
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

        System.out.println("2)\tCity:\t"+p1.city);

        System.out.println("3)\tZip Code:\t"+p1.zipcode);

        System.out.println("4)\tCountry:\t"+p1.country);



    }
}
