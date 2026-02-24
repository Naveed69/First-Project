package Telusko.Inheretance;

interface Computer{
    void code();

}

class Laptop implements Computer{
    public void code(){
        System.out.println("Coding in laptop");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("Coding in Desktop, Faster");
    }
}
class Developer{
    public void devApp(Computer comp){
        comp.code();
    }
}
public class NeedOfinheretance {
    public static void main(String args[]){

        Computer lap=new Laptop();
        Computer desk=new Desktop();
        Developer dev=new Developer();
        dev.devApp(lap);
    }
}
