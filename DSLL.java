import java.util.*;
class Linkedli<T> {
    LinkedList<T> li = new LinkedList<T>();

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

public class DSLL {
    public static void main(String[] args) {
        Linkedli<Integer> list = new Linkedli();
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
