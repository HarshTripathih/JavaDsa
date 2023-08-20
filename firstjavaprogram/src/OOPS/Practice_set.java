package OOPS;

class Employee1{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
class CellPhone{
    public void ring(){
        System.out.println("Ringing.....");
    }
    public void viberate(){
        System.out.println("Viberating.....");
    }
    public void call(){
        System.out.println("Calling friend....");
    }
}
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int parameter(){
        return 4*side;
    }
}
class Rectangle{
    int length;
    int bredth;

    public int area(){
        return length*bredth;
    }
    public int perimeter(){
        return 2*(length+bredth);
    }
}
class Tomy{
    public void hit(){
        System.out.println("hitting the enemy...");
    }
    public void run() {
        System.out.println("Running from the enimie...");
    }
    public void fire(){
        System.out.println("Firing on the enimie...");
    }
}
class Circle{
    int r;
    public double area(){
        return (22*r*r)/7;
    }
    public int perimeter(){
        return (2*22*r)/7;
    }
}
public class Practice_set {
    public static void main(String[] args) {
        //Problem 1
        Employee1 harsh = new Employee1();
        harsh.setName("HarshTripathi");
        System.out.println(harsh.getName());
        int n = 12000;
        harsh.salary = 12000;
        System.out.println(harsh.getSalary());
        //Problem 2
        CellPhone realme = new CellPhone();
        realme.call();
        realme.ring();
        realme.viberate();
        //Problem 3
        System.out.println("Answer 3 For Square");
        Square sqr = new Square();
        sqr.side = 5;
        System.out.println(sqr.area());
        System.out.println(sqr.parameter());

        //problem 4
        System.out.println("Answer 4 for rectangle");
        Rectangle rect = new Rectangle();
        rect.length = 4;
        rect.bredth = 5;
        System.out.println(rect.area());
        System.out.println(rect.perimeter());
        //Problem 5;
        Tomy task = new Tomy();
        task.hit();
        task.run();
        task.fire();
        //Problem 6
        System.out.println("Answer 6 for Circle :");
        Circle cir = new Circle();
        cir.r = 5;
        System.out.println(cir.area());
        System.out.println(cir.perimeter());
    }
}
