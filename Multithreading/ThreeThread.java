package Multithreading;
class ThreadOne implements Runnable{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
class ThreadTwo implements Runnable{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
class ThreadThree implements Runnable{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}

public class ThreeThread {
    public static void main(String[] args){
        Thread t1=new Thread(new ThreadOne());
        t1.start();
        Thread t2=new Thread(new ThreadTwo());
        t2.start();
        Thread t3=new Thread (new ThreadThree());
        t3.start();
    }
}
