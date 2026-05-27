package edu.teamrocket.golfstrokes;

public class ComputeCard {
    private ScoreCard scoreCard;
    private GolfPlay strokePlay;

    public ComputeCard(ScoreCard scoreCard, GolfPlay strokePlay) {
        this.scoreCard = scoreCard;
        this.strokePlay = strokePlay;
    }

    public void compute() {
        this.strokePlay.scoring(this.scoreCard);
    }

}
