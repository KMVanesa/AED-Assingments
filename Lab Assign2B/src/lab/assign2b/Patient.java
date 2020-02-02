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
    
    List<Integer> age= new ArrayList<>();
    List<Integer> res_rate= new ArrayList<>();
    List<Integer> heart_rate= new ArrayList<>();
    List<Integer> blood_pressure= new ArrayList<>();
    List<Integer> weight= new ArrayList<>();
    List<Integer> weight_lbs= new ArrayList<>();
    String name=new String();

    int ummar;

    public int getUmmar() {
        
        return ummar;
    }

    public void setUmmar(int ummar) {
        
        age.add(ummar);
        this.ummar = ummar;
    }
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public List<Integer> getAge() {
        return age;
    }

    public void setAge(List<Integer> age) {
        this.age = age;
    }

    public List<Integer> getRes_rate() {
        return res_rate;
    }

    public void setRes_rate(List<Integer> res_rate) {
        this.res_rate = res_rate;
    }

    public List<Integer> getHeart_rate() {
        return heart_rate;
    }

    public void setHeart_rate(List<Integer> heart_rate) {
        this.heart_rate = heart_rate;
    }

    public List<Integer> getBlood_pressure() {
        return blood_pressure;
    }

    public void setBlood_pressure(List<Integer> blood_pressure) {
        this.blood_pressure = blood_pressure;
    }

    public List<Integer> getWeight() {
        return weight;
    }

    public void setWeight(List<Integer> weight) {
        this.weight = weight;
    }

    public List<Integer> getWeight_lbs() {
        return weight_lbs;
    }

    public void setWeight_lbs(List<Integer> weight_lbs) {
        this.weight_lbs = weight_lbs;
    }
    
    
}
