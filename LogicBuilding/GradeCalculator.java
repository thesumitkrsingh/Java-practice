package LogicBuilding;
import java.util.*;
public class GradeCalculator {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Select numbe 90+,70+,80+");
        double number=scn.nextDouble();
        if(number>=90){
            System.out.println("Grade A");
        }else if(number>=80){
            System.out.println("Grade B");
        }else{
            System.out.println("Grade C");
        }
    }
}
