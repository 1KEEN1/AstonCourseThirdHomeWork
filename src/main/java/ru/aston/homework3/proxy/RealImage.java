package ru.aston.homework3.proxy;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    public void loadFromDisk() {
        System.out.println("Loading Image from disk..." + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
}
