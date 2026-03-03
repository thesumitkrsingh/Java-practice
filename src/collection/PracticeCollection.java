package collection;
import java.util.*;


public class PracticeCollection {
    public static void main(String[] args){
        List<Integer> num=new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);

        System.out.println(num);
        if(num.isEmpty()){
            System.out.println("List is  Empty");
        }else{
            System.out.println("list is not empty");
        }
        num.clear();
        System.out.println(num);

        System.out.println(num.isEmpty());
    }
}
