import java.util.ArrayList;

public class EmployeeList extends Employee{
    public static void main(String args[]){
       Employee emp1 = new Employee();
        ArrayList EmployeeList = new ArrayList();
        EmployeeList.add(emp1);
        System.out.println(" "+EmployeeList);
    }
}
