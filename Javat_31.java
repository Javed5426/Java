class Javat_31{
    void eat(){
        System.out.println("Eating");
    }
    void fly(){
        System.out.println("Flying");
    }
    public static void main(String[] args){
        Javat_31 obj = new Javat_31();
        obj.eat();
        Dog d = new Dog();
        d.eat();
        d.dogA();
        System.out.println("-------------------");
        Javat_31 f = new Javat_31();
        f.fly();

            }

}
class Dog extends Javat_31 {
    void dogA(){
        System.out.println("-------------------");
        System.err.println("Hello");
        Dog e = new Dog();
        e.eat();
        System.out.println("-------------------");
        Dog f = new Dog();
        f.fly();
    }
}

