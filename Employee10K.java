import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class EmployeeData{
    String name;
    String designation;
    Long contactno;
    String department;
    int salary;

    public EmployeeData(String name, String designation, Long contactn0, String department, int salary) {
        this.name = name;
        this.designation = designation;
        this.contactno = contactn0;
        this.department = department;
        this.salary = salary;
    }
}

public class Employee10K {
    public static void main(String[] args) {
        EmployeeData e1 = new EmployeeData("Anit","Software Engineer",7888631689L,"Training", 20000);
        EmployeeData e2 = new EmployeeData("Krishna","Software Engineer",7888631689L,"Training", 5000);
        EmployeeData e3 = new EmployeeData("Ansh","Software Engineer",7888631689L,"Training", 10000);
        EmployeeData e4 = new EmployeeData("Raj","Software Engineer",7888631689L,"Training", 12000);
        EmployeeData e5 = new EmployeeData("Achal","Software Engineer",7888631689L,"Training", 25000);
        EmployeeData e6 = new EmployeeData("Rahul","Software Engineer",7888631689L,"Training", 50000);
        List<EmployeeData> emplist = new ArrayList<>();
        emplist.add(e1);
        emplist.add(e2);
        emplist.add(e3);
        emplist.add(e4);
        emplist.add(e5);
        emplist.add(e6);
        List<String> emplist2 = emplist.stream().filter(p ->p.salary > 10000).map(p -> p.name).collect(Collectors.toList());
        System.out.println(emplist2);
    }
}
