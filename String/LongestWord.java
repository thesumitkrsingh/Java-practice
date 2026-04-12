package String;
import java.util.*;
public class LongestWord {
    public static void main(String[] args){
        String input="Vishwa Mohan Singh";
        String[] str=input.split(" ");
        String longest="";
        for (int i=0;i<str.length;i++){
            if (str[i].length()>longest.length()) {
                longest=str[i];

            }


        }
        System.out.println(longest);
    }
}
