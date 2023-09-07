// Eagle.java
package javaapplication2;

interface AnimalE {
    void eat();
    void sound();
}

interface BirdY {
    int numberOfLegs = 2;
    String outerCovering = "feather";

    void fly();
}

class Eagle implements AnimalE, BirdY {
    public void eat() {
        System.out.println("Eats reptiles and amphibians.");
    }

    public void sound() {
        System.out.println("Has a high-pitched whistling sound.");
    }

    public void fly() {
        System.out.println("Flies up to 10,000 feet.");
    }
}
