package OopPractice;
public class Shape{
public static void main(String[] args){
    Circle obj=new Circle(3.14,5);
    double ar=obj.area();
    System.out.println(ar);
    Reactangle obj1=new Reactangle(4,6);
    double are=obj1.area();
    System.out.println(are);


}
}
abstract  class Shap {
    abstract double area();
}
class Circle extends Shap{
    private double pi;
    private double radius;
    public Circle(double pi,double radius){
        this.pi=pi;
        this.radius=radius;

        }
    @Override
    public double area(){
        return pi*radius*radius;


    }

    }
class Reactangle extends Shap{
    double width;
    double height;
    Reactangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    @Override
    public double area(){
        return width*height;
    }


}

