package OopPractice;

public class SingeltonClass {
    public static void main(String[] args){
        db obj1=db.getInstance();
        db obj2=db.getInstance();
    }
}
class db{
    static db obj=new db();
    private db(){

    }
    static db getInstance(){
        return obj;
    }
}
