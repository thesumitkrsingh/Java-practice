package collection;
import java.util.*;
//Find the most repeated element in a list using HashMap
public class MostRepeatedElement {
    public static void main(String[] args){
        HashMap<Integer,Integer> repeated=new HashMap<>();
        repeated.put(1,1);
        repeated.put(2,2);
        repeated.put(3,1);
        //System.out.println(repeated);
        int maxcount=0;
        int mostrepeated=-1;
        for(Map.Entry<Integer,Integer >entry:repeated.entrySet()){
           if(entry.getValue()> maxcount){
               maxcount= entry.getValue();
               mostrepeated=entry.getKey();
           }


        }
        System.out.println(mostrepeated);



    }
}
