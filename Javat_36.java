/*
achive overloading using seq 
string promotion
byte => short
short => int
int => long
int => float
int => double
long=> float
long => double
float => double
char => int
*/
class Javat_36{
    public static void main(int a){
        System.out.println("hasnain");
    }
    public static void main (String [] args){
        Javat_36 name = new Javat_36();
        byte a = 'k';
        name.main(a);
        System.out.println(a);
        System.out.println("Hello ");
    }
}