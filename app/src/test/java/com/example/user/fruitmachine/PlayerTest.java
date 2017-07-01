package com.example.user.fruitmachine;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 01/07/2017.
 */

public class PlayerTest {

    Player player;

    @Before
    public void before(){
        player = new Player(20);
    }

    @Test
    public void canGetWallet(){
        assertEquals(20, player.getWallet());
    }

    @Test
    public void canSetWallet(){
        player.setWallet(30);
        assertEquals(30, player.getWallet());
    }

    @Test
    public void canMakePurchase(){
        player.buyCredit(5);
        assertEquals(15, player.getWallet());
    }

}
