//interface
interface I1{
    int a =10; //it can not reassign interface default variable public static final variable
    // a=20; throwa error
   abstract void show();
  default void showa(){

   }
}
class Temp implements I1{
   public void show(){
       System.out.println("hasnain");
    }
}
class Javat_42{
    public static void main(String [] args){
        System.out.println("hello");
        I1 data = new Temp();
        data.show();
    }
}