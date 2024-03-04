package Pr4;

public class Leg {
    private int length;
    private int strength;

    public Leg(int length, int strength) {
        this.length = length;
        this.strength = strength;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void walk() {
        System.out.println("Leg is walking");
    }

    public void run() {
        System.out.println("Leg is running");
    }
}
