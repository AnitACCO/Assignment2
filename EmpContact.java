import java.util.*;

class Employee1{
    static int a = 1;
    int e_id;
    String name;
    long pno;
    Employee1(String n, long p){
        this.e_id = a;
        this.name = n;
        this.pno = p;
        a++;
    }
}

public class EmpContact {
    public static void main(String[] args) {
        Employee1 E1 = new Employee1("Anit",9832383154L);
        Employee1 E2 = new Employee1("Hrushikesh",9832383254L);
        Employee1 E3 = new Employee1("Somik",9832383354L);
        Employee1 E4 = new Employee1("Mohan",9832383454L);
        Employee1 E5 = new Employee1("Aditya",9832383254L);
        Employee1 E6 = new Employee1("Aman",9832383354L);
        Employee1 E7 = new Employee1("Somikaa",9832383354L);
        long check = 9832383254L;
        List<Employee1> emplist = new ArrayList<>();
        Map<Long,Integer> same = new HashMap<>();
        emplist.add(E1);
        emplist.add(E2);
        emplist.add(E3);
        emplist.add(E4);
        emplist.add(E5);
        emplist.add(E6);
        emplist.add(E7);
        //System.out.println(emplist);
        Map<Long, String> map = new HashMap<Long, String>();
        for(Employee1 e: emplist){
            if(map.containsKey(e.pno)){
                map.put(e.pno, (map.get(e.pno) + ", " + e.name) );
                same.put(e.pno,1);
            }
            else{
                map.put(e.pno, e.name);
            }

        }
        for(Long l : same.keySet()){
            System.out.println(map.get(l));
        }

    }
}
