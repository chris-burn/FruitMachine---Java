package com.example.user.fruitmachine;

import java.util.ArrayList;
import java.util.Random;


/**
 * Created by user on 30/06/2017.
 */

public class Wheel {

    Symbol symbol;
    ArrayList<Symbol> wheel;

    public Wheel(){
        this.wheel = new ArrayList<Symbol>();
        loadWheel();
    }


    public void loadWheel() {
        for (Symbol symbol : Symbol.values()) {
            wheel.add(symbol);
        }
    }

    public int getWheelSize() {
        return wheel.size();
    }

    public int prizeValue(Symbol symbol){
        return symbol.value;
    }


    public Symbol getSymbolAtIndex(int index) {
        return wheel.get(index);
    }

    public Symbol getRandomSymbol() {
        Random rand = new Random();
        int listSize = getWheelSize();

        int index = rand.nextInt(listSize);
        return getSymbolAtIndex(index);
    }

}
