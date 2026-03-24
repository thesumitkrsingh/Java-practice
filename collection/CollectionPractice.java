package collection;
import java.util.*;
//ArrayList of 10 students, sort by name, print in reverse order
public class CollectionPractice {
   public static void main(String[] args){
       List<String> Student=new ArrayList<>();
       Student.add("Sumit");
       Student.add("Sachin");
       Student.add("Suraj");
       Student.add("Mohit");
       Student.add("Himanshu");
       Student.add("Ujjawal");
       Student.add("karan");
       Student.add("Sonu");
       Student.add("Satish");
       Student.add("Rajnish");
       Collections.sort(Student);
       Collections.reverse(Student);
       System.out.println(Student);
   }
}
