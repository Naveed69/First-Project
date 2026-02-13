import java.lang.reflect.Field;

public class Main{

    public static void main(String[] args){
    BankAccount obj1=new BankAccount();
//    obj1.name="Naveed";
//    obj1.id=1;
//    obj1.balance=100;
//    System.out.println(obj1.name);
//    System.out.println(obj1.id);
//    System.out.println(obj1.balance);
//    obj1.withdraw(10);
//    System.out.println(obj1.balance);
//    obj1.deposit(21);
//    System.out.println(obj1.balance);

    BankAccount obj2=new BankAccount();
//    obj2.name="Ruhma";
//    obj2.id=2;
//    obj2.balance=101;
//    System.out.println(obj2.name+"-"+obj2.id+"-"+obj2.balance);
//    obj2.withdraw(11);
//    System.out.println(obj2.name+"-"+obj2.id+"-"+obj2.balance);

    BankAccount obj3=new BankAccount(1001,"Desai",100000);
//    System.out.println(obj3.name);
        obj3.setBalance(1);
        System.out.println(obj3.getBalance());

        Class c= BankAccount.class;
        for(Field f:c.getDeclaredFields()){
            System.out.println(f);
        }

        ObjectMapper om=new ObjectMapper();
        Trade[] trades=om.readValue()
    }
}