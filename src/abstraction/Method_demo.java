package abstraction;

abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void makeSound();

    // Concrete method
    public void sleep() {
        System.out.println("Zzz");
    }
}

class Dog extends Animal {
    // Implementing abstract method
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    // Implementing abstract method
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class Method_demo {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound(); // Output: Woof
        cat.makeSound(); // Output: Meow

        dog.sleep(); // Output: Zzz
        cat.sleep(); // Output: Zzz
    }
}
