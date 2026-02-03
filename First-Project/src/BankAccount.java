public class BankAccount {
    private String name;
    private int id;
    private int balance;
    public BankAccount(){

    }

    public BankAccount(int id,String name){
        this.id=id;
        this.name=name;
    }

    public BankAccount(int id,String name,int balance){
        this.id=id;
        this.balance=balance;
        this.name=name;
    }
//    public void deposit(int amount){
//        balance+=amount;
//    }
//    public void withdraw(int amount){
//        balance-=amount;
//    }
    public int getBalance(){
        return balance;
    }

    public void setBalance(int deposit){
        this.balance+=deposit;
    }
}
