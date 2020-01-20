/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;
import BackEnd.Address_Info;
import BackEnd.Bank_Info;
import BackEnd.General_Info;
import BackEnd.Medical_Info;
/**
 *
 * @author chief_kmv
 */
public class Personal_Info {
    public Address_Info Address1=new Address_Info();
    public Bank_Info Bank1=new Bank_Info();
    public General_Info General1=new General_Info();
    public Medical_Info Medical1=new Medical_Info();
    
    String Pic_Path=new String();

    public String getPic_Path() {
        return Pic_Path;
    }

    public void setPic_Path(String Pic_Path) {
        this.Pic_Path = Pic_Path;
    }

    public Address_Info getAddress1() {
        return Address1;
    }

    public void setAddress1(Address_Info Address1) {
        this.Address1 = Address1;
    }

    public Bank_Info getBank1() {
        return Bank1;
    }

    public void setBank1(Bank_Info Bank1) {
        this.Bank1 = Bank1;
    }

    public General_Info getGeneral1() {
        return General1;
    }

    public void setGeneral1(General_Info General1) {
        this.General1 = General1;
    }

    public Medical_Info getMedical1() {
        return Medical1;
    }

    public void setMedical1(Medical_Info Medical1) {
        this.Medical1 = Medical1;
    }
    
    
    
}
