import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

class Employee{
    int e_id;
    String name;
    int age;

    public Employee(int e_id, String name, int age) {
        this.e_id = e_id;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return e_id == employee.e_id && age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(e_id, name, age);
    }
}

public class DuplicateEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Anit",22);
        Employee e2 = new Employee(2,"Aditya",23);
        Employee e3 = new Employee(4,"Aman",23);
        Employee e4 = new Employee(3,"Hrushikesh",21);
        Employee e5 = new Employee(5,"Om",24);
        Employee e6 = new Employee(1,"Anit",22);
        HashSet<Employee> empset = new HashSet<>();
        empset.add(e1);
        empset.add(e2);
        empset.add(e3);
        empset.add(e4);
        empset.add(e5);
        empset.add(e6);
        System.out.println(empset.size());
    }
}
