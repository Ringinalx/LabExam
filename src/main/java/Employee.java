public class Employee {
    String Title;
    String Name;
    String PiD;
    int Phone;
    int Age;
    String EmploymentType;

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
}
