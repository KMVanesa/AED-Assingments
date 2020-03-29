/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Order.Order;
import Business.Restaurant.Dishes;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Customer {
    private String Name;
     private String UserName;
      private ArrayList<Order> orderList;
     public void addOrder(String restaurentName, String customerName, String deliverMan, ArrayList<Dishes> Order, String cost, String deliveryAddress) {
        Order order=new Order();
        order.setCustomerName(customerName);
        order.setRestaurentName(restaurentName);
        order.setDeliverMan(deliverMan);
        order.setOrder(Order);
        order.setCost(cost);
        order.setDeliveryAddress(deliveryAddress);
        orderList.add(order);
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    private ArrayList<Order> order;
    private String address;
    private String number;

    public Customer(String UserName){
        this.UserName=UserName;
        order=new ArrayList<Order>();
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public ArrayList<Order> getOrder() {
        return order;
    }

    public void setOrder(ArrayList<Order> order) {
        this.order = order;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    
}
