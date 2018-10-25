package com.Talar;
import java.util.Random;

public abstract class Player {
    private String name = "Domyslny player";
    final Random rand = new Random();

    public Player(){}

    public Player(String name){
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public abstract int guess();
}
