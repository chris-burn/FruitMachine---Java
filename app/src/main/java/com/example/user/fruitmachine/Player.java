package com.example.user.fruitmachine;


public class Player {

    private int wallet;

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

    public void cashOut(int credit){
        wallet += credit;
    }

}
