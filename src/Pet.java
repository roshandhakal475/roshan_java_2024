// Superclass
class Animal {
    String species;

    Animal(String species) {
        this.species = species;
    }

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass 1
class Dog extends Animal {
    Dog() {
        super("Canine");
    }

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }

    void wagTail() {
        System.out.println("Dog wags its tail");
    }
}

// Subclass 2
class Cat extends Animal {
    Cat() {
        super("Feline");
    }

    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }

    void purr() {
        System.out.println("Cat purrs");
    }
}

public class Pet {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();  // Output: Dog barks
        dog.wagTail();    // Output: Dog wags its tail

        Cat cat = new Cat();
        cat.makeSound();  // Output: Cat meows
        cat.purr();       // Output: Cat purrs
    }
}
