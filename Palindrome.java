import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int number=scn.nextInt();
        int original=number;
        int num=0;
        while(number>0){
            int result=number%10;
            num=num*10+result;
            number=number/10;
//
        }
        if(original==num){
            System.out.println("its Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
