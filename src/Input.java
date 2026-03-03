import java.util.*;
class Input {
    Scanner scn=new Scanner(System.in);
}
class Main{
    public static void main(String[] args){
        Input obj=new Input();
        System.out.println("Eenter your name ");
        String name=obj.scn.nextLine();
        System.out.println("Hello"  +name);


    }
}

