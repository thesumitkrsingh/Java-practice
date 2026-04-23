package OopPractice;

public class BankAccount {
    private int balance=0;
    //int amount=0;
    void Deposit(int amount){
        balance+=amount;
    }
    void withdraw(int amount){

       if(amount<=balance){
           balance-=amount;
           System.out.println("Balance Withdraw Succesful");


       }else{
           System.out.println("insufficient Balance");
       }


    }
    int checkBalance(){
        return balance;
    }
    public static void main(String[] args){
        BankAccount bank=new BankAccount();
        bank.Deposit(500);
        System.out.println(bank.checkBalance());
        bank.withdraw(300);
        System.out.println(bank.checkBalance());

    }

}
//atm
//ss

