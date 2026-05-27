package edu.teamrocket;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.teamrocket.golfstrokes.Player;

public class TestPlayer {
    Player mjPlayer = new Player( "MJ", (byte) 12);
    
    @Test
    public void testPlayer() {
        assertEquals("Jugador: MJ Handicap: 12", mjPlayer.toString());
    }
}
