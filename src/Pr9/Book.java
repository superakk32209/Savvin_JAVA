package Pr9;

class Book implements Priceable {
    private double price;

    public Book(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
