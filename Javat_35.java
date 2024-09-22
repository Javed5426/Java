class Javat_35{
//poymorphism = multiple form 
// water = liquid , solid , gas
void show(String a){
    System.out.println("1");

}
void show(int a){
    System.out.println("2");
}
public static void main(String [] args){
    Javat_35 t = new Javat_35();
// class_name object name= new class();
    t.show(10);
}
}
// overloading
/* 
* 1. method name is same
* 2. no. of parameters are different
* 3. data type of parameters are different
* 4. Same class
*/
