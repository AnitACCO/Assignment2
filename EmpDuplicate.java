import java.util.*;

class EmpData {

    int id;
    String name;
    // --Commented out by Inspection (2/10/2023 9:57 PM):int age;

    EmpData(int i, String n, int a){
        this.id = i;
        this.name = n;
        this.age = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmpData)) return false;
        EmpData empData = (EmpData) o;
        return id == empData.id && age == empData.age && name.equals(empData.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }
}
public class EmpDuplicate{
    public static void main(String[] args) {
        EmpData E1 = new EmpData(1,"Anit",22);
        EmpData E2 = new EmpData(2,"Hrushikesh",23);
        EmpData E3 = new EmpData(3,"Aman",21);
        EmpData E4 = new EmpData(4,"Aditya",24);
        EmpData E5 = new EmpData(5,"Om",21);
        EmpData E6 = new EmpData(1,"Anit",22);
        List<EmpData> empList = new ArrayList<EmpData>();
        empList.add(E1);
        empList.add(E2);
        empList.add(E3);
        empList.add(E4);
        empList.add(E5);
        empList.add(E6);
        Set<EmpData> empSet = new HashSet<EmpData>();
        for(EmpData e:empList){
            empSet.add(e);
        }
        for(EmpData e : empSet) {
            System.out.println(e.id + " " + e.name);
        }
    }
}


