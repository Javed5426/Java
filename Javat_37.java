class Javat_37{
    void show(String a){ // if argument not match child class then call object mein 
        System.out.println("object method");
    }
    void show(String... a){
        System.out.println("String method");
    }
    public static void main(String [] args){
        Javat_37 obj = new Javat_37();
        obj.show("Hasnain",10);

    }
}