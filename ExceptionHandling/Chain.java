package ExceptionHandling;

public class Chain {
    public static void main(String[] args){
       try{
           divide();
       } catch (Exception e) {
           throw new ArithmeticException("Calculation galat hai"+e);
       }
    }
    //ss
    static void divide(){
        int a=4;
        int b=0;
        int divide=a/b;
    }
}

