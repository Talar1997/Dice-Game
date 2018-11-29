package com.Talar.Statistics;

import java.util.Map;
import java.util.HashMap;

public class WinStatistics implements Statistics{
    private Map<String, Integer> stats = new HashMap<>();

    public WinStatistics(){ }

    public void increaseResult(String name){
        int score = stats.getOrDefault(name,0);
        stats.put(name, ++score);
    }

    public void showStats(){
        for( String name: stats.keySet()){
            System.out.println(name + ": " + stats.get(name));
        }
    }

    public void reset(){
        stats.clear();
    }
}
