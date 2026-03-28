package OopPractice;

public class InnerClass {
    public static void main(String[] args){
        Outer oj= new Outer();
        Outer.inner op=oj.new inner("Sumit",21);
    }

}
class Outer{
    String name;
    int age;
    class inner{

        public  inner(String name,int age){
              Outer.this.name=name;
              Outer.this.age=age;
          }
    }
}
