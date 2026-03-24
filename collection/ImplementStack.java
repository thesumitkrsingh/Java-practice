package collection;
import java.util.*;
public class ImplementStack {
    public static void main(String[] args){
        ArrayDeque<Integer> stack=new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);
        stack.peek();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
//s
    }
}
