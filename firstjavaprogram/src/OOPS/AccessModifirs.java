package OOPS;

class MyEmployee{
    private int id;
    private String name;

    public void setId(int id){    //setter and it is also called mutators
        this.id = id;
    }
    public int getId(){  //getter and it is also called accessors
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
class Circledata{
    private int r;
    public void setRadius(int r){
            this.r = r;
            if(r==r){
                System.out.println("You are good to go");
            }
            else{
                System.out.println("Not elegible for this task");
            }
    }
    public int getarea(){
        return (22*r*r)/7;
    }
    public int getperimeter(){
        return (2*22*r)/7;
    }

}
public class AccessModifirs {
    public static void main(String[] args) {
        MyEmployee data = new MyEmployee();
        data.setId(24);
        data.setName("Harsh");
        System.out.println(data.getName());
        System.out.println(data.getId());

        System.out.println("Circle data :");
        Circledata val = new Circledata();
        val.setRadius(5);
        System.out.println(val.getarea());
        System.out.println(val.getperimeter());
    }
}
