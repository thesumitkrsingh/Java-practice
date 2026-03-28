package collection;
import java.util.*;
//import java.lang.*;
public class arrayList {
    public static void main(String[] args){
        List<String> arr=new ArrayList<>();
        arr.add("Suraj");
        arr.add("Sumit");
        arr.add("Vivek");
        arr.add("Sachin");

        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);

        System.out.println(arr.size());
        arr.contains("Sachin");


    }
}
