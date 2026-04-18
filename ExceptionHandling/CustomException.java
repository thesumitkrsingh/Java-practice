package ExceptionHandling;
//ss
public class CustomException {
    public static void main(String[] args){
        BankBalance amt=new BankBalance(10);
        try{
            amt.withdraw(11);
        } catch (InsufficientBalance e) {
            System.out.println(e.getMessage());
        }



    }
}
class BankBalance {
    int amount;
    BankBalance(int amount) {
        this.amount=amount;

    }
    int withdraw(int am) throws InsufficientBalance{
        if(am>amount){
           throw new InsufficientBalance("Itna Paise nhi hai");
        }else{
            amount-=am;
            return amount;
        }



    }

}
class InsufficientBalance extends Exception{
    public InsufficientBalance(String Message){
        super(Message);
    }
}
