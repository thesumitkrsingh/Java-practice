import java.util.*;
public class FarenToCelcius {
    public static void main(String[] args){
    Scanner scn =new Scanner(System.in);
    System.out.println("Farenhite to celcius");
    int input=scn.nextInt();
    int celcius=(input-32)*5/9;
    System.out.println("Celcius is :"+celcius);
    }
}
