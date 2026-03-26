package ExceptionHandling;

public class OutOfBound {
    public static void main(String[] args){
       int[] arr={1,2,3,4};
       try{
           for(int i=0;i<10;i++){
               System.out.println(arr[i]);
           }
       }catch(Exception e){
           System.out.println("Out OF bOund");

       }finally {
           System.out.println("Ache Se Handle Hua");
       }


//s
    }
}

