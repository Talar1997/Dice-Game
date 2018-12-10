package com.Talar.Players;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {
    private Player player;

    @Before
    public void setUp(){
        player = new PlayerComp("User");
    }

    @Test
    public void testPlayerExists() throws Exception {
        assertNotNull(player);
    }

    @Test
    public void testDefaultName() throws Exception {
        player = new PlayerComp();
        assertEquals("Domyslny gracz", player.getName());
    }

    @Test
    public void testGetNameCorrect() throws Exception {
        assertEquals("User", player.getName());
    }

    @Test
    public void testSetNameCorrect() throws Exception {
        player.setName("Janusz");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNameNull() {
        player.setName(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNameIncorrect() {
        player.setName("997adam@%");
    }

    @Test
    public void testGuess() throws Exception {
        if(player instanceof PlayerComp){
            int n = player.guess();
            if(n < 1 || n > 6){
                fail("Wylosowana liczba poza zakresem");
            }
        }
    }
}