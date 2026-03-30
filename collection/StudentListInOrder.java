package collection;
import java.util.Map;
import java.util.TreeMap;

//Store student name→marks in TreeMap and print in alphabetical order
public class StudentListInOrder {
    public static void main(String[] args){
        TreeMap<String,Integer> studentList=new TreeMap<>();
        studentList.put("Sumit",33);
        studentList.put("Sachin",34);
        studentList.put("Karan",36);
        studentList.put("Himanshu",37);
        System.out.println(studentList);
    }



}
