package Multithreading;
class Block{
    int counter;
    public void increment(){
        synchronized (this){
            counter++;
        }

    }
}
public class SyncronizedBlock {
    public static void main(String[] args)throws InterruptedException{
        Block b=new Block();
        Thread t1=new Thread(()->{
            for(int i=0;i<10000;i++){
                b.increment();
            }
        });
        Thread t2=new Thread(()->{
            for(int i=0;i<10000;i++){
                b.increment();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(b.counter);

    }
}
