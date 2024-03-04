package Pr4;

public class Head {
    private String hairColor;
    private int eyeSight;

    public Head(String hairColor, int eyeSight) {
        this.hairColor = hairColor;
        this.eyeSight = eyeSight;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public int getEyeSight() {
        return eyeSight;
    }

    public void setEyeSight(int eyeSight) {
        this.eyeSight = eyeSight;
    }

    public void talk(String message) {
        System.out.println("Head is talking: " + message);
    }

    public void think(String thought) {
        System.out.println("Head is thinking: " + thought);
    }
}