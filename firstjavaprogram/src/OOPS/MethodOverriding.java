package OOPS;
//If a child class implement a same method present in the parent class again , it is called method overriding;
//Redefining method <-------of----> super class in sub class but the argument are shold be same and access level(public,private,protected) should not be restrictive;
//Static method can't br override.
class A{
    int s;
    public int add(){
        return s;
    }
    public void method1(){
        System.out.println("I am method1 of class A");
    }
}
class B extends A{
    @Override    //Annotation for override method it tells the method is oveloading or not.
    public void method1(){
        System.out.println("I am method 1 of class B");
    }
    public void method2(){
        System.out.println("I am method 2 of class B");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
//        A a = new A();
//        a.method1();

        B b = new B();
        b.method1();
        b.method2();
    }
}
