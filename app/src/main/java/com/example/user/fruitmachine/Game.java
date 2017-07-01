package com.example.user.fruitmachine;

import java.util.Collections;

/**
 * Created by user on 30/06/2017.
 */

public class Game {

    Wheel wheel;
    Player player;
    Machine machine;
    int credits = 0;

    public Game(int credits){
        Wheel wheel1 = new Wheel();
        Wheel wheel2 = new Wheel();
        Wheel wheel3 = new Wheel();
        player = new Player(20);
        machine = new Machine(50);
        this.credits = credits;
    }


    public int getCredits() {
        return credits;
    }

    public void makeDeposit(int deposit) {
        player.buyCredit(deposit);
        this.credits =+ deposit;
        machine.creditBalance(deposit);
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}
