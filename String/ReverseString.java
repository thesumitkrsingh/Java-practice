package String;
import java.util.*;
public class ReverseString {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a String to reverse");
        String str=scn.nextLine();

        for(int i=str.length()-1;i>=0;i--){

            System.out.print(str.charAt(i));

        }

//ss
    }
}
