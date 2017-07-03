package com.example.user.fruitmachine;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 01/07/2017.
 */

public class MachineTest {

    Machine machine;
    Wheel wheel1;
    Wheel wheel2;
    Wheel wheel3;

    @Before
    public void before(){
        wheel1 = new Wheel();
        wheel2 = new Wheel();
        wheel3 = new Wheel();
        machine = new Machine(60, wheel1, wheel2, wheel3);
    }

    @Test
    public void canGetBank() throws Exception {
        assertEquals(60, machine.getBank());
    }

    @Test
    public void canSetBank() throws Exception {
        machine.setBank(100);
        assertEquals(100, machine.getBank());
    }

    @Test
    public void canCreditBalance(){
        machine.creditBalance(20);
        assertEquals(80, machine.getBank());
    }

    @Test
    public void canDebitBalance(){
        machine.debitBalance(20);
        assertEquals(40, machine.getBank());
    }




}
