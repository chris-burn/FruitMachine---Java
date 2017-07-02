package com.example.user.fruitmachine;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static com.example.user.fruitmachine.Symbol.BELL;
import static com.example.user.fruitmachine.Symbol.JACKPOT;
import static com.example.user.fruitmachine.Symbol.LEMON;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 01/07/2017.
 */

public class GameTest {

    Game game;
    Wheel wheel1;
    Wheel wheel2;
    Wheel wheel3;
    Machine machine;
    Player player;
    Symbol symbol;

    @Before
    public void before(){
        this.player = new Player(20);
        this.wheel1 = new Wheel();
        this.wheel2 = new Wheel();
        this.wheel3 = new Wheel();
        this.machine = new Machine(50, wheel1, wheel2, wheel3);
        this.game = new Game(0, machine);
    }


    @Test
    public void canPlayerBuyCredits(){
        game.makeDeposit(10);
        assertEquals(10, game.player.getWallet());
        assertEquals(10, game.getCredits());
        assertEquals(60, game.machine.getBank());
    }

    @Test
    public void canShowCredits(){
        assertEquals(0, game.getCredits());
    }

    @Test
    public void canSetCredits(){
        game.setCredits(10);
        assertEquals(10, game.getCredits());
    }

    @Test
    public void canReduceCredit(){
        game.setCredits(10);
        game.reduceCredits();
        assertEquals(9, game.getCredits());
    }

    @Test
    public void canGameStart(){
        assertEquals(false, game.creditCheck());
    }

    @Test
    public void isJackpotAvailableTest(){
       assertEquals("Yes", game.jackpotAvailable());
    }

    @Test
    public void isMinPrizeAvailableTest(){
        assertEquals(true, game.minPrizeAvailable());
    }

    @Test
    public void canNewGameHasThreeLoadedWheels(){
        assertEquals(6, wheel1.getWheelSize());
        assertEquals(6, wheel2.getWheelSize());
        assertEquals(6, wheel3.getWheelSize());
    }

    @Test
    public void checkWin() throws Exception {
//        Wheel spyWheel1 = Mockito.spy(this.wheel1);
//        Wheel spyWheel2 = Mockito.spy(this.wheel2);
//        Wheel spyWheel3 = Mockito.spy(this.wheel3);
//        Mockito.when(spyWheel1.getRandomSymbol()).thenReturn(BELL);
//        Mockito.when(spyWheel2.getRandomSymbol()).thenReturn(BELL);
//        Mockito.when(spyWheel3.getRandomSymbol()).thenReturn(BELL);
//        assertEquals(BELL, spyWheel1.getRandomSymbol());
//        assertEquals(BELL, spyWheel2.getRandomSymbol());
//        assertEquals(BELL, spyWheel3.getRandomSymbol());
        Symbol symbol1 = BELL;
        Symbol symbol2 = BELL;
        Symbol symbol3 = BELL;
        assertEquals(true, game.playerWin(symbol1, symbol2, symbol3));
    }

    @Test
    public void checkIncreaseCredits(){
        assertEquals(0, game.getCredits());
        game.increaseCredits(LEMON);
        assertEquals(15, game.getCredits());
    }

    @Test
    public void canCashOutCredits(){
        assertEquals(0, game.getCredits());
        game.setCredits(10);
        assertEquals(10, game.getCredits());
        game.cashOutCredits(10);
        assertEquals(0, game.getCredits());
    }

}
