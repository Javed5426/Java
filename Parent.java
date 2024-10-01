class Parent{
    Parent(){
        System.out.println("Parent Constructor");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("Child Constructor");
    }
}
class Main{
    public static void main(String[] args) {
        Child c = new Child();
}
}