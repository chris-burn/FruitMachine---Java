package com.example.user.fruitmachine;


public class Runner {

    public static void main(String[] args) {
        Wheel wheel1 = new Wheel();
        Wheel wheel2 = new Wheel();
        Wheel wheel3 = new Wheel();

        Machine machine = new Machine(60, wheel1, wheel2, wheel3);
        Player player = new Player(30);

        Game game = new Game(machine, player);

        game.play();
    }

}

