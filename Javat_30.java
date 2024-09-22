class Javat_30 {
    void fly() {
        System.out.println("is flying");
    }

    public static void main(String[] args) {
        // Creating an instance of Animal
        Animal cat = new Animal();
        cat.run(); // Outputs: is running
        cat.fly(); // Outputs: is flying

        // Creating an instance of Peacock and calling its methods
        System.out.println("=====================");
        Peacock p = new Peacock();
        p.runn(); // Outputs: Peacock is running
                  //          ---------------------
                  //          is running
        p.fly();  // Outputs: is flying
        p.fly();  // Outputs: is flying
        p.fly();  // Outputs: is flying
        p.fly();  // Outputs: is flying
        p.fly();  // Outputs: is flying

        // Creating an instance of Dog and calling its methods
        System.out.println("------------------");
        Dog d = new Dog();
        d.run(); // Outputs: is running
        d.fly(); // Outputs: is flying
        d.ask(); // Outputs: Dog is asking
    }
}

class Animal extends Javat_30 {
    void run() {
        System.out.println("is running");
    }
}

class Peacock extends Animal {
    void runn() {
        System.out.println("Peacock is running");
        System.out.println("---------------------");
        // Correct instance creation
        Animal p = new Animal();
        p.run(); // Outputs: is running
    }
}

class Dog extends Animal {
    void ask() {
        System.out.println("Dog is asking");
    }
}
