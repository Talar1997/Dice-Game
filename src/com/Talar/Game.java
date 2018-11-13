package com.Talar;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class Game {
    protected List<Player> player = new ArrayList<Player>();

    public void addPlayer(Player player){
        this.player.add(player);
    }

    public void startGame(){
        Random rand = new Random();
        boolean gameResult = false;
        int generatedNumber;
        int playerNumber;
        String winner = "";

        while(!gameResult){
            generatedNumber = rand.nextInt(6) + 1;
            System.out.print("Wylosowana liczba: " + generatedNumber);

            for( Player p : player ) {
                playerNumber = p.guess();
                if (playerNumber == generatedNumber) {
                    gameResult = true;
                    winner = p.getName();
                }

                System.out.print(" | " + p.getName() + ": " + playerNumber);
            }
            System.out.println();
        }
        System.out.println("Koniec! Zwyciezca: " + winner);
    }
}
