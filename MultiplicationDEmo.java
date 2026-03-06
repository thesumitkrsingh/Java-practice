import java.util.*;
//Print multiplication table of any number entered by user
public class MultiplicationDEmo {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        System.out.println("Enetr the number For the Multiplication");
        int num=scn.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num +"x"+i+"="+num*i);


        }
    }
}
