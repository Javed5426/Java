public class Practice_04{
    public int run(int a){
        System.out.println("Runnine");
        return a;
    }
}
class Animal extends Practice_04{
    public static void main(String[] args) {
    Practice_04 Goat = new Practice_04();
    Goat.run(10);
    System.out.println("****************");
    Animal Dog = new Animal();
    Dog.run(10);
    Bird parrot = new Bird();
    parrot.fly();
    parrot.run(100);

    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("Flying");
    }
}
