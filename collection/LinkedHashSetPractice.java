package collection;
import java.util.*;


//Remove duplicates from an ArrayList using LinkedHashSet
public class LinkedHashSetPractice {
   public static void main(String[] args){
       List<Integer> list=new ArrayList<>();
       list.add(1);
       list.add(3);
       list.add(3);
       list.add(4);
       list.add(5);
       Set<Integer> set=new LinkedHashSet<>(list);
       System.out.println(set);

   }

}
