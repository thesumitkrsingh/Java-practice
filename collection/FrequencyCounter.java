package collection;
import java.util.*;
public class FrequencyCounter {
    public static void main(String[] args){
        HashMap<String,Integer> map=new HashMap<>();
        String Word="Java And Java";
        String[] word=Word.split(" ");
        for(String w:word){
            if(map.containsKey(w)){
                map.put(w,map.get(w)+1);
            }else{
                map.put(w,1);
            }
        }
        System.out.println(map);



    }
}
