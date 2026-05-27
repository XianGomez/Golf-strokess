package edu.teamrocket.golfstrokes;

public class Hole {
    private final byte par;
    private final byte num;

    public Hole(byte num, byte par) {
        this.num = num;
        this.par = par;
    }

    public byte getPar() {
        return this.par;
    }

    @Override
    public String toString() {
        return "   " + this.num + " - " + this.getPar(); 
    }
}
