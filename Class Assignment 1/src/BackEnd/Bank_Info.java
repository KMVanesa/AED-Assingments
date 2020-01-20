/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

/**
 *
 * @author chief_kmv
 */
public class Bank_Info {
    
    String BankName=new String();
    String Type=new String();
    String Balance=new String();
    String AccNumber=new String();
    String RoutingNumber=new String();

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String BankName) {
        this.BankName = BankName;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getBalance() {
        return Balance;
    }

    public void setBalance(String Balance) {
        this.Balance = Balance;
    }

    public String getAccNumber() {
        return AccNumber;
    }

    public void setAccNumber(String AccNumber) {
        this.AccNumber = AccNumber;
    }

    public String getRoutingNumber() {
        return RoutingNumber;
    }

    public void setRoutingNumber(String RoutingNumber) {
        this.RoutingNumber = RoutingNumber;
    }
    
    
}
