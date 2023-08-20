package OOPS;

class Harsh{
    private int a;
    Harsh(int a){
        this.a = a;     // this Keyword is used to give the reference .
    }
    public int increament(){
        return a = a+1;
    }
}
class derived extends Harsh{
    derived(int c){     //if you are going to create a constructor you should need to create a defaul construcor in the base class;
        super(c);       // othewise you can use the super keword
        System.out.println("I am Ujjwal ka countructor");
    }
}
public class This_and_Super_Keyword {
    public static void main(String[] args) {
//        Harsh obj = new Harsh(5);
          derived obj = new derived(5);
        System.out.println(obj.increament());
    }
}

