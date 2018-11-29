package com.Talar.Players;

public class PlayerComp extends Player {
    public PlayerComp() { }

    public PlayerComp(String name) {
        super(name);
    }

    @Override
    public int guess() {
        return rand.nextInt(6) + 1;
    }
}
