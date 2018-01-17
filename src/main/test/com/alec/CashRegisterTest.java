package com.alec;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Alec on 12/28/17.
 */
public class CashRegisterTest {

    @Test
    public void part1() {

        CashRegister register1 = new CashRegister(2, 5);   // call constructor

        Assert.assertTrue(register1.getTotalCash() == 2);
        Assert.assertTrue(register1.getItems() == 5);
        Assert.assertTrue(register1.getAveragePricePerItem()  == 0.4);
        System.out.println(register1.toString());

        CashRegister register2 = new CashRegister(100, 15);
        System.out.println(register2.toString());
    }
}



