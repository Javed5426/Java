abstract class Javat_41{
    abstract void Start();
}
class Car extends Javat_41{
    public void Start() {
        System.out.println("Car is start using Key");
    }
}
class Scoter extends Javat_41{
        public void Start() {
        System.out.println("Scoter is start using Kick");
    }
    
    public static void main(String [] args){
        Car vhicle = new Car();
        vhicle.Start();
        Scoter vhicle1 = new Scoter();
        vhicle1.Start();
        Bike vhicle2 = new Bike();
        vhicle2.Start();
        // vhicle1.start();
    }
}
class Bike extends Javat_41{
    public void Start() {
        System.out.println("Bike is start using Kick and Self");
    }
}