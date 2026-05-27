package edu.teamrocket.golfstrokes;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class ScoreCard {
    private Optional<Player> playerA = Optional.empty();
    private Optional<Player> playerB = Optional.empty();
    private Optional<Player> playerC = Optional.empty();
    private Optional<Player> playerD = Optional.empty();

    

    private Course playersCourse;

    public ScoreCard() {}

    public void setPlayerA(Player playerA) {
        this.playerA = Optional.of(playerA);
    }

    public Optional<Player> getPlayerA() {
        return playerA;
    }

    public void setPlayerB(Player playerB) {
        this.playerB = Optional.of(playerB);
    }

    public Optional<Player> getPlayerB() {
        return playerB;
    }

    public void setPlayerC(Player playerC) {
        this.playerC = Optional.of(playerC);
    }

    public Optional<Player> getPlayerC() {
        return playerC;
    }

    public void setPlayerD(Player playerD) {
        this.playerD = Optional.of(playerD);
    }

    public Optional<Player> getPlayerD() {
        return playerD;
    }

    public void setPlayersCourse(Course playersCourse) {
        this.playersCourse = playersCourse;
    }

    public Course getPlayersCourse() {
        return playersCourse;
    }

    public byte[] getPlayerCourse(Player player) {
        return this.playersCourse.getPlayerCourse(player);
    }

    public List<Player> getPlayers() {
        List<Player> presentPlayers = new ArrayList<>();

        List<Optional<Player>> allPlayers = Arrays.asList(playerA, playerB, playerC, playerD);

        for (Optional<Player> playerOpt : allPlayers) {
            if (playerOpt.isPresent()) {
                presentPlayers.add(playerOpt.get());
            }
        }

        return presentPlayers;
    }

    
}
