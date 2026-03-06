//import java.util.*;
//Sum of digits of a number (e.g. 1234 → 10)
public class SumoFNumber {
    public static void main(String[] args){
        int number=1234;
        int num=0;
        int digit;
        while(number>0){
            digit=number%10;
            num+=digit;
            number=number/10;
        }
        System.out.println(num);
    }

}
