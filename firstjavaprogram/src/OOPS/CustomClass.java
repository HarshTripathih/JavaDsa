package OOPS;

class Employee{
    int id;
    String name;
    int salary;
    public void empdetail(){
        System.out.println("My ID is :" + id);
        System.out.println("My name is :"+ name);
    }
    public int getSalary(){
        return salary;
    }
}

public class CustomClass {
    public static void main(String[] args) {
        System.out.println("The details are :");
        Employee harsh = new Employee();
        harsh.id = 1;
        harsh.name = "Harsh";
        harsh.salary = 1200;
        harsh.empdetail();
        Employee jalaj = new Employee();
        jalaj.id=2;
        jalaj.name="jalaj";
        jalaj.salary = 100;
        jalaj.empdetail();

        int salary = harsh.getSalary();
        System.out.println(salary);
    }
}
