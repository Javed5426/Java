class Student{
   String student_name;
   private String Student_f_name;
   private int Student_id;
   private long Student_contact_number;
   public Student(String name, String fname, int id , long number){
        this.student_name = name;
        this.Student_f_name = fname;
        this.Student_id = id;
        this.Student_contact_number = number;

    }
    public static void main(String[] args) {
        Student S_Student= new Student("Hasnain","SM khan",100,7880992170L);
        System.out.println("Details: "+S_Student.student_name +" "+S_Student.Student_f_name +S_Student.Student_id +" "+S_Student.Student_contact_number);
        Student T_Student= new Student("Ravi ","Rahul ",102,254682642L);
        System.out.println("Details: "+T_Student.student_name +" "+T_Student.Student_f_name +T_Student.Student_id +" "+T_Student.Student_contact_number);
    }

    public Student() {
    }
}