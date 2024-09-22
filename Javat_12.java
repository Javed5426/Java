//multiplication table
public class Javat_12{
    public static void main(String[] args){
        int number =2;
        for (int i = 1; i<=10; i++){
            System.out.println(number*i);
            if(i==4){
                break;
            }
        }
        String[] cars = {"volvo","car","tata suv","bmv"};
        System.out.println(cars.length+"array lenght");
    }
}