public class Javat_27{
    public void eat(){
        System.out.println("I am eating");

    
    }
    public void run(){
        System.out.println("I am running");
    }
    public static void main(String[] args) {
        System.out.println("1");
        Javat_27 buzo=new Javat_27();
        buzo.eat();
        buzo.run();
        Birds Sparrow = new Birds();
        Menu Bird = new Menu();
        Bird.eat();
        Bird.running();
        Sparrow.fly();
        Bird.color="red";
        System.out.println(Bird.color);
    }
}
class Birds{
    void fly(){
        System.out.println("I am flying");
    }
}
class Menu extends Birds{
    String color;
    void eat(){
        System.out.println("I am eating");
    }
    void running(){
        System.out.println("I am running");
        
    }
}