package collection;
import java.util.*;
//Use Iterator to safely remove elements from ArrayList while iterating
public class ArrayListIterator {
    public static void main(String[] args){
        List<String> list=new ArrayList<>();
        list.add("Sumit");
        list.add("Sachin");
        list.add("Karan");
        Iterator<String> i= list.iterator();
        while(i.hasNext()){
            String crnt=i.next();
            if(crnt.equals("Karan")){
               i.remove();
            }
//ss


        }
        System.out.println(list);



    }
}
//s