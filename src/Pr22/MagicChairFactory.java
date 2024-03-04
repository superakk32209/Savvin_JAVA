package Pr22;

class MagicChairFactory implements ChairFactory {
    @Override
    public Chair createChair() {
        return new MagicChair();
    }
}
