package Pr4;

public class Hand {
    private int fingerCount;
    private int gripStrength;

    public Hand(int fingerCount, int gripStrength) {
        this.fingerCount = fingerCount;
        this.gripStrength = gripStrength;
    }

    public int getFingerCount() {
        return fingerCount;
    }

    public void setFingerCount(int fingerCount) {
        this.fingerCount = fingerCount;
    }

    public int getGripStrength() {
        return gripStrength;
    }

    public void setGripStrength(int gripStrength) {
        this.gripStrength = gripStrength;
    }

    public void wave() {
        System.out.println("Hand is waving");
    }

    public void grab() {
        System.out.println("Hand is grabbing");
    }
}
