import java.util.TreeSet;

class Employ implements Comparable<Employ> {
    int e_id;
    String name;
    int salary;

    public Employ(int e_id, String name, int salary) {
        this.e_id = e_id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employ o) {
        if(salary > o.salary){
            return 1;
        } else if (salary < o.salary) {
            return -1;
        }
        else {
            return 0;
        }
    }
}

public class SalaryEmployee {
    public static void main(String[] args) {
        Employ e1 = new Employ(1,"Anit",1364220);
        Employ e2 = new Employ(2,"Anithb",1364020);
        Employ e3 = new Employ(3,"Anitnv",13645220);
        Employ e4 = new Employ(4,"Anitsf",1364820);
        Employ e5 = new Employ(5,"Anitvftc",1164220);
        Employ e6 = new Employ(6,"Anithvjv",1362220);
        TreeSet<Employ> empset = new TreeSet<Employ>();
        empset.add(e1);
        empset.add(e2);
        empset.add(e3);
        empset.add(e4);
        empset.add(e5);
        empset.add(e6);
        for (Employ e: empset){
            System.out.println(e.salary+ " " + e.name);
        }
    }
}
