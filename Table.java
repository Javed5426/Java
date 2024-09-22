import java.util.Scanner;
class Table{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        while (true){
        System.out.println("Enter the number");
        System.out.println("If you want to break this loop pess 0");
        float a = sc.nextFloat();
        if (a == 0){
            break;
        }
        // int c = a;
        int b =1;
        float result;
        while(b<11){
        // float result1 = result;
        result = a*b;
        
        System.out.println(a + " * " + b + " = " + result);
        b++;
        }
        }
       
    }
}