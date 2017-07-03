package com.example.user.fruitmachine;

/**
 * Created by user on 30/06/2017.
 */

public enum Symbol {

    CHERRY(5),
    SEVEN(10),
    BELL(15),
    BAR(20),
    LEMON(30),
    JACKPOT(60);


    int value;

    Symbol(int value){
        this.value = value;
    }
//    CONSTRUCTOR, setting INT to Rank

    public int getValue(){
        return this.value;
    }


}
