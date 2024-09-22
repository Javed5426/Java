class Javat_40{
    public void show(int a){  // 
        System.out.println("interger");
    }
}
class Mein extends Javat_40{
    // @Override
    public void show(int a){
        System.out.println("String");
    }
    public static void main(String [] args){
        Mein obj = new Mein();
        obj.show(4);
        Javat_40 m = new Javat_40();
        m.show(4);
    }
}