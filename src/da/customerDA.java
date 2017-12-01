/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da;

import domain.customer;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class customerDA {

    int i;

    public customer getCustomer(String number) {
        customer cust = null;
        String name = "Lily";
        String address = "No1,Jalan 8,Selangor";
        String num = "016-1234567";
        String orderID = "ABC123";
        cust = new customer(name, address, num, orderID);
        return cust;

    }
}
