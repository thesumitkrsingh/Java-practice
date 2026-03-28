package LogicBuilding;
import java.util.*;
public class XorUse {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("enter number to check Same Sign");
        int check=scn.nextInt();
        int checked=scn.nextInt();
        if((check^checked)>=0){
            System.out.println("have same sign");

        }else{
            System.out.println("not have same sign");
        }
    }

}
