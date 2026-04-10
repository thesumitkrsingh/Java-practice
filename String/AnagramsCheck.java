package String;
import java.util.*;
//Check if two strings are anagrams of each other
public class AnagramsCheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter First String");
        String input = scn.nextLine();
        System.out.println("Enter Second String");
        String aInput = scn.nextLine();
        if(input.length()!=aInput.length()){
            System.out.println("Nota Anagram [length not match");
            return;
        }
        //s
        char[] s1=input.toCharArray();
        char[] s2=aInput.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        if(Arrays.equals(s1,s2)){
            System.out.println("Its Anagram");
        }else{
            System.out.println("Not a Anagram");
        }
    }
}
