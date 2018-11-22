package com.Talar;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
//        Player players = new PlayerComp("adam997@.");
//        Sprawdzanie wyjatkow:
//        try{
//            players.setName("111ssss");
//        }catch(IllegalArgumentException ex) {
//            System.err.println(ex.getMessage());
//        }
//
//        Implementacja list:
//        List <String> list = new ArrayList();
//        list.add("raz");
//        list.add("dwa");
//        list.add("trzy");
//        System.out.println(list);
//
//        Metoda wyciagania itemow z listy za pomoca iteratora. Plusy wzgledem foreach
//          Mozna dodawac elementy i edytowac i usuwac je. W foreach na pewno sypnie wyjatek
//        Iterator <String> it = list.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }


        Game game = new Game();
        game.addPlayer(new PlayerComp("Gracz1"));
        game.addPlayer(new PlayerComp("Talar"));
        game.addPlayer(new PlayerComp("Usun"));
        game.showPlayerList();

        game.removePlayer("Usun");
        game.showPlayerList();

        game.startGame();
    }
}