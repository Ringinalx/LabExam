import java.util.ArrayList;
import java.util.Scanner;
public class EmployeeList extends Employee{
    public static void main(String args[]){
       Employee emp1 = new Employee();
        ArrayList EmployeeList = new ArrayList();
        EmployeeList.add(emp1);
        System.out.println(" "+EmployeeList);
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Employee Title");
        Title = sc.next();
        System.out.println("Please Enter Employee Name");
        Name = sc.next();
        System.out.println("Please Enter Employee PID");
        PiD = sc.next();
        System.out.println("Please Enter Employee Phone");
        Phone = Integer.parseInt(sc.next());
        System.out.println("Please Enter Employee Age");
        Age = Integer.parseInt(sc.next());
        System.out.println("Please Enter Employee Type");
        EmploymentType = sc.next();
    }
}
