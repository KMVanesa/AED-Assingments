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
            }else if(a==3){
                checkAbnormal();
            }
            
        }
    }
    
    void CreateNewPatient(int m){
        
      
        
        patient[m]=new Patient();
        System.out.println("Enter Name of Patient:");
        patient[m].setName(scan.next());
       
        System.out.println("Enter the age of Person:");
        patient[m].setAge_int(scan.nextInt());
        
        
        System.out.println("Enter the Respiratory Rate:");
        patient[m].setRes_rate_int(scan.nextInt());
        
        System.out.println("Enter the Blood Pressure:");
        patient[m].setBp_int(scan.nextInt());
        
        System.out.println("Enter the Heart Rate:");
        patient[m].setHeart_rate_int(scan.nextInt());
        
        System.out.println("Enter the Weight(Kgs):");
        patient[m].setWeight_int(scan.nextInt());
        
        System.out.println("Enter the Weight(lbs):");
        patient[m].setWeight_lbs_int(scan.nextInt());
        
        
        if(isPatientNormal(m)==false){
            System.out.println("----------Abnormal-----------");
        }else if(isPatientNormal(m)==true){
            System.out.println("------------Normal------------");
        }
       
        
    }
    
    void getHistoryPatient(){
        for(int i=1;i<=index;i++){
            
        String s=patient[i].getName();
        System.out.println(i+" "+s);
                         
        }
        System.out.println("Enter Patient's Index:");
            int k=scan.nextInt();
            
            getInformation(k);
        
    }
    
    void getInformation(int i){
        System.out.println(patient[i].getName());
           for(int l=0;l<patient[i].getAge().size();l++){
                System.out.println("Visit:"+l+1+":Age:"+patient[i].age.get(l));
                System.out.println("Visit:"+l+1+":Heart Rate:"+patient[i].heart_rate.get(l));
                System.out.println("Visit:"+l+1+":Respirotary Rate:"+patient[i].res_rate.get(l));
                System.out.println("Visit:"+l+1+":Blood Pressure:"+patient[i].blood_pressure.get(l));
                System.out.println("Visit:"+l+1+":Weight in KGs:"+patient[i].weight.get(l));
                System.out.println("Visit:"+l+1+":Weight in LBs:"+patient[i].weight_lbs.get(l));
            }
        
        
    }
    
    void updateInformation(){
        int k;
            for(int i=1;i<=index;i++){
            
            
            System.out.println(i+" "+patient[i].getName());
  
            
        }       
            System.out.println("Enter Patient's Index:");
             k=scan.nextInt();
            updatePatient(k);
    }
    
    void updatePatient(int m){
        System.out.println("Enter the new age of Person:");
        patient[m].setAge_int(scan.nextInt());
        
        System.out.println("Enter the new Respiratory Rate:");
        patient[m].setRes_rate_int(scan.nextInt());
        
        System.out.println("Enter the new Blood Pressure:");
        patient[m].setBp_int(scan.nextInt());
        
        System.out.println("Enter the new Heart Rate:");
        patient[m].setHeart_rate_int(scan.nextInt());
        
        System.out.println("Enter the new Weight(Kgs):");
        patient[m].setWeight_int(scan.nextInt());
        
        System.out.println("Enter the new Weight(lbs):");
        patient[m].setWeight_lbs_int(scan.nextInt());
    
        
        if(isPatientNormal(m)==false){
            System.out.println("----------Abnormal-----------");
        }else if(isPatientNormal(m)==true){
            System.out.println("------------Normal------------");
        }
        
    }
    
    void checkAbnormal(){
        int k;
          for(int i=1;i<=index;i++){
            System.out.println(i+" "+patient[i].getName());
            }
          System.out.println("Enter Patient's Index:");
             k=scan.nextInt();
             checkVitalSigns(k);
          
    }
    
    void checkVitalSigns(int o){
        String sign=new String();
        System.out.println("Enter Vital Sign you want to check:");
        sign=scan.nextLine();
        if (sign.equals("Respiratory Rate")==true) {
            System.out.println("Enter Respiratory Rate to check:");
            String res_rate=scan.nextLine();
           
                
            
        }
        
        
    }
    
    
    boolean isPatientNormal(int p){
        
        System.out.println(patient[p].getAge_int());
        if(patient[p].getAge_int()>=0 && patient[p].getAge_int()<=1){
            System.out.println("Infant");
            if (patient[p].getRes_rate_int()>=30 && patient[p].getRes_rate_int()<=50 && 
                    patient[p].getHeart_rate_int()>=120 && patient[p].getHeart_rate_int()<=160 && 
                    patient[p].getBp_int()>=50 && patient[p].getBp_int()<=70 &&
                    patient[p].getWeight_int()>=2 && patient[p].getWeight_int()<=3 &&
                    patient[p].getWeight_lbs_int()>=4 && patient[p].getWeight_lbs_int()<=7) {
                return true;
            }else{
                return false;
            }           
        }else if(patient[p].getAge_int()>1 && patient[p].getAge_int()<=3){
            System.out.println("Toddler");
            if (patient[p].getRes_rate_int()>=20 && patient[p].getRes_rate_int()<=30 && 
                    patient[p].getHeart_rate_int()>=80 && patient[p].getHeart_rate_int()<=140 && 
                    patient[p].getBp_int()>=70 && patient[p].getBp_int()<=100 &&
                    patient[p].getWeight_int()>=4 && patient[p].getWeight_int()<=10 &&
                    patient[p].getWeight_lbs_int()>=9 && patient[p].getWeight_lbs_int()<=22) {
                return true;
            }else{
                return false;
            }           
            
        }else if(patient[p].getAge_int()>3 && patient[p].getAge_int()<=5){
            System.out.println("school");
            if (patient[p].getRes_rate_int()>=20 && patient[p].getRes_rate_int()<=30 && 
                    patient[p].getHeart_rate_int()>=80 && patient[p].getHeart_rate_int()<=140 && 
                    patient[p].getBp_int()>=80 && patient[p].getBp_int()<=110 &&
                    patient[p].getWeight_int()>=10 && patient[p].getWeight_int()<=14 &&
                    patient[p].getWeight_lbs_int()>=22 && patient[p].getWeight_lbs_int()<=31) {
                return true;
            }else{
                return false;
            }           
            
        }else if(patient[p].getAge_int()>=6 && patient[p].getAge_int()<=12){
            System.out.println("bacha");
            if (patient[p].getRes_rate_int()>=20 && patient[p].getRes_rate_int()<=30 && 
                    patient[p].getHeart_rate_int()>=80 && patient[p].getHeart_rate_int()<=120 && 
                    patient[p].getBp_int()>=80 && patient[p].getBp_int()<=110 &&
                    patient[p].getWeight_int()>=20 && patient[p].getWeight_int()<=42 &&
                    patient[p].getWeight_lbs_int()>=41 && patient[p].getWeight_lbs_int()<=92) {
                return true;
                
            }else{
                return false;
            }           
            
        }else if(patient[p].getAge_int()>12){
            
            System.out.println("Adult");
            if (patient[p].getRes_rate_int()>=12 && patient[p].getRes_rate_int()<=20 && 
                    patient[p].getHeart_rate_int()>=55 && patient[p].getHeart_rate_int()<=105 && 
                    patient[p].getBp_int()>=110 && patient[p].getBp_int()<=120 &&
                    patient[p].getWeight_int()>=50 &&
                    patient[p].getWeight_lbs_int()>=110 ) {
                return true;
            }else{
                return false;
            }           
            
        }
        return true;
    }
    
    
}
