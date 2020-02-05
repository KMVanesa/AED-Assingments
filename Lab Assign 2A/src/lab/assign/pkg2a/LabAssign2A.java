/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.assign.pkg2a;

import java.util.Scanner;

/**
 *
 * @author chief_kmv
 */
public class LabAssign2A {
    static Vital_Signs Patient1=new Vital_Signs();
    static Scanner scan = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      getPatientInfo();
      
        if (isPatientNormal()==false) {
            System.out.println("Condition-----Abnormal--------");
            
        }else if(isPatientNormal()==true){
            System.out.println("Condition-----Normal-----------");
        }
      
    }
    static void getPatientInfo(){
        System.out.println("Enter the age of Person:");
        Patient1.setAge(scan.nextInt());
        
        System.out.println("Enter the Respiratory Rate:");
        Patient1.setRes_rate(scan.nextInt());
        
        System.out.println("Enter the Blood Pressure:");
        Patient1.setBlood_pressure(scan.nextInt());
        
        System.out.println("Enter the Heart Rate:");
        Patient1.setHeart_rate(scan.nextInt());
        
        System.out.println("Enter the Weight(Kgs):");
        Patient1.setWeight(scan.nextInt());
        
        System.out.println("Enter the Weight(lbs):");
        Patient1.setWeight_pounds(scan.nextInt());
    }
    static boolean isPatientNormal(){
        System.out.println(Patient1.getAge());
        if(Patient1.getAge()==0){
            //System.out.println("Infant");
            if (Patient1.getRes_rate()>=30 && Patient1.getRes_rate()<=50 && 
                    Patient1.getHeart_rate()>=120 && Patient1.getHeart_rate()<=160 && 
                    Patient1.getBlood_pressure()>=50 && Patient1.getBlood_pressure()<=70 &&
                    Patient1.getWeight()>=2 && Patient1.getWeight()<=3 &&
                    Patient1.getWeight_pounds()>=4 && Patient1.getWeight_pounds()<=7) {
                return true;
            }else{
                return false;
            }
        }else if(Patient1.getAge()>=0 && Patient1.getAge()<=1){
            //System.out.println("Infant");
            if (Patient1.getRes_rate()>=20 && Patient1.getRes_rate()<=30 && 
                    Patient1.getHeart_rate()>=80 && Patient1.getHeart_rate()<=140 && 
                    Patient1.getBlood_pressure()>=70 && Patient1.getBlood_pressure()<=100 &&
                    Patient1.getWeight()>=4 && Patient1.getWeight()<=10 &&
                    Patient1.getWeight_pounds()>=9 && Patient1.getWeight_pounds()<=22) {
                return true;
            }else{
                return false;
            }           
        }else if(Patient1.getAge()>1 && Patient1.getAge()<=3){
            //System.out.println("Toddler");
            if (Patient1.getRes_rate()>=20 && Patient1.getRes_rate()<=30 && 
                    Patient1.getHeart_rate()>=80 && Patient1.getHeart_rate()<=130 && 
                    Patient1.getBlood_pressure()>=80 && Patient1.getBlood_pressure()<=110 &&
                    Patient1.getWeight()>=4 && Patient1.getWeight()<=10 &&
                    Patient1.getWeight_pounds()>=9 && Patient1.getWeight_pounds()<=22) {
                return true;
            }else{
                return false;
            }           
            
        }else if(Patient1.getAge()>3 && Patient1.getAge()<=5){
            //System.out.println("school");
            if (Patient1.getRes_rate()>=20 && Patient1.getRes_rate()<=30 && 
                    Patient1.getHeart_rate()>=80 && Patient1.getHeart_rate()<=120 && 
                    Patient1.getBlood_pressure()>=80 && Patient1.getBlood_pressure()<=110 &&
                    Patient1.getWeight()>=14 && Patient1.getWeight()<=18 &&
                    Patient1.getWeight_pounds()>=32 && Patient1.getWeight_pounds()<=40) {
                return true;
            }else{
                return false;
            }           
            
        }else if(Patient1.getAge()>=6 && Patient1.getAge()<=12){
           // System.out.println("bacha");
            if (Patient1.getRes_rate()>=20 && Patient1.getRes_rate()<=30 && 
                    Patient1.getHeart_rate()>=80 && Patient1.getHeart_rate()<=120 && 
                    Patient1.getBlood_pressure()>=80 && Patient1.getBlood_pressure()<=110 &&
                    Patient1.getWeight()>=20 && Patient1.getWeight()<=42 &&
                    Patient1.getWeight_pounds()>=41 && Patient1.getWeight_pounds()<=92) {
                return true;
                
            }else{
                return false;
            }           
            
        }else if(Patient1.getAge()>12){
            
           // System.out.println("Adult");
            if (Patient1.getRes_rate()>=12 && Patient1.getRes_rate()<=20 && 
                    Patient1.getHeart_rate()>=55 && Patient1.getHeart_rate()<=105 && 
                    Patient1.getBlood_pressure()>=110 && Patient1.getBlood_pressure()<=120 &&
                    Patient1.getWeight()>=50 &&
                    Patient1.getWeight_pounds()>=110 ) {
                return true;
            }else{
                return false;
            }           
            
        }
        return true;
    }
}
