package Work_24;

import java.util.*;

class OrderAlreadyAddedException extends RuntimeException {
    public OrderAlreadyAddedException(String message) {
        super(message);
    }
}

class IllegalTableNumber extends IllegalArgumentException {
    public IllegalTableNumber(String message) {
        super(message);
    }
}

interface Item {
    double getCost();
    String getName();
    String getDescription();
}

class Drink implements Item {
    private final double cost;
    private final String name;
    private final String description;
    @Override
    public String toString() {
        return "Напиток: " + getName() + ", Стоимость: $" + getCost() + ", Описание: " + getDescription();
    }
    public Drink(String name, String description) {
        this.cost = 0;
        this.name = name;
        this.description = description;
    }

    public Drink(double cost, String name, String description) {
        if (cost < 0 || name.isEmpty() || description.isEmpty()) {
            throw new IllegalArgumentException("Invalid Drink parameters");
        }
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

class Dish implements Item {
    private final double cost;
    private final String name;
    private final String description;
    @Override
    public String toString() {
        return "Блюдо: " + getName() + ", Стоимость: $" + getCost() + ", Описание: " + getDescription();
    }
    public Dish(String name, String description) {
        this.cost = 0;
        this.name = name;
        this.description = description;
    }

    public Dish(double cost, String name, String description) {
        if (cost < 0 || name.isEmpty() || description.isEmpty()) {
            throw new IllegalArgumentException("Invalid Dish parameters");
        }
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

interface Order {
    boolean addItem(Item item);
    boolean removeItem(String name);
    int removeAll(String name);
    int getTotalCount();
    Item[] getItems();
    double getTotalCost();
    int getItemCount(String name);
    String[] getItemNames();
    Item[] getSortedItemsByCost();
}

class RestaurantOrder implements Order {
    private final List<Item> items;

    public RestaurantOrder() {
        items = new ArrayList<>();
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ресторант-заказ:\n");

        for (Item item : items) {
            stringBuilder.append("Название: ").append(item.getName()).append(", Стоимость: $").append(item.getCost()).append("\n");
        }

        return stringBuilder.toString();
    }


    public boolean addItem(Item item) {
        return items.add(item);
    }

    public boolean removeItem(String name) {
        Iterator<Item> iterator = items.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            if (item.getName().equalsIgnoreCase(name)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public int removeAll(String name) {
        int count = 0;
        Iterator<Item> iterator = items.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            if (item.getName().equalsIgnoreCase(name)) {
                iterator.remove();
                count++;
            }
        }
        return count;
    }

    public int getTotalCount() {
        return items.size();
    }

    public Item[] getItems() {
        return items.toArray(new Item[0]);
    }

    public double getTotalCost() {
        double totalCost = 0;
        for (Item item : items) {
            totalCost += item.getCost();
        }
        return totalCost;
    }

    public int getItemCount(String name) {
        int count = 0;
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                count++;
            }
        }
        return count;
    }

    public String[] getItemNames() {
        Set<String> uniqueNames = new HashSet<>();
        for (Item item : items) {
            uniqueNames.add(item.getName());
        }
        return uniqueNames.toArray(new String[0]);
    }

    public Item[] getSortedItemsByCost() {
        Item[] sortedItems = items.toArray(new Item[0]);
        Arrays.sort(sortedItems, (item1, item2) -> Double.compare(item2.getCost(), item1.getCost()));
        return sortedItems;
    }
}

class InternetOrder implements Order {
    private final List<Item> items;

    public InternetOrder() {
        items = new ArrayList<>();
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Интернет-заказ:\n");

        for (Item item : items) {
            stringBuilder.append("Название: ").append(item.getName()).append(", Стоимость: $").append(item.getCost()).append("\n");
        }

        return stringBuilder.toString();
    }

    public boolean addItem(Item item) {
        return items.add(item);
    }

    public boolean removeItem(String name) {
        Iterator<Item> iterator = items.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            if (item.getName().equalsIgnoreCase(name)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public int removeAll(String name) {
        int count = 0;
        Iterator<Item> iterator = items.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            if (item.getName().equalsIgnoreCase(name)) {
                iterator.remove();
                count++;
            }
        }
        return count;
    }

    public int getTotalCount() {
        return items.size();
    }

    public Item[] getItems() {
        return items.toArray(new Item[0]);
    }

    public double getTotalCost() {
        double totalCost = 0;
        for (Item item : items) {
            totalCost += item.getCost();
        }
        return totalCost;
    }

    public int getItemCount(String name) {
        int count = 0;
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                count++;
            }
        }
        return count;
    }

    public String[] getItemNames() {
        Set<String> uniqueNames = new HashSet<>();
        for (Item item : items) {
            uniqueNames.add(item.getName());
        }
        return uniqueNames.toArray(new String[0]);
    }

    public Item[] getSortedItemsByCost() {
        Item[] sortedItems = items.toArray(new Item[0]);
        Arrays.sort(sortedItems, (item1, item2) -> Double.compare(item2.getCost(), item1.getCost()));
        return sortedItems;
    }
}

interface Orders {
    boolean addItem(Item item);
    boolean removeItem(String name);
    int removeAll(String name);
    int getTotalCount();
    Item[] getItems();
    double getTotalCost();
    int getItemCount(String name);
    String[] getItemNames();
    Item[] getSortedItemsByCost();
}

class OrderManager {
    private final Map<String, Order> orders;

    public OrderManager() {
        orders = new HashMap<>();
    }

    public void addOrder(String address, Order order) {
        if (orders.containsKey(address)) {
            throw new OrderAlreadyAddedException("Order already added for address: " + address);
        }
        orders.put(address, order);
    }

    public Order getOrder(String address) {
        if (!orders.containsKey(address)) {
            throw new IllegalArgumentException("No order found for address: " + address);
        }
        return orders.get(address);
    }

    public void removeOrder(String address) {
        if (!orders.containsKey(address)) {
            throw new IllegalArgumentException("No order found for address: " + address);
        }
        orders.remove(address);
    }

    public void addItemToOrder(String address, Item item) {
        if (!orders.containsKey(address)) {
            throw new IllegalArgumentException("No order found for address: " + address);
        }
        orders.get(address).addItem(item);
    }

    public String[] getAddresses() {
        return orders.keySet().toArray(new String[0]);
    }

    public double getTotalOrdersCost() {
        double totalCost = 0;
        for (Order order : orders.values()) {
            totalCost += order.getTotalCost();
        }
        return totalCost;
    }

    public int getTotalItemCount(String itemName) {
        int count = 0;
        for (Order order : orders.values()) {
            count += order.getItemCount(itemName);
        }
        return count;
    }

    public Order[] getOrders() {
        return orders.values().toArray(new Order[0]);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrderManager orderManager = new OrderManager();

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Создать заказ по адресу");
            System.out.println("2. Добавить позицию к заказу");
            System.out.println("3. Удалить заказ по адресу");
            System.out.println("4. Вывести все адреса заказов");
            System.out.println("5. Вывести общую стоимость всех заказов");
            System.out.println("6. Вывести общее количество заказанных позиций по названию");
            System.out.println("7. Вывести все заказы по адресу");
            System.out.println("8. Вывести интернет-заказы");
            System.out.println("9. Вывести общее количество интернет-заказов");
            System.out.println("10. Выйти");

            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    String address;
                    boolean orderAdded = false;

                    do {
                        System.out.print("Введите адрес для создания заказа: ");
                        address = scanner.nextLine();

                        // Проверка ввода корректного адреса (не отрицательного числа или 0)
                        if (address.matches("-?\\d+")) {
                            int addressValue = Integer.parseInt(address);
                            if (addressValue <= 0) {
                                System.out.println("Адрес должен быть положительным числом. Пожалуйста, введите корректный адрес.");
                                continue;  // Переход к следующей итерации цикла
                            }
                        } else {
                            break;  // Прерывание цикла, если введена строка (например, "exit")
                        }

                        try {
                            System.out.print("Выберите тип заказа (1 - Ресторант, 2 - Интернет): ");
                            int orderType = scanner.nextInt();
                            scanner.nextLine();  // Очистка буфера после считывания числа

                            Order newOrder;
                            if (orderType == 1) {
                                newOrder = new RestaurantOrder();
                            } else if (orderType == 2) {
                                newOrder = new InternetOrder();
                            } else {
                                System.out.println("Неверный тип заказа. Пожалуйста, введите 1 или 2.");
                                continue;  // Переход к следующей итерации цикла
                            }

                            orderManager.addOrder(address, newOrder);
                            System.out.println("Заказ создан по адресу: " + address);
                            orderAdded = true;
                        } catch (OrderAlreadyAddedException e) {
                            System.out.println("Заказ по адресу " + address + " уже существует. Введите другой адрес.");
                        }
                    } while (!orderAdded);
                    break;



                case 2:
                    System.out.print("Введите адрес заказа: ");
                    String orderAddress = scanner.nextLine();

                    // Проверка наличия заказа по указанному адресу
                    if (!Arrays.asList(orderManager.getAddresses()).contains(orderAddress)) {
                        System.out.println("Заказа по указанному адресу не существует.");
                        break;
                    }

                    // Создание новой позиции
                    System.out.print("Выберите тип позиции (1 - Напиток, 2 - Блюдо): ");
                    int itemType = scanner.nextInt();
                    scanner.nextLine();  // Чтение символа новой строки после ввода числа

                    Item newItem = null;
                    switch (itemType) {
                        case 1:
                            System.out.print("Введите название напитка: ");
                            String drinkName = scanner.nextLine();
                            System.out.print("Введите описание напитка: ");
                            String drinkDescription = scanner.nextLine();

                            // Проверка ввода корректной цены для напитка
                            double drinkCost;
                            do {
                                System.out.print("Введите стоимость напитка (должна быть положительной): ");
                                drinkCost = scanner.nextDouble();
                                scanner.nextLine();  // Чтение символа новой строки после ввода числа
                                if (drinkCost <= 0) {
                                    System.out.println("Цена должна быть положительной. Пожалуйста, введите корректную цену.");
                                }
                            } while (drinkCost <= 0);

                            newItem = new Drink(drinkCost, drinkName, drinkDescription);
                            break;
                        case 2:
                            System.out.print("Введите название блюда: ");
                            String dishName = scanner.nextLine();
                            System.out.print("Введите описание блюда: ");
                            String dishDescription = scanner.nextLine();

                            // Проверка ввода корректной цены для блюда
                            double dishCost;
                            do {
                                System.out.print("Введите стоимость блюда (должна быть положительной): ");
                                dishCost = scanner.nextDouble();
                                scanner.nextLine();  // Чтение символа новой строки после ввода числа
                                if (dishCost <= 0) {
                                    System.out.println("Цена должна быть положительной. Пожалуйста, введите корректную цену.");
                                }
                            } while (dishCost <= 0);

                            newItem = new Dish(dishCost, dishName, dishDescription);
                            break;
                        default:
                            System.out.println("Неверный выбор типа позиции.");
                            break;
                    }

                    // Добавление позиции к заказу
                    if (newItem != null) {
                        orderManager.addItemToOrder(orderAddress, newItem);
                        System.out.println("Позиция успешно добавлена к заказу по адресу: " + orderAddress);
                    }
                    break;
                case 3:
                    System.out.print("Введите адрес заказа для удаления: ");
                    String removeAddress = scanner.nextLine();
                    orderManager.removeOrder(removeAddress);
                    System.out.println("Заказ по адресу " + removeAddress + " успешно удален.");
                    break;
                case 4:
                    String[] addresses = orderManager.getAddresses();
                    if (addresses.length == 0) {
                        System.out.println("Нет созданных заказов.");
                    } else {
                        System.out.println("Список адресов заказов:");
                        for (String addr : addresses) {
                            System.out.println(addr);
                        }
                    }
                    break;
                case 5:
                    double totalOrdersCost = orderManager.getTotalOrdersCost();
                    System.out.println("Общая стоимость всех заказов: " + totalOrdersCost);
                    break;
                case 6:
                    System.out.print("Введите название позиции для подсчета: ");
                    String itemName = scanner.nextLine();
                    int totalItemCount = orderManager.getTotalItemCount(itemName);
                    System.out.println("Общее количество заказанных позиций " + itemName + ": " + totalItemCount);
                    break;
                case 7:
                    System.out.print("Введите адрес заказа для вывода: ");
                    String displayAddress = scanner.nextLine();
                    try {
                        Order displayOrder = orderManager.getOrder(displayAddress);
                        System.out.println("Заказ по адресу " + displayAddress + ":");
                        displayItems(displayOrder.getItems());
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 8:
                    System.out.println("Список интернет-заказов:");
                    for (Order order : orderManager.getOrders()) {
                        if (order instanceof InternetOrder) {
                            Item[] itemsInOrder = order.getItems();
                            if (itemsInOrder.length > 0) {
                                for (Item item : itemsInOrder) {
                                    System.out.println(item);
                                }
                            } else {
                                System.out.println("Заказ пуст.");
                            }
                        }
                    }
                    break;
                case 9:
                    long internetOrderCount = Arrays.stream(orderManager.getOrders())
                            .filter(order -> order instanceof InternetOrder)
                            .count();
                    System.out.println("Общее количество интернет-заказов: " + internetOrderCount);
                    break;
                case 10:
                    System.out.println("Программа завершена.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Неверный выбор. Пожалуйста, выберите от 1 до 10.");
                    break;
            }
        }
    }

    private static void displayItems(Item[] items) {
        if (items.length == 0) {
            System.out.println("Заказ пуст.");
        } else {
            System.out.println("Список позиций в заказе:");
            for (Item item : items) {
                System.out.println(item.getName() + " - " + item.getCost());
            }
        }
    }
}