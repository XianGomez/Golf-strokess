package edu.teamrocket.golfstrokes;

import java.util.List;

public class Stableford implements GolfPlay {

    @Override
    public void scoring(ScoreCard scoreCard) {
        List<Hole> holes = scoreCard.getHoles();

        for (Player player : scoreCard.getPlayers()) {
            byte[] playerStrokes = scoreCard.getPlayerCourse(player);
            int totalPoints = 0;

            for (int i = 0; i < holes.size(); i++) {
                int par = holes.get(i).getPar();
                int strokes = playerStrokes[i]; 

                int difference = strokes - par;
                
                StablefordSystem level = StablefordSystem.getLevel(difference);
                totalPoints += level.getPoints();
            }

            player.setPuntos_Stableford(totalPoints);
        }
    }
}