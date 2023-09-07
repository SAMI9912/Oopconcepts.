// Bird.java
package javaapplication2;

class Bird extends Eagle {
    public String reproduction = "egg";
    public String outerCovering = "feather";

    public void flyUp() {
        System.out.println("Flying up...");
    }

    public void flyDown() {
        System.out.println("Flying down...");
    }
}

class Eagley extends Bird {
    public String name = "eagle";
    public int lifespan = 15;
}
