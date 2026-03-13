package OopPractice;

public class SumOfNumber {
    int a;
    int b;
    int c;
    int sum(int a,int b){
        this.a=a;
        this.b=b;
        int add=a+b;
        return add;
    }
    int sum(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
        int add=a+b+c;
        return add;

    }
    double sum(double a,double b,double c){
        double add=a+b+c;
        return add;

    }

    public static void main(String[] args){
          SumOfNumber obj=new SumOfNumber();
          int result1=obj.sum(4,4);
          int result2=obj.sum(4,4,4);
          double result3=obj.sum(3.5,3.5,3.5);
          System.out.println(result1);
          System.out.println(result2);
          System.out.println(result3);
    }
}
