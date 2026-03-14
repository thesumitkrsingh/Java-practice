package OopPractice;

public class InterfacePractice {
    public static void main(String[] args){
        Cir obj1=new Cir();
        Rect obj2=new Rect();
        obj1.Draw();
        obj2.Draw();
    }
}
interface Drawable{
    void Draw();
}
class Cir implements Drawable{
    public void Draw(){
        System.out.println("Cirlce");
    }
}
class Rect implements Drawable{
    public void Draw(){
        System.out.println("reactangle");
    }
}