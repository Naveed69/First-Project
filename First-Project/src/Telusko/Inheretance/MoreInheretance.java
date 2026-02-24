package Telusko.Inheretance;

interface A{
    void show();
    void config();
}
interface X{
    void run();
}

interface Y extends X{

}

class B implements A,Y{
    public void show(){
        System.out.println("Showing");
    }

    public void config(){
        System.out.println("Configging");
    }

    public void run(){
        System.out.println("Running");
    }
}

public class MoreInheretance{
    public static void main(String a[]){
        A obj=new B();
        obj.show();
        obj.config();
        Y objY=new B();
        objY.run();
    }
}
