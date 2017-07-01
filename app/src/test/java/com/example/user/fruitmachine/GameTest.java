package com.example.user.fruitmachine;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 01/07/2017.
 */

public class GameTest {

    Game game;
    Wheel wheel;
    Machine machine;
    Player player;

    @Before
    public void before(){
        player = new Player(20);
        game = new Game(0);
        Wheel wheel1 = new Wheel();
        Wheel wheel2 = new Wheel();
        Wheel wheel3 = new Wheel();
        machine = new Machine(50);
    }


    @Test
    public void canPlayerBuyCredit(){
        game.makeDeposit(10);
        assertEquals(10, player.getWallet());
        assertEquals(10, game.getCredits());
        assertEquals(60, machine.getBank());
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

//
//    @Test
//    public void canShowBank(){
//
//    }
//
//
//    @Test
//    public void canGameStart(){
//
//    }
//
//
//    @Test
//    public void isJackpotAvailableTest(){
//       assertEquals("Yes", game.jackpotAvailable());
//    }
//
//
//    @Test
//    public void canMakeThreeLoadedWheels(){
//
//    }
//
//    @Test
//    public void canSpinAllWheels(){
//
//    }
//
//    @Test
//    public void canPlayerWinJackpot(){
//
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
//
//    @Test
//    public void canPlayerLose(){
//
//    }
//
//    @Test
//    public void canMachinePayoutPrize(){
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

}
