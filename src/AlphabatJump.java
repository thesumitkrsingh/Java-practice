import java.util.*;
public class AlphabatJump {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("jump alphabat");
        char ch=scn.next().charAt(0);
        char nextCh;
        if((ch >='a')&&(ch<'z')||(ch >='A')&&(ch<'Z')){
            nextCh =(char) (ch+1);
        }
        else if (ch == 'z') {
            nextCh = 'a'; // Wrap from 'z' to 'a'
            System.out.println("The next character is: " + nextCh);
        } else if (ch == 'Z') {
            nextCh = 'A'; // Wrap from 'Z' to 'A'
            System.out.println("The next character is: " + nextCh);
        } else {
            System.out.println("Invalid input: Not a valid alphabet character.");
        }



    }
}
