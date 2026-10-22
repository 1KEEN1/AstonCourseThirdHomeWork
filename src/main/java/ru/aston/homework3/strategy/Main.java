package ru.aston.homework3.strategy;

public class Main {
    public static void main(String[] args) {
        Car succeed = new Toyota();
        Car x5 = new BMW();
        Car e63 = new Mercedes();

        System.out.println("Toyota Succeed:");
        succeed.gas();
        succeed.brake();
        succeed.setFillStrategy(new Fill95Strategy());
        succeed.fill();

        System.out.println("BMW x5:");
        x5.gas();
        x5.brake();
        x5.fill();

        System.out.println("Mercedes e63:");
        e63.gas();
        e63.brake();
        e63.fill();
    }
}
