import java.util.Scanner;
class Javat_44{
    private String name;
    private int rollno;
    public void setName(String neWname,int rolLno){
        name = neWname;
        rollno = rolLno;
    }
    public String getName(){
        return name +":"+ rollno;
    }
}
class Student{
    public static void main(String [] args){
        Scanner myO = new Scanner(System.in);
        System.out.println("Name:Roll_no");
        int numberOfStudents = 3;
        for (int i=1; i<10; i++){
        System.out.println("Enter your name");
        String name_o = myO.nextLine();

        System.out.println("Enter rollno");
        int roll_o = myO.nextInt();
        Javat_44[] details = new Javat_44[numberOfStudents];
        details[i] = new Javat_44();
        details[i].setName(name_o,roll_o);
        System.out. println(details.getName());
        }
        
        
        

        // details[0] = new Javat_44();
        // details[0].setName("hasnain",42);

        // details[1] = new Javat_44();
        // details[1].setName("Khan",45);

        // details[2] = new Javat_44();
        // details[2].setName("Hasnain",65);
        // System.out.println("Name"+":"+"Roll No");
        // for (Javat_44 student : details){
            // System.out.println(student.getName());
        // }
    }
}