/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import da.customerDA;
import domain.customer;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class MaintainProgrammeControl {

    private customer cust;
    private customerDA custDA;

    public MaintainProgrammeControl() {
        custDA = new customerDA();
    }

    public customer customerRecord(String number) {
        return custDA.getCustomer(number);
    }
}
