/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labassign1;
import labassign1.Address;
/**
 *
 * @author chief_kmv
 */
public class Person {
    String first_name= new String("Krutarth");
    String last_name;
    String age;
    Address work=new Address();
    Address local=new Address();
    Address home=new Address();

    public Address getWork() {
        return work;
    }

    public void setWork(Address work) {
        this.work = work;
    }

    public Address getLocal() {
        return local;
    }

    public void setLocal(Address local) {
        this.local = local;
    }

    public Address getHome() {
        return home;
    }

    public void setHome(Address home) {
        this.home = home;
    }
    
    

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    
    
    
    
    
}
