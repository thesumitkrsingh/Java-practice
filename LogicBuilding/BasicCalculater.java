package LogicBuilding;
import java.util.*;
public class BasicCalculater {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("enter first number");
        int a=scn.nextInt();
        System.out.println("enter second number");
        int b=scn.nextInt();
        int result=0;
        System.out.println("Choose operator +,-,*");
        char operator=scn.next().charAt(0);

        switch(operator){
            case '+':
                result=a+b;
            break;
            case '-':
                result=a-b;
            break;
            case '*':
                result=a*b;
                break;
            default:
                System.out.println("not valid input");
                break;





        }
        System.out.println(result);
    }
}
//////