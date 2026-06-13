package Multithreading;
 class runnableThread implements Runnable{
     @Override
     public void run() {
         System.out.println("Thread Start Running");
     }
 }
public class CreateRunnableThread {
    public static void main(String[] args){
        Thread t=new Thread(new runnableThread());
        t.start();

    }
}
