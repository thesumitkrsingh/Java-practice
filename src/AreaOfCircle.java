import java.util.*;
public class AreaOfCircle{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the radius");
        double radius=scn.nextDouble();
        double pi=Math.PI;
        double area_of_circle=pi*radius*radius;
        System.out.println("Area Of Circle:"+area_of_circle);

    }
}