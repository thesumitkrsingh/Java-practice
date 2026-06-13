package Multithreading;
class SleepThread extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println(i);
        }
        System.out.println("Boom!");

    }
}
public class ThradSleep {
    public static void main(String[] args){
        SleepThread t1=new SleepThread();
        t1.start();

    }
}
