package String;
import java.sql.SQLOutput;
import java.util.*;
//Check if a string is a palindrome (ignore case, spaces)
public class PalidromeCheck {
    public static void main(String[] args){
        String input="madam";
        int left=0;
        int right=input.length()-1;
        while(left<right){
            if(input.charAt(left)!=input.charAt(right )){
                System.out.println("Its Not Palidrome");
                return;
            }

            left++;
            right--;
        }
        System.out.println("Its  A palidrome");

    }
}
