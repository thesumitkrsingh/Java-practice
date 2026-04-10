package String;
import java.util.*;
//Remove all duplicate characters from a string
public class RemoveDublicates {
    public static void main(String[] args){
        Set<Character> str=new LinkedHashSet<>();
        String input="Success";

        for(char c:input.toCharArray()){

            str.add(c);
        }
        System.out.println(str);
    }

}
