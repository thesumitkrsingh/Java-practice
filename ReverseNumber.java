//Reverse a number (e.g. 1234 → 4321)
public class ReverseNumber {
    public static void main(String[] args){
        int number=1234;
        int num=0;

        while(number>0){
            int result=number%10;
            num=num*10+result;
            number=number/10;


        }
        System.out.println(num);

    }
}
