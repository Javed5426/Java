class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Cat extends Animal { // Note the capital 'C' for the class name
    public static void main(String[] args) {
        Cat c = new Cat(); // Create an instance of Cat
        c.eat(); // Call the eat method inherited from Animal
    }
}
