package collection;
import java.util.*;
//Group words by their first letter using HashMap<Character, List<String>>
public class GroupWordByThierFirstLater {
    public static void main(String[] args){
        HashMap<Character,List<String>> list= new HashMap<>();
        List<String> alist=new ArrayList<>();
        alist.add("Aman");
        alist.add("Sumit");
        alist.add("Hima");
       list.put('A',alist);
       list.put('S',alist);
       list.put('H',alist);
        System.out.println(list);



    }
}
