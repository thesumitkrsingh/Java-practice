package java8;
import java.util.*;
//Write a lambda to sort a list of integers in descending order
public class SortInteger {
    public static void main(String[] args){
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(4);
        Collections.sort(list,(a,b)->b-a);
        System.out.println(list);


    }

}
