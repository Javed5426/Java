// prictice return the third angle of any tringle
public class Javat_25{
    static int ReturnTangle(int firstAngle,int SecondAngle){
        int sum = firstAngle + SecondAngle;
        int ThirdAngle = 180 - (sum);
        return ThirdAngle;
       
    }
    public static void main(String[] args) {
    int result = ReturnTangle(90,95);
    if( result<= 0){
        System.out.println("Trangle input is not valid");
    }
    else{
    System.out.println("The third angle of the triangle is: "+ result);
    }
}
}