package String;
import java.util.*;
//Count occurrences of each character in a string
public class OccuranceCheck {
    public static void main(String[] args){
        Map<Character,Integer> str = new HashMap<>();
        String input="Success";
        for(char c:input.toCharArray()){
            str.put(c, str.getOrDefault(c,0)+1);
        }
        System.out.println(str);



    }
}
