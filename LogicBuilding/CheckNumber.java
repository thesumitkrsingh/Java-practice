package LogicBuilding;
import java.util.*;
public class CheckNumber {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int get=scn.nextInt();
        if(get>0){
            System.out.println("number is Positive");
        }else if(get<0){
            System.out.println("Number is negative");
        }else if(get==0){
            System.out.println("Number is zero");
        }
    }
}
