package com.Talar;

import com.Talar.Players.Player;
import com.Talar.Statistics.NullStatistics;
import com.Talar.Statistics.Statistics;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;
import java.util.Iterator;

public class Game {
    protected List<Player> players = new ArrayList<Player>();
    protected Random rand = new Random();
    protected Statistics stats;

    public Game(Statistics stats){
        this.stats = stats;
    }

    public Game(){
        this.stats = new NullStatistics();
    }

    public void addPlayer(Player player){
        if(player != null) {
            if(!checkPlayerName(player)){
                players.add(player);
            }
            else{
                player.setName(player.getName() + rand.nextInt(10));
                addPlayer(player);
            }
        }
        else{
            throw new IllegalArgumentException("Błąd przy dodawaniu gracza. Obiekt = null");
        }
    }

    public void removePlayer(String name){
        //Zamiast while mozna uzyc for:
        //for(Iterator <Player> it = players.iterator(); it.hasNext(); ){}
        //Bedzie dzialac: zmienia sie tylko zasieg zmiennej it - w forze jest tylko wewnatrz petli
        //w przypadku whila  it jest dla calej funkcji
        //Iterator <Player> it = players.iterator();
        for(Iterator <Player> it = players.iterator(); it.hasNext(); ){
            Player p = it.next();
            if(p.getName().equals(name)){
                it.remove();
                break;
            }
        }
    }

    public void showPlayerList(){
        System.out.println("--Lista graczy: ");
        for( Player p : players ) {
            System.out.println(p.getName());
        }
    }

    private boolean checkPlayerName(Player player){
        for(Player p : players){
            if(p.getName().equals(player.getName())){
                return true;
            }
        }
        return false;
    }

    public void startGame(){
        boolean gameResult = false;
        int generatedNumber;
        int playerNumber;

        while(!gameResult){
            generatedNumber = rand.nextInt(6) + 1;
            System.out.print("Wylosowana liczba: " + generatedNumber);

            for( Player p : players ) {
                playerNumber = p.guess();
                System.out.print(" | " + p.getName() + ": " + playerNumber);
                if (playerNumber == generatedNumber) {
                    gameResult = true;
                    System.out.print(" odgadł!");
                    stats.increaseResult(p.getName());
                }
            }

            System.out.println();
        }
    }
}
