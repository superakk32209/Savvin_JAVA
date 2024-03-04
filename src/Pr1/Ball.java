package Pr1;

class Ball {
    private String type;

    public Ball(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Ball [Type: " + type + "]";
    }
}