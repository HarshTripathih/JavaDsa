package OOPS;

class MyEmployees{
    private int salary;
    private String name;
    public MyEmployees(){    // this is Default Constructor its invoke the value automatically
        salary = 5000;
        name = "Harsh";
    }
    public MyEmployees(int n,String N){ // this is paramererized constructor its invoke the value if the value is passed in parameter
        salary = n;                     //  and overload the to the default constructor
        name = N;
    }
    public MyEmployees(int n){
        salary = n;
        name = "Siddharth";
    }
    public void getSalary(){
        System.out.println("Salary"+":"+salary+" and "+"Name"+":"+name);
    }
}
public class OOPS_Constructor {
    public static void main(String[] args) {
        MyEmployees emp = new MyEmployees(1200,"Ujjwal");
//        System.out.println("Your Salary is "+" "+emp.getSalary());
        emp.getSalary();
    }
}
