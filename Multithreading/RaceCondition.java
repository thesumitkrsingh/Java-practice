package Multithreading;
class Condition{
    int counter;
    public void increment(){
        counter++;
    }
}

public class RaceCondition {
    public static void main(String[] args) throws Exception{
        Condition count=new Condition();
        Thread t1=new Thread(()->{
            for(int i=0;i<10000;i++){
                count.increment();
            }
        });
        t1.start();
        Thread t2=new Thread(()->{
            for(int i=0;i<10000;i++){
                count.increment();
            }
        });
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final Counter Value: " + count.counter);


    }

}
