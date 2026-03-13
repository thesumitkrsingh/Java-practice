package LogicBuilding;
import java.util.*;
public class EvenOdd {
   public static void main(String[] args){
       Scanner scn=new Scanner(System.in);
       int check=scn.nextInt();

       if((check&1)==0){
           System.out.println("Its a Even Number");
       }else{
           System.out.println("It a Oddd Number");
       }
   }
}
