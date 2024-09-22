public class Employee{//this is a class
    int Emp_id;
    String Emp_name;
    Employee(int Emp_id,String Emp_name){ // constructeure 
        this.Emp_id=Emp_id;
        this.Emp_name = Emp_name;
    }
    public static void main(String[] args) {
        Employee e1 = new Employee(2200,"Hasnain");
        Employee e2= new Employee(2001,"Tasleem");
        System.out.println("Employee detaild"+e1.Emp_name+e1.Emp_id);
        System.out.println("Employee detaild"+e2.Emp_name+e2.Emp_id);
        Employee e3=new Employee(2202,"Khan");
        System.out.println(e3.Emp_name+e3.Emp_id);


   }
}