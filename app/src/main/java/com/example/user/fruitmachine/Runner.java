package com.example.user.fruitmachine;

/**
 * Created by user on 30/06/2017.
 */

public class Runner {

    public static void main(String[] args) {
        Wheel wheel1 = new Wheel();
        Wheel wheel2 = new Wheel();
        Wheel wheel3 = new Wheel();

        Machine machine = new Machine(30, wheel1, wheel2, wheel3);

        Game game = new Game(0, machine);

        game.play();
    }

}

