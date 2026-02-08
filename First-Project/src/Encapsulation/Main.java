package src.Encapsulation;

public class Main {
    public static void main(String ar[]){
        BankAccount act1=new BankAccount("100ns12","Naveed",54343);
        System.out.println("Account number:"+act1.getAccountNo());
        System.out.println("Name of account holder:"+act1.getName());
        System.out.println("Available Balance is:"+act1.getBalance());
    }
}
