package src.Encapsulation;

public class BankAccount {
//    adding methods and private varible related to this class
//    is encapsulation
    private String accountNo;
    private String name;
    private double balance;

    public BankAccount(String accountNo,String name,double balance){
        this.accountNo=accountNo;
        this.name=name;
        this.balance=balance;
    }

    public double getBalance(){
        return balance;
    }

    public String getName(){
        return name;
    }

    public String getAccountNo(){
        return accountNo;
    }

}
