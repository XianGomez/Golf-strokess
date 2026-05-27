package edu.teamrocket.golfstrokes;

public class Player {
    private String iniciales;
    private Byte handicap;
    private int score;
    private int puntos_Stableford;

    public Player(String iniciales, byte handicap) {
        this.iniciales = iniciales;
        this.handicap = handicap;
    }

    public String getInitials() {
        return this.iniciales;
    }

    public Byte getHandicap() {
        return handicap;
    }

    public void setPuntos_Stableford(int puntos_Stableford) {
        this.puntos_Stableford = puntos_Stableford;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public int getPuntos_Stableford() {
        return puntos_Stableford;
    }

    @Override
    public String toString() {
        
        return "Jugador: " + getInitials() + " " + "Handicap: " + getHandicap();
    }

}
