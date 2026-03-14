package OopPractice;

public class MultiLevelInheritance {
    public static void main(String[] args){
        vehicle ob1=new vehicle();
        car ob2=new car();
        ElectricVehicle ob3=new ElectricVehicle();
        ob1.veh();
        ob2.ca();
        ob3.electric();
    }
}
class vehicle{
    void veh(){
        System.out.println("it is a Vehicle Class");
    }
}
class car extends vehicle{
    void ca(){
        System.out.println("Its a Car class");
    }
}
class ElectricVehicle extends car{
    void electric(){
        System.out.println("Its a electric Vehicle");
    }
}
