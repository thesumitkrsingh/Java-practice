package LogicBuilding;
import java.util.*;
public class LeapYear {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Year");
        int year=scn.nextInt();

        if(year%400==0||(year%4==0&&year%100!=0)){
            System.out.println("This is Leap Year "+year);


        }
        else {
            System.out.println("Not a Leap Year");
        }
    }
}
