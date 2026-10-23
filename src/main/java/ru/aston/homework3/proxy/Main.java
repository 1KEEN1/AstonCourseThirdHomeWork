package ru.aston.homework3.proxy;

public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("photo.png");

        System.out.println("--- First call of display() method ---");
        image.display();

        System.out.println("--- Second call of display() method ---");
        image.display();
    }
}
