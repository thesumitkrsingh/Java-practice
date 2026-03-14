package OopPractice;

public class RunTimePolymorphism {
    public static void main(String[] args){
        animal obj1=new dog();
        animal obj2=new cat();


        obj1.anm();
        obj2.anm();



    }
}
class animal{
      void anm(){
          System.out.println("its a animal");
      }
        }

class dog extends animal{
    @Override
    void anm(){
        System.out.println("Bhow....");
    }
}
class cat extends animal{
    @Override
    void anm(){
        System.out.println("Meow......");
    }
}