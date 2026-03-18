package ExceptionHandling;

public class TryCatchDemo {
    public static void main(String[] args){
        HandleException ex=new HandleException();
        ex.divide(4,0);
    }
}
class HandleException{
    int a;
    int b;
    int divide(int a,int b){
        try{
            this.a=a;
            this.b=b;
            return a/b;
        }catch(ArithmeticException e){
         System.out.println("ArithmaticException");
         return -1;
        }
    }
}
