package OopPractice;
import java.lang.*;

public class Animal {
    void sound(){
        System.out.println("Sound");
    }
    public static void main(String[] args){
        Animal obj1=new Animal();
        Dog obj2=new Dog();
        Cat obj3=new Cat();
        obj1.sound();
        obj2.sound();
        obj3.sound();
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Bhow.... Bhow.....");
    }

}
class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Meow... Meow...");
    }
}


