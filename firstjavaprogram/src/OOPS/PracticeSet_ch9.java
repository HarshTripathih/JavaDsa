package OOPS;
class cylinder{
    private double radius;
    private double height;

    public cylinder(double r,double h){     //setter using constructor
        radius = r;
        height =h;
    }
//    public void setProperties(double r , double h){    //setter using function
//        radius = r;
//        height = h;
//    }
    public double area(){
        return 2*22*radius*(height+radius)/7;
    }
    public double volume(){
        return (22*radius*radius*height)/7;
    }

}
class Rectangled{
    private double length;
    private double breadth;

    public Rectangled(){
        length = 4;
        breadth = 5;
    }
    public Rectangled(double l,double b){
        this.length = l;
        this.breadth = b;
    }
    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }
    public double area(){
        return length*breadth;
    }
}

public class PracticeSet_ch9 {
    public static void main(String[] args) {
        cylinder cyl = new cylinder(2,5);
//        cyl.setProperties(2,5);
        System.out.println(cyl.area());
        System.out.println(cyl.volume());

        //ques 4
        Rectangled rect  = new Rectangled(5,6);
//        System.out.println(rect.getLength());
//        System.out.println(rect.getBreadth());
        System.out.println(rect.area());
    }
}
