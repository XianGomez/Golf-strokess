package edu.teamrocket.golfstrokes;

public class StrokePlay implements GolfPlay{
    
    @Override
    public void scoring(ScoreCard scoreCard) {

        for (Player player : scoreCard.getPlayers()) {

            byte[] scores = scoreCard.getPlayerCourse(player);

            int totalScore = 0;

            for(byte score : scores) {
                
                totalScore += score;
            }

            player.setScore(totalScore);
        }
    }
}
