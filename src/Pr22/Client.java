package Pr22;

// Клиент, который использует фабрику для создания стула и сидит на нем
class Client {
    public void sitOnChair(ChairFactory factory) {
        Chair chair = factory.createChair();
        chair.sit();
    }

    public void createAndDisplayComplex(ComplexFactory factory) {
        Complex complex = factory.createComplex();
        Complex complex2 = factory.createComplex(3, 4);

        complex.display();
        complex2.display();
    }
}
