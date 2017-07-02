package com.example.user.fruitmachine;

/**
 * Created by user on 01/07/2017.
 */

public class Machine {

    int bank;
    Wheel wheel1;
    Wheel wheel2;
    Wheel wheel3;

    public Machine(int bank, Wheel wheel1, Wheel wheel2, Wheel wheel3) {
        this.bank = bank;
        this.wheel1 = wheel1;
        this.wheel2 = wheel2;
        this.wheel3 = wheel3;
    }

    public int getBank() {
        return bank;
    }

    public void setBank(int bank) {
        this.bank = bank;
    }

    public void creditBalance(int credit) {
        this.bank += credit;
    }

    public Wheel getWheel1() {
        return wheel1;
    }

    public Wheel getWheel2() {
        return wheel2;
    }

    public Wheel getWheel3() {
        return wheel3;
    }


}



