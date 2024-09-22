class Javat_32{
    int a ;
    int b ;
   int add(int a, int b){
      int c=a+b;
      System.out.println(c);
      return c;
       
    }
    public static void main(String [] args){
        Javat_32 obj=new Javat_32();
        obj.add(31,32);
        System.out.println("------------------");
        Calculate number = new Calculate();
        number.multiply(22,44);
        System.out.println("------------------");
        // Calculate number = new Calculate();
        number.add(10,20);
        number.subs(25,10);
        number.div(200,10);
        System.out.println("-------------------------");
        Name valu = new Name();
        valu.add(25,35);//inharit from main class
        valu.subs(25,35);//inharit from calculate class
        valu.multiply(5,5);//inharit from calculate class
        valu.div(25,35);//inharit from calculate class
        valu.area(35,25);//origin class
        // String areaResult = valu.area(35, 25); // Inherited from Name
        // System.out.println(areaResult);
    }
}
class Calculate extends Javat_32{
    int subs(int a, int b){
        int result = a-b;
        System.out.println(result);
        return result;
        
    }
    int div(int a , int b){
        int result = a/b;
        System.out.println(result+"division result");
        return result;
    }
    int multiply(int a ,int b){
        int result = a*b;
        System.out.println(result);
        return result;
    }
}
class Name extends Calculate{
    int area(int a , int b){
        int c = a*b;
        System.out.println(c);
        String s="hasnain";
        return c;
    }
}
