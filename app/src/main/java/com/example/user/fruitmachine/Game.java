package com.example.user.fruitmachine;

import java.util.Scanner;

import static com.example.user.fruitmachine.Symbol.BELL;
import static com.example.user.fruitmachine.Symbol.JACKPOT;


public class Game {

    Player player;
    Machine machine;
    private int credits;

    public Game(Machine machine, Player player){
        this.machine = machine;
        this.player = player;
        this.credits = 0;
    }

    public void play() {

        Game game = new Game(machine, player);

        System.out.println("WELCOME TO BANDIT COUNTRY!");
        System.out.println();
        System.out.println("Credit: " + game.getCredits());
        System.out.println("Bank: " + machine.getBank());
        System.out.println();
        System.out.println("Jackpot available: " + game.jackpotAvailable());
        System.out.println();

        if (game.getCredits() == 0){
            System.out.println("Credits: 0");
            System.out.println("Player wallet:" + player.getWallet());
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("How much funds do you wish to credit from wallet? (NUMBERS ONLY)");

        while (!sc.hasNextInt()) sc.next();

        int num1 = sc.nextInt();
        if (player.getWallet() >= num1) {
            game.makeDeposit(num1);
            System.out.println();
            System.out.println("Credit added!  Let the Games Commence!");
            player.buyCredit(num1);
            System.out.println();
            System.out.println("Credit: " + game.getCredits());
            System.out.println("Bank: " + machine.getBank());
        } else {
            System.out.println("Insufficient funds! Security has been called.");
        }

        while (game.minPrizeAvailable() == true && game.getCredits() >= 1) {

            System.out.println();
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Press S and ENTER to SPIN THE WHEELS!");
            System.out.println("Press C and ENTER to Cash Out!");
            String answer = sc1.nextLine().toUpperCase();
            if (answer.equals("C")) {
                int credit = game.getCredits();
                player.cashOut(credit);
                game.cashOutCredits(credit);
                System.out.println();
                System.out.println("Cashed out! Game over.");
                System.out.println();
                System.out.println("Player wallet:" + player.getWallet());
                System.out.println("Credit: " + game.getCredits());
            }

            if (answer.equals("S")) {
                System.out.println("HOLD ON TO YOUR HATS!!! WOOOOO....");
                System.out.println();
                game.reduceCredits();

                Symbol result1 = machine.getWheel1().getRandomSymbol();
                System.out.println(result1);

                Symbol result2 = machine.getWheel2().getRandomSymbol();
                System.out.println(result2);

                Symbol result3 = machine.getWheel3().getRandomSymbol();
                System.out.println(result3);

                if (playerWin(result1, result2, result3) == true && result1.value <= machine.getBank()){
                    System.out.println();
                    System.out.println("ABSOLUTE SCENES! You win " + (result1.value) + "! Make sure to treat your Mother.");
                    machine.debitBalance(result1.value);
                    game.increaseCredits(result1);
                } else {
                    System.out.println();
                    System.out.println("No win this time, please try again!");
                }

                System.out.println();
                System.out.println("Credit: " + game.getCredits());
                System.out.println("Bank: " + machine.getBank());
                System.out.println();

                if (game.getCredits() >= 1){
                System.out.println();
                } else {
                System.out.println("NO CREDIT! Please insert more funds!");
                System.out.println();
                System.out.println("Player wallet:" + player.getWallet());
                System.out.println();

                Scanner sc2 = new Scanner(System.in);
                System.out.println("How much funds do you wish to credit? (NUMBERS ONLY)");
                while (!sc2.hasNextInt()) sc.next();
                int num2 = sc2.nextInt();
                if (player.getWallet() >= num2) {
                game.makeDeposit(num2);
                System.out.println();
                System.out.println("Credit added!  Let the Games Commence!");
                    player.buyCredit(num2);
                System.out.println();
                System.out.println("Credit: " + game.getCredits());
                System.out.println("Bank: " + machine.getBank());
                } else{
                System.out.println("Insufficient funds! Security has been called.");
                }
//              IF ENTER CHAR here Program BREAKS
            }
        }
    }
    }


    public int getCredits() {
        return credits;
    }

    public void makeDeposit(int deposit) {

        this.credits += deposit;
        machine.creditBalance(deposit);
    }

    public void reduceCredits(){
        this.credits -= 1;
    }

    public void cashOutCredits(int debit){
        this.credits -= debit;
    }

    public void increaseCredits(Symbol symbol){
        int winnings = symbol.value;
        this.credits += winnings;
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
        if (machine.getBank() >= JACKPOT.value){
            return "Yes";
        } else {
            return "No";
        }
    }

    public boolean minPrizeAvailable(){
        if (machine.getBank() >= BELL.value){
            return true;
        } else{
            return false;
        }
    }

    public boolean playerWin(Symbol result1, Symbol result2, Symbol result3) {
        if (result1 == result2 && result2 == result3) {
            return true;
        } else {
            return false;
        }
    }



}
