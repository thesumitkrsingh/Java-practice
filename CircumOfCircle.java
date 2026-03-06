import java.util.*;
public class CircumOfCircle {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Circumfarence of Circle");
        double r=scn.nextDouble();
        double pi=Math.PI;
        double circumferenc=2*pi*r;
        System.out.println(circumferenc);

    }
}
