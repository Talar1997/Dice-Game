package com.Talar;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Player player = new Player();
        player.setName("");
        player.setName(null);

        boolean gameResult = false;
        int generatedNumber;
        int playerNumber;

        while(!gameResult){
            generatedNumber = rand.nextInt(6) + 1;
            playerNumber = player.guess();
            if(playerNumber==generatedNumber) gameResult = true;
            System.out.println(player.getName() + ": " + playerNumber + ", wylosowana: " + generatedNumber);
        }
        System.out.println("Koniec");
    }
}
