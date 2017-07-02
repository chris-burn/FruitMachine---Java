package com.example.user.fruitmachine;

import android.icu.text.SymbolTable;

import java.util.Collections;

import static com.example.user.fruitmachine.Symbol.JACKPOT;

/**
 * Created by user on 30/06/2017.
 */

public class Game {

    Wheel wheel1;
    Wheel wheel2;
    Wheel wheel3;
    Player player;
    Machine machine;
    int credits = 0;
    Symbol symbol;

    public Game(int credits){
        this.credits = credits;
        player = new Player(20);
        machine = new Machine(50, wheel1, wheel2, wheel3);
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

    public boolean creditCheck() {
        if (this.credits == 0){
            return false;
        } else {
            return true;
        }
    }

    public String jackpotAvailable() {
        if (machine.bank >= JACKPOT.value){
            return "Yes";
        } else {
            return "No";
        }
    }

//    public String winJackpot() {
//        if ((wheel1.getRandomSymbol() == JACKPOT) && (wheel2.getRandomSymbol() == JACKPOT) && (wheel3.getRandomSymbol() == JACKPOT)){
//            return "YOU WIN THE JACKPOT!";
////            this.credits =+ Symbol.JACKPOT.getValue();
//        } else {
//            return " ";
//        }
//    }

    public boolean playerWin() {
        Symbol result1 = machine.wheel1.getRandomSymbol();
        Symbol result2 = machine.wheel2.getRandomSymbol();
        Symbol result3 = machine.wheel3.getRandomSymbol();
        if (result1 == result2 && result2 == result3) {
            return true;
        } else {
            return false;
        }
    }


//    public String payoutCheck() {
//        if (machine.bank >= JACKPOT.value){
//            return "Yes";
//        } else {
//            return "No";
//        }
//    }


}
