import  java.util.*;
public class PersonalProfile {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name=scn.nextLine();
        System.out.println("Enter Your age");
        int age=scn.nextInt();
        System.out.println("Enetr Yout Salary");
        Double salary=scn.nextDouble();
        System.out.println("Name of person is :"+name+"and Age Of a person is:"+age+"salary is:"+salary);

    }
}
