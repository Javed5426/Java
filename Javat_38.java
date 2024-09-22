//String buffer
class Javat_38{
    void show(StringBuffer a){
        System.out.println("String Buffer");

    }
    void show (String a){
        String s = "hello*5";
        System.out.println(s);
    }
    public static void main(String [] args){
        Javat_38 obj = new Javat_38();
        obj.show("Hello");
        obj.show(new StringBuffer("Hello"));
    }
}