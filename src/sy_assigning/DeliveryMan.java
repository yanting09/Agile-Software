/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sy_assigning;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class DeliveryMan {

    String id;
    String name;
    String status;
    
   private ArrayList<DeliveryMan> deliveryList;

    public DeliveryMan() {
    }

    public DeliveryMan(String id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public ArrayList<DeliveryMan> getDeliveryMan(){
        deliveryList = new ArrayList<DeliveryMan>();
        deliveryList.add(new DeliveryMan("DM001", "Yap Wei Keat", "Delivering"));
        deliveryList.add(new DeliveryMan("DM002", "Ting Sze Yan", "Pending"));
        deliveryList.add(new DeliveryMan("DM003", "Yong Wei Sheong", "Pending"));
        deliveryList.add(new DeliveryMan("DM004", "Yong Zhi Qian", "Delivering"));
        deliveryList.add(new DeliveryMan("DM005", "Liew Cheng Khai", "Delivering"));
        return deliveryList;
    }
    
}
