package LogicBuilding;
import java.util.*;
public class DayoFWeek {
    public static void main(String[] args){
      Scanner scn=new Scanner(System.in);

      System.out.println("Enetr The Day");
      int day=scn.nextInt();
      switch(day){
            case 1:
                System.out.println("monday");
                break;
          case 2:
              System.out.println("Tuesday");
              break;
          case 3:
              System.out.println("Wednesday");
              break;
          case 4:
              System.out.println("Tursday");
              break;
          case 5:
              System.out.println("Friday");
              break;
          case 6:
              System.out.println("Saturday");
              break;
          case 7:
              System.out.println("Sunday");
              break;
          default:
              System.out.println("Not A WeekDay ");

        }
    }
}
