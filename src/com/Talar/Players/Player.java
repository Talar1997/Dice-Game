package com.Talar.Players;
import java.util.Random;

public abstract class Player {
    private String name = "Domyslny players";
    final Random rand = new Random();

    public Player(){}

    public Player(String name){
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String regEx = "^[a-zA-Z][a-zA-Z0-9_\\-.@]{2,29}$";
        if(name != null && name.matches(regEx)) {
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("Imie puste, null lub niezgodne ze wzorem");
        }
    }

    public abstract int guess();
}
