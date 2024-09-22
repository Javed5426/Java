import java.util.Scanner;

class Javat_45{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object

        System.out.println("Enter your name: ");
        String name = myObj.nextLine(); // Read user input

        System.out.println("Enter your age: ");
        int age = myObj.nextInt(); // Read an integer input

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
