package ru.aston.homework3.decorator;

public class Main {
    public static void main(String[] args) {
        Coffee order = new SimpleCoffee();

        order = new MilkDecorator(order);
        order = new SugarDecorator(order);

        System.out.println("Item: " + order.getDescription());
        System.out.println("Total cost: $" + order.getCost());
    }
}
