import java.util.*;
class Arrayli<T> {
    ArrayList<T> li = new ArrayList<T>();

    public void add(T i){
        li.add(i);
    }

    public void remove(T i){
        li.remove(i);
    }

    public void display(){
        System.out.println(li);
    }

}

public class DSAl {
    public static void main(String[] args) {
        Arrayli<Integer> list = new Arrayli();
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.display();
        list.remove(3);
        list.display();
        list.remove(9);
        list.display();
    }
}
