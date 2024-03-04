package Pr22;

class VictorianChairFactory implements ChairFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}
