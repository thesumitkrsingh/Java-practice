package OopPractice;

public class InterfaceDemo {
    public static void main(String[] args){
        C op=new C();
        op.Show();
    }
}
interface A{
    void Show();
}
interface B{
    void Show();
}
class C implements A , B{
    public void Show(){
        System.out.println("multiple Inheritance");
    }
}
