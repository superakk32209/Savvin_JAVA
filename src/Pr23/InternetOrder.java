package Pr23;

import java.util.Arrays;

public class InternetOrder {
    private ItemNode head;
    private int size;

    public InternetOrder() {
        head = new ItemNode(null);
        size = 0;
    }

    public InternetOrder(Item[] items) {
        head = new ItemNode(null);
        size = 0;
        for (Item item : items) {
            add(item);
        }
    }

    public boolean add(Item item) {
        ItemNode newNode = new ItemNode(item);
        newNode.next = head.next;
        head.next = newNode;
        size++;
        return true;
    }

    public boolean remove(String itemName) {
        ItemNode current = head;
        ItemNode previous = null;
        boolean removed = false;

        while (current.next != null) {
            if (current.next.item.getName().equals(itemName)) {
                previous = current;
                removed = true;
            }
            current = current.next;
        }

        if (removed) {
            previous.next = previous.next.next;
            size--;
        }

        return removed;
    }

    public int removeAll(String itemName) {
        int count = 0;
        while (remove(itemName)) {
            count++;
        }
        return count;
    }

    public int getTotalItems() {
        return size;
    }

    public Item[] getItems() {
        Item[] items = new Item[size];
        int index = 0;
        ItemNode current = head.next;

        while (current != null) {
            items[index] = current.item;
            current = current.next;
            index++;
        }

        return items;
    }

    public double getTotalCost() {
        double totalCost = 0.0;
        ItemNode current = head.next;

        while (current != null) {
            totalCost += current.item.getCost();
            current = current.next;
        }

        return totalCost;
    }

    public int getItemQuantity(String itemName) {
        int quantity = 0;
        ItemNode current = head.next;

        while (current != null) {
            if (current.item.getName().equals(itemName)) {
                quantity++;
            }
            current = current.next;
        }

        return quantity;
    }

    public String[] getItemNames() {
        String[] itemNames = new String[size];
        ItemNode current = head.next;
        int index = 0;

        while (current != null) {
            itemNames[index] = current.item.getName();
            current = current.next;
            index++;
        }

        return itemNames;
    }

    public Item[] getSortedItemsByCost() {
        Item[] items = getItems();
        Arrays.sort(items, (item1, item2) -> Double.compare(item2.getCost(), item1.getCost()));
        return items;
    }

    private static class ItemNode {
        Item item;
        ItemNode next;

        ItemNode(Item item) {
            this.item = item;
            this.next = null;
        }
    }
}

