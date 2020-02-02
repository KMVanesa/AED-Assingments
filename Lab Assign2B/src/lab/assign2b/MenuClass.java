/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.assign2b;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author chief_kmv
 */
public class MenuClass {
    int index=0;
    Scanner scan=new Scanner(System.in);
    Patient patient[]=new Patient[100];
    void OpenMenu(){
        
        int i=1;
        
        while(i==1){
            System.out.println("1)Create");
            System.out.println("2)History");
            System.out.println("3)Check Abnormal Vital Signs");
            System.out.println("4)Update new Vital Signs");
            System.out.println("5)Exit");
            int a=scan.nextInt();
            if(a==1){
                index++;
                CreateNewPatient(index);
            }else if(a==5){
                i=4;
            }else if(a==2){
                getHistoryPatient();
            }else if(a==4){
                updateInformation();
            }
        }
    }
    
    void CreateNewPatient(int n){
        
        /*List<Integer> age=new ArrayList<>();
        List<Integer> res_rate= new ArrayList<>();
        List<Integer> heart_rate= new ArrayList<>();
        List<Integer> blood_pressure= new ArrayList<>();
        List<Integer> weight= new ArrayList<>();
        List<Integer> weight_lbs= new ArrayList<>();*/
        
        patient[n]=new Patient();
        System.out.println("Enter Name of Patient:");
        patient[n].setName(scan.next());
       
        System.out.println("Enter the age of Person:");
        //age.add(scan.nextInt());
        patient[n].setUmmar(scan.nextInt());
        
        /*System.out.println("Enter the Respiratory Rate:");
        res_rate.add(scan.nextInt());
        patient[n].setRes_rate(res_rate);
        
        System.out.println("Enter the Blood Pressure:");
        blood_pressure.add(scan.nextInt());
        patient[n].setBlood_pressure(blood_pressure);
        
        System.out.println("Enter the Heart Rate:");
        heart_rate.add(scan.nextInt());
        patient[n].setHeart_rate(heart_rate);
        
        System.out.println("Enter the Weight(Kgs):");
        weight.add(scan.nextInt());
        patient[n].setWeight(weight);
        
        System.out.println("Enter the Weight(lbs):");
        weight_lbs.add(scan.nextInt());
        patient[n].setWeight_lbs(weight_lbs);*/
        
    }
    
    void getHistoryPatient(){
        for(int i=1;i<=index;i++){
            
        String s=patient[i].getName();
        System.out.println(i+" "+s);
            System.out.println("Enter Patient's Index:");
            int k=scan.nextInt();
            
            getInformation(k);
            
        
        }
        
    }
    
    void getInformation(int m){
        System.out.println(patient[m].getName());
        System.out.println(patient[m].getAge());
        
    }
    
    void updateInformation(){
            for(int i=1;i<=index;i++){
            
        String s=patient[i].getName();
        System.out.println(i+" "+s);
            System.out.println("Enter Patient's Index:");
            int k=scan.nextInt();
            
            updatePatient(k);
            
        
        }       
    }
    
    void updatePatient(int m){
        System.out.println("Enter Updated Age:");
        patient[m].setUmmar(scan.nextInt());
    }
    
}
