public class Employee {
    static String Title;
    static String Name;
    static String PiD;
    static int Phone;
    static int Age;
    static String EmploymentType;

    @Override
    public String toString(){
        return Title+" "+Name+" "+PiD+" "+Phone+""+Age+""+EmploymentType;
    }
    Employee(){
        String title = this.Title;

        String name = this.Name;

        String piD = this.PiD;

        int phone = this.Phone;
        int age = this.Age;
    }

    public Object returnInput(int i, boolean b, boolean b1, boolean b2) {
        return 0;
    }
}
