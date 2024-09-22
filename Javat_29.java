// object declariation by obect method
class Javat_29{
    String Name;
    int Age;
    String Contactnumber;
    void UserDetails(String name,int age,String contact){
     Name = name;
     Age = age;
     Contactnumber = contact;
    }
    void display(){
        System.out.println("Name: "+Name);
        System.out.println("Age: "+Age);
        System.out.println("Contact Number: "+Contactnumber);
    }
    public static void main(String[] args) {
        Javat_29 Details = new Javat_29();
        for (int i = 11; i>10; i++){
        Details.UserDetails("Rahul", 25, "1234567890");
        Details.display();
        Details.UserDetails("Hasnain",24, "7880992170");
        Details.display();
        if (i<=200){
            break;
        }
        }
    }
}