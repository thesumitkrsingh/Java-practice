package LogicBuilding;

public class SwapNumber {
    public static void main(String[] args){
        int a=4;
        int b=5;
        a=a+b;
        b=a-b;
        a=a-b;
        //b=a-b;


        System.out.println(b);
        System.out.println(a);
    }

}
