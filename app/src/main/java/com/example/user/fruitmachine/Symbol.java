package com.example.user.fruitmachine;

/**
 * Created by user on 30/06/2017.
 */

public enum Symbol {

    CHERRY(2),
    SEVEN(4),
    BELL(6),
    BAR(10),
    LEMON(15),
    JACKPOT(30);

    int value;

    Symbol(int value){
        this.value = value;
    }
//    CONSTRUCTOR, setting INT to Rank

    public int getValue(){
        return this.value;
    }


}
