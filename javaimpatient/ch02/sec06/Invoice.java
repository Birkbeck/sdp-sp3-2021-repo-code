package ch02.sec06;

import java.util.ArrayList;

public class Invoice {
    private static class Item { // Item is nested inside Invoice
        String description;
        int quantity;
        double unitPrice;

        double price() { return quantity * unitPrice; }
        public String toString() { 
            return quantity + " x " + description + " @ $" + unitPrice + " each";
        }
    }

    private ArrayList<Item> items = new ArrayList<>();
    
    public void addItem(String description, int quantity, double unitPrice) {
        Item newItem = new Item();
        newItem.description = description;
        newItem.quantity = quantity;
        newItem.unitPrice = unitPrice;
        items.add(newItem);
    }
    
    public void print() {
        double total = 0;
        for (Item item : items) {
            System.out.println(item);
            total += item.price();
        }
        System.out.println(total);
    }
}