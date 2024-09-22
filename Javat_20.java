public class Javat_20{
static int plusMethodInt(int x,int y){
    return x + y;
}
static double plusMethodDouble(double x,double y){
    return x + y;
}
public static void main(String[] args) {
    int myNum1 = plusMethodInt(8, 2);
    double myNum2 = plusMethodDouble(4.3, 6.25);
    System.out.println("int "+myNum1);
    System.out.println("double "+myNum2);
}
}