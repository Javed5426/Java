public class Javat_17{
    static void MyMethod(String fname,int age,int ref){
        System.out.println(fname+age + ref);
        
    }
    
    public static void main(String [] args){
        
        MyMethod("Hasnain",23,28);
        MyMethod("Anja", 31,26);
        MyMethod("hasnain",31,25);
    }
}