package Pr22;

class ConcreteComplex implements Complex {
    private int real;
    private int imag;

    public ConcreteComplex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public void display() {
        System.out.println(real + " + " + imag + "i");
    }
}
