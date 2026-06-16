package Multithreading;
class Fix{
    int counter;
     public synchronized void increment(){
        counter++;

    }
}
public class Syncronized {
    public static void main(String[] args) throws Exception {
        Fix f=new Fix();
        Thread t1=new Thread(()->{
            for(int i=0;i<1000;i++){
               f.increment();
            }
        });
        t1.start();
        Thread t2=new Thread(()->{
            for(int i=0;i<1000;i++){
                f.increment();
            }
        });
        t2.start();
        t1.join();
        t2.join();
        System.out.println(f.counter);

    }
}
