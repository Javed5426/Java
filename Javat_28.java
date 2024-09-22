class Javat_28{
        String color;
    public static void main(String[] args) {
        Animal buzo = new Animal();
        Javat_02 men =new Javat_02();
        Javat_28 animal = new Javat_28();
        animal.color="pink";
        men.name="khan";
        buzo.color = "red";
        buzo.age = "25";
        System.out.println("color =>"+buzo.color+" age=> "+buzo.age + men.name +animal.color);
    }
}
class Animal{
    String color; //reference variable
    String age;
}