package Pr1;

class Dog {
    private String name;
    private int age;

    // Конструктор для инициализации данных собаки
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Методы получения и установки для имени и возраста
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Метод для вычисления возраста собаки в "человеческих" годах
    public int calculateHumanAge() {
        return age * 7;
    }

    // Метод toString() для описания собаки
    @Override
    public String toString() {
        return "Dog [Name: " + name + ", Age: " + age + " years]";
    }
}
