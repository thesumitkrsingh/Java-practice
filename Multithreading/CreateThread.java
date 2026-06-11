package Multithreading;
class Mythread extends Thread{
   public void run(){
       for(int i=0;i<10;i++){
           System.out.println(i);
       }

   }

}

public class CreateThread {
    public static void main(String[] args){
        Mythread thread = new Mythread();
        thread.start();
    }


}
