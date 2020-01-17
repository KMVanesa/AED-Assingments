/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonDetails;
import PersonDetails.Address;
/**
 *
 * @author chief_kmv
 */
public class Person {
    String fname;
    String lname;
    String DOB;
    public Address work=new Address();
    public Address local=new Address();
    public Address home=new Address();
    

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
    

    public Address getWork() {
        return work;
    }
    

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getDOB() {
        return DOB;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
    
}
