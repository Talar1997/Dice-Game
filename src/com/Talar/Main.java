package com.Talar;

import com.Talar.Players.PlayerComp;
import com.Talar.Statistics.Statistics;
import com.Talar.Statistics.WinStatistics;

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

        Statistics stats = new WinStatistics();
        Game game = new Game();
        game.addPlayer(new PlayerComp("Adrian"));
        game.addPlayer(new PlayerComp("Talar"));
        game.addPlayer(new PlayerComp("Usun"));
        game.showPlayerList();

        game.removePlayer("Usun");
        game.showPlayerList();

        game.startGame();
        stats.showStats();
    }
}