// Encapsulaton
// A class encapsulates data and methods that operate on that data.
class Javat_43{
    private int emp_id;
    public void setEmpid(int eid){ //seter
        emp_id = eid; //variable name
    }
    public int getEmpid(){ //getter
        return emp_id; // 
    }
}
class Company {
    public static void main(String [] args){
        Javat_43 emp = new Javat_43();
        emp.setEmpid(202); 
        System.out.println(emp.getEmpid());
    }
}