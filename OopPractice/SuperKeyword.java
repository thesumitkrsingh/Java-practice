package OopPractice;

public class SuperKeyword {
    public static void main(String[] args){
        Home obj1=new Home("Sumit");
        Room obj2=new Room("Sachin");


    }
}
class Home{
    String name;
    public Home(String name){
        this.name=name;
    }
}
class Room extends Home{

  public Room(String name){
     super(name);
  }


}
