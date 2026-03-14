package OopPractice;

public class iImmutableClass {
    public static void main(String[] args){
        Employee obj1=new Employee("sumit","IT");
        Employee obj2=new Employee("Sachin","IT");
        System.out.println(obj1.get_Name());
        System.out.println(obj2.get_Dept());

    }
}
final class  Employee{
    private final String employee_name;
    private final String employee_dept;
    Employee(String employee,String dept){
        this.employee_name=employee;
        this.employee_dept=dept;
    }
    String get_Name(){
        return employee_name;
    }
    String get_Dept(){
        return employee_dept;
    }

}
