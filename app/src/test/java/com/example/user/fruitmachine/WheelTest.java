package com.example.user.fruitmachine;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static com.example.user.fruitmachine.Symbol.BAR;
import static com.example.user.fruitmachine.Symbol.CHERRY;
import static com.example.user.fruitmachine.Symbol.JACKPOT;
import static com.example.user.fruitmachine.Symbol.LEMON;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 30/06/2017.
 */

public class WheelTest {

    Wheel wheel;

    @Before
    public void before() {
        wheel = new Wheel();
    }

    @Test
    public void canMakeNewLoadedWheel() {
        assertEquals(6, wheel.getWheelSize());
    }

    @Test
    public void canOverLoadWheel() {
        wheel.loadWheel();
        assertEquals(12, wheel.getWheelSize());
    }

    @Test
    public void canCheckSymbolValue() {
        assertEquals(60, wheel.prizeValue(JACKPOT));
    }

    @Test
    public void canGetSymbolAtIndex() throws Exception {
        Symbol result = wheel.getSymbolAtIndex(0);
        assertEquals(CHERRY, result);
    }

    @Test
    public void canGetRandomSymbol() throws Exception {
        Wheel spyWheel = Mockito.spy(wheel);
        Mockito.when(spyWheel.getRandomSymbol()).thenReturn(LEMON);

        assertEquals(LEMON, spyWheel.getRandomSymbol());
    }



}