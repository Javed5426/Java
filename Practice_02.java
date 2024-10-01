//sum of three individual digit
import java.util.Scanner;
public class Practice_02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = sc.nextInt();
        System.out.println("Enter any number");
        int number1 = sc.nextInt();
        System.out.println("Enter any number");
        int number2 = sc.nextInt();
        int result;
       result = number + number1 + number2;
       System.out.println("Sum of three number:" + result);
    }
}