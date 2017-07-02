package com.example.user.fruitmachine;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static com.example.user.fruitmachine.Symbol.BELL;
import static com.example.user.fruitmachine.Symbol.JACKPOT;
import static com.example.user.fruitmachine.Symbol.LEMON;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

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

    @Before
    public void before(){
        player = new Player(20);
        game = new Game(0);
        wheel1 = new Wheel();
        wheel2 = new Wheel();
        wheel3 = new Wheel();
        machine = new Machine(50);
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
    public void canGameStart(){
        assertEquals(false, game.creditCheck());
    }

    @Test
    public void isJackpotAvailableTest(){
       assertEquals("Yes", game.jackpotAvailable());
    }

    @Test
    public void canMakeThreeLoadedWheels(){
        assertEquals(6, wheel1.getWheelSize());
        assertEquals(6, wheel2.getWheelSize());
        assertEquals(6, wheel3.getWheelSize());
    }

    @Test
    public void checkWin() throws Exception {
        Wheel spyWheel1 = Mockito.spy(wheel1);
        Wheel spyWheel2 = Mockito.spy(wheel2);
        Wheel spyWheel3 = Mockito.spy(wheel3);
        Mockito.when(spyWheel1.getRandomSymbol()).thenReturn(BELL);
        Mockito.when(spyWheel2.getRandomSymbol()).thenReturn(BELL);
        Mockito.when(spyWheel3.getRandomSymbol()).thenReturn(BELL);
        assertEquals(true, game.playerWin());
    }



//    @Test
//    public void canCheckWinningValue(){
//        player.win() == true
//    }
//
//    @Test
//    public void canMachinePayoutPrize(){
//        assertEquals(true, game.payoutCheck());
//
//    }
//
//    @Test
//    public void canAddWinningsToPlayerWallet(){
//
//    }
//
//
//    @Test
//    public void canPlayerReceivePrize(){
//
//    }


//    @Test
//    public void canPlayerWinJackpot(){
//        Wheel spyWheel1 = Mockito.spy(wheel1);
//        Mockito.when(spyWheel1.getRandomSymbol()).thenReturn(JACKPOT);
//
//        Wheel spyWheel2 = Mockito.spy(wheel2);
//        Mockito.when(spyWheel2.getRandomSymbol()).thenReturn(JACKPOT);
//
//        Wheel spyWheel3 = Mockito.spy(wheel3);
//        Mockito.when(spyWheel3.getRandomSymbol()).thenReturn(JACKPOT);
//
//        assertEquals("YOU WIN THE JACKPOT!", game.winJackpot());
//    }
//
//    @Test
//    public void canPlayerWinLemon(){
//
//    }
//
//    @Test
//    public void canPlayerWinBar(){
//
//    }
//
//    @Test
//    public void canPlayerWinBell(){
//
//    }
//
//    @Test
//    public void canPlayerWinSeven(){
//
//    }
//
//    @Test
//    public void canPlayerWinCherry(){
//
//    }

}
