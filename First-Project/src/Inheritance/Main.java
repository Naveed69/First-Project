package src.Inheritance;
public class Main {
    public static void main(String ar[]){
        TextMessage msg1=new TextMessage("Naveed","Desai","hello",true);
        System.out.println(msg1.getSender());
        System.out.println(msg1.getIsRead());
    }
}
