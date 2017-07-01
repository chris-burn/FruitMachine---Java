package com.example.user.fruitmachine;

/**
 * Created by user on 01/07/2017.
 */

public class Machine {

    int bank;

    public Machine(int bank) {
        this.bank = bank;
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
}
