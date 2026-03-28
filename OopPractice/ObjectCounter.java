package OopPractice;

public class ObjectCounter {
    public static void main(String[] args){
        Counter obj1=new Counter();
        Counter obj2=new Counter();
        Counter obj3=new Counter();
        System.out.println(Counter.getCount());
    }

}
class Counter{
    static int count=0;
   public Counter(){
        count++;
    }
    static int getCount(){
       return count;
    }
}
