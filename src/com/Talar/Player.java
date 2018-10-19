package com.Talar;
import java.util.Random;

public class Player {
    private String name = "Domyslny player";
    Random rand = new Random();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public int guess() {
        return rand.nextInt(6) + 1;
    }
}
