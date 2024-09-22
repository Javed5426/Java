import java.util.Scanner;
class Javat_33{
    int num1;
    int num2;
    int dis(int a ,int b){
        this.num1=a;
        this.num2=b;
        return num1-num2;
    }
    public static void main(String [] args){
        Javat_33 obj=new Javat_33();
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int k = scan.nextInt();
        int result = obj.dis(l,k);
        System.out.println(l + k);
        System.out.println(result);
        Mus tab = new Mus();
        int resv = tab.table(5,1);
        System.out.println(resv);
        System.out.println("------------------");
        result = tab.square(5);
        System.out.println(result + "usr input");
        Nus data = new Nus();
        String details = data.me("hasnain" , "kmclu");
        System.out.println(details);
    }
}
class Mus extends Javat_33{
  int table(int a , int b){
    this.num1=a;
    this.num2=b;
    int result = 0;
    while(num2<11){
        result = num1*num2;
        System.out.println(num1 + " * "+ num2 + " = "+ result);
        num2++;
    }
    return result;
   }
   int square(int a){
    this.num1=a;
    int result = 0;
    result = num1 * num1;
    System.out.println("Square of " + num1 + "is " + result);
    return 0;

   }
}
class Nus extends Mus{
    String name;
    String cl;
    String me(String name,String cl){
        this.name=name;
        
        this.cl = cl;
        
        return "name" +this. name + "class "+this.cl;
    }
}