/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.assign2b;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chief_kmv
 */
public class Patient {
    
    ArrayList<Integer> age= new ArrayList<>();
    ArrayList<Integer> res_rate= new ArrayList<>();
    ArrayList<Integer> heart_rate= new ArrayList<>();
    ArrayList<Integer> blood_pressure= new ArrayList<>();
    ArrayList<Integer> weight= new ArrayList<>();
    ArrayList<Integer> weight_lbs= new ArrayList<>();
    String name=new String();
    
    int weight_int;
    int weight_lbs_int;
    int res_rate_int;
    int heart_rate_int;
    int bp_int;

    public int getWeight_int() {
        return weight_int;
    }

    public void setWeight_int(int weight_int) {
        weight.add(weight_int);
        this.weight_int = weight_int;
    }

    public int getWeight_lbs_int() {
        return weight_lbs_int;
    }

    public void setWeight_lbs_int(int weight_lbs_int) {
        weight_lbs.add(weight_lbs_int);
        this.weight_lbs_int = weight_lbs_int;
    }

    public int getRes_rate_int() {
        return res_rate_int;
    }

    public void setRes_rate_int(int res_rate_int) {
        res_rate.add(res_rate_int);
        this.res_rate_int = res_rate_int;
    }

    public int getHeart_rate_int() {
        return heart_rate_int;
    }

    public void setHeart_rate_int(int heart_rate_int) {
        heart_rate.add(heart_rate_int);
        this.heart_rate_int = heart_rate_int;
    }

    public int getBp_int() {
        return bp_int;
    }

    public void setBp_int(int bp_int) {
        blood_pressure.add(bp_int);
        this.bp_int = bp_int;
    }

    public int getAge_int() {
        return age_int;
    }

    public void setAge_int(int age_int) {
        age.add(age_int);
        this.age_int = age_int;
    }
    int age_int;

 
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public List<Integer> getAge() {
        return age;
    }

    public void setAge(ArrayList<Integer> age) {
        this.age = age;
    }

    public List<Integer> getRes_rate() {
        return res_rate;
    }

    public void setRes_rate(ArrayList<Integer> res_rate) {
        this.res_rate = res_rate;
    }

    public List<Integer> getHeart_rate() {
        return heart_rate;
    }

    public void setHeart_rate(ArrayList<Integer> heart_rate) {
        this.heart_rate = heart_rate;
    }

    public List<Integer> getBlood_pressure() {
        return blood_pressure;
    }

    public void setBlood_pressure(ArrayList<Integer> blood_pressure) {
        this.blood_pressure = blood_pressure;
    }

    public List<Integer> getWeight() {
        return weight;
    }

    public void setWeight(ArrayList<Integer> weight) {
        this.weight = weight;
    }

    public List<Integer> getWeight_lbs() {
        return weight_lbs;
    }

    public void setWeight_lbs(ArrayList<Integer> weight_lbs) {
        this.weight_lbs = weight_lbs;
    }
    
    
}
