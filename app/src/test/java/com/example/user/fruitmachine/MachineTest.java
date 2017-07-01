package com.example.user.fruitmachine;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 01/07/2017.
 */

public class MachineTest {

    Machine machine;

    @Before
    public void before(){
        machine = new Machine(50);
    }

    @Test
    public void canGetBank() throws Exception {
        assertEquals(50, machine.getBank());
    }

    @Test
    public void canSetBank() throws Exception {
        machine.setBank(100);
        assertEquals(100, machine.getBank());
    }

    @Test
    public void canCreditBalance(){
        machine.creditBalance(20);
        assertEquals(70, machine.getBank());
    }

}
