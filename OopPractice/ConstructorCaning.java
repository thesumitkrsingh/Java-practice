package OopPractice;

public class ConstructorCaning {
    public static void main(String[] args){
        Person obj1=new Person("Sumit");
        Person obj2=new Person("Sumit",21);
        Person obj3=new Person("sumit",21,"Delhi");
;
    }
}
class Person{
    String name;
    int age;
    String city;
    public Person(String name){
        this(name,0);
    }
    public Person(String name,int age){
        this(name,age,"unknown");

    }
    public Person(String name,int age,String city){
        this.name=name;
        this.age=age;
        this.city=city;
    }

}
