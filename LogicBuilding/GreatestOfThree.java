package LogicBuilding;
import java.util.*;
public class GreatestOfThree {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter First Number");
        int a=scn.nextInt();
        System.out.println("Enetr Your Second Number");
        int b=scn.nextInt();
        System.out.println("Enter Your  Third Number");
        int c=scn.nextInt();
        if(a>=b && a>=c){
            System.out.println("A is greatest"+a);
        }
        else if(b>=a&& b>=c){
            System.out.println("B is Greatest"+b);
        }
        else{
            System.out.println("C is Greates :"+c);
        }
    }
}
