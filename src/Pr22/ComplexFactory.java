package Pr22;

// Интерфейс для фабрики комплексных чисел
interface ComplexFactory {
    Complex createComplex();

    Complex createComplex(int real, int imag);
}

// Конкретная фабрика для комплексных чисел
class ConcreteComplexFactory implements ComplexFactory {
    @Override
    public Complex createComplex() {
        return new ConcreteComplex(0, 0);
    }

    @Override
    public Complex createComplex(int real, int imag) {
        return new ConcreteComplex(real, imag);
    }
}
