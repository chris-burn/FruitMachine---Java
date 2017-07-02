package com.example.user.fruitmachine;

/**
 * Created by user on 30/06/2017.
 */

public class Player {

    int wallet;

    public Player(int wallet){
        this.wallet = wallet;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public void buyCredit(int deposit) {
        wallet -= deposit;
    }

}
