// Interface Animal
interface Animal {
    void makeSound();
    void eat();
}

// Lion class implementing Animal
class Lion implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Lion: Roarrr!");
    }

    @Override
    public void eat() {
        System.out.println("Lion eats meat.");
    }
}

// Elephant class implementing Animal
class Elephant implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Elephant: Trumpet!");
    }

    @Override
    public void eat() {
        System.out.println("Elephant eats grass and fruits.");
    }
}

// Monkey class implementing Animal
class Monkey implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Monkey: Ooo Ooo Aaa Aaa!");
    }

    @Override
    public void eat() {
        System.out.println("Monkey eats bananas.");
    }
}

// Zoo Management System
public class ZooManagementSystem {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal elephant = new Elephant();
        Animal monkey = new Monkey();

        // Demonstrating behavior
        System.out.println("---- Zoo Animals ----");

        lion.makeSound();
        lion.eat();

        System.out.println();

        elephant.makeSound();
        elephant.eat();

        System.out.println();

        monkey.makeSound();
        monkey.eat();
    }
}
