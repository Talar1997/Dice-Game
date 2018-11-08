package com.Talar;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        //Player player = new Player("Nickname");
        Player player = new PlayerComp("adam997@.");

        try{
            player.setName("111ssss");
        }catch(IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }

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