package LogicBuilding;
import java.util.*;
public class ConsentAndVowelsCheckers {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a charcter to check consent and vowela");
        char con=scn.next().charAt(0);
        if(con=='a'||con=='e'||con=='i'||con=='o'||con=='u'){
            System.out.println("It aVowels");

        }else{
            System.out.println("its a consent");
        }



    }
}
