package com.designPatterns.structural;

interface Image {
    void display();
}

class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("loading image: " + fileName);
    }

    @Override
    public void display() {
        System.out.println("displaying image: " + fileName);
    }
}

class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        // Lazy initialization: Load only when needed
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}

public class ProxyPattern {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo.jpg");

        // First call: Image is loaded from disk
        System.out.println("\nfirst time displaying image:");
        image1.display();

        // Second call: Image is already loaded, so no loading happens
        System.out.println("\nsecond time displaying image:");
        image1.display();
    }
}