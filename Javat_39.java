//inharitance important to achive methode over riding
class Javat_39{
    void show(int a){
        System.out.println("Javat_39");
    }
}
class Javat_mai extends Javat_39{
    void show(){
        System.out.println("JAcat");
    }
    public static void main(String[] args) {
        Javat_mai obj = new Javat_mai();
        obj.show(10);
    }
}