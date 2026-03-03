package collection;
import java.util.*;
public class DemoStack {
    public static void main(String[] args){
        Stack<Integer> num= new Stack<>();
        for(int i=1;i<5;i++){
            System.out.println(num.push(i));


        }
        num.pop();
        System.out.println(num);
    }

}
