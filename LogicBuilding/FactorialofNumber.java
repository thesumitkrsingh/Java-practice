package LogicBuilding;
import java.util.*;
//Find factorial of N using a loop
public class FactorialofNumber {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("enetr a Number");
        int n=scn.nextInt();
        int f=1;

        for(int i=1;i<=n;i++){
           f=f*i;




        }
        System.out.println(f);
    }

}
