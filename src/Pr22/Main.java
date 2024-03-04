package Pr22;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();

        ChairFactory victorianFactory = new VictorianChairFactory();
        client.sitOnChair(victorianFactory);

        ChairFactory multiFunctionalFactory = new MultiFunctionalChairFactory();
        client.sitOnChair(multiFunctionalFactory);

        ChairFactory magicFactory = new MagicChairFactory();
        client.sitOnChair(magicFactory);

        ComplexFactory complexFactory = new ConcreteComplexFactory();
        client.createAndDisplayComplex(complexFactory);
    }
}
