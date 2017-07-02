package com.example.user.fruitmachine;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static com.example.user.fruitmachine.Symbol.BAR;
import static com.example.user.fruitmachine.Symbol.BELL;
import static com.example.user.fruitmachine.Symbol.CHERRY;
import static com.example.user.fruitmachine.Symbol.JACKPOT;
import static com.example.user.fruitmachine.Symbol.LEMON;
import static com.example.user.fruitmachine.Symbol.SEVEN;
import static org.junit.Assert.assertArrayEquals;
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
        machine = new Machine(50, wheel1, wheel2, wheel3);
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

//    @Test
//    public void canGetWheel(){
//        Wheel expectedArray = CHERRY,SEVEN,BELL,BAR,LEMON,JACKPOT;
//        Wheel resultArray = machine.getWheel1();
//
//        assertEquals(expectedArray, resultArray);
//    }


}
