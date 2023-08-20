package OOPS;

class Base{
    public int x;

    public Base(){
        System.out.println("I am base constructor");
    }
}
class Derive extends Base{
    public int y;

    public Derive(){
        System.out.println("I am Derive constructor");
    }
}
class Derive1 extends Base{
    public int z;
    public Derive1(){
        System.out.println("I am constructor of drive 1");
    }

}
public class Constructor_in_Inheritence {
    public static void main(String[] args) {
        Base obj  = new Base();
        Derive bjo = new Derive();
        Derive1 ojb = new Derive1();
    }

}
