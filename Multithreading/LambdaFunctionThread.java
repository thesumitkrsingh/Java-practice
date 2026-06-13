package Multithreading;

public class LambdaFunctionThread {
    public static void main(String[] args){
        Runnable task=()->{
            System.out.println(Thread.currentThread().getName());
        };
        Thread thread=new Thread(task);
        thread.start();
    }
}
