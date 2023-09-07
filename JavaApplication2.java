// Animal.java
package javaapplication2;

abstract class Animal {
    // Abstract methods
    abstract void move();
    abstract void eat();

    // Concrete method
    void label() {
        System.out.println("Animal's data:");
    }
}

class Bird extends Animal {
    void move() {
        System.out.println("Moves by flying.");
    }

    void eat() {
        System.out.println("Eats birdfood.");
    }
}

class Fish extends Animal {
    void move() {
        System.out.println("Moves by swimming.");
    }

    void eat() {
        System.out.println("Eats seafood.");
    }
}


// JavaApplication2.java
package javaapplication2;

public class JavaApplication2 {

    public static void main(String[] args) {
        Animal myBird = new Bird();
        myBird.label();
        myBird.move();
        myBird.eat();

        Animal myFish = new Fish();
        myFish.label();
        myFish.move();
        myFish.eat();

        // Interface
        AnimalE myEagle = new Eagle();
        myEagle.eat();
        myEagle.sound();

        BirdY myBirdY = new Eagle();
        myBirdY.fly();

        System.out.println("Number of legs: " + BirdY.numberOfLegs);
        System.out.println("Outer covering: " + BirdY.outerCovering);

        // Encapsulation
        Animaly myAnimal = new Animaly();
        myAnimal.setName("Eagle");
        myAnimal.setAverageWeight(1.5);
        myAnimal.setNumberOfLegs(2);
        System.out.println("Name: " + myAnimal.getName());
        System.out.println("Average weight: " + myAnimal.getAverageWeight() + "kg");
        System.out.println("Number of legs: " + myAnimal.getNumberOfLegs());

        // Inheritance
        Eagley myEagley = new Eagley();
        System.out.println("Name: " + myEagley.name);
        System.out.println("Reproduction: " + myEagley.reproduction);
        System.out.println("Outer covering: " + myEagley.outerCovering);
        System.out.println("Lifespan: " + myEagley.lifespan);
        myEagley.flyUp();
        myEagley.flyDown();
    }
}
