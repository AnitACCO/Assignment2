import java.util.*;
class Queueli<T> {
    PriorityQueue<T> li = new PriorityQueue<T>();

    public void add1(T i){
        li.add(i);
    }

    public void remove1(T i){
        li.remove(i);
    }

    public void display1(){
        System.out.println(li);
    }

}

public class DSQL {
    public static void main(String[] args) {
        Queueli<Integer> list = new Queueli<Integer>();
        list.add1(1);
        list.add1(4);
        list.add1(2);
        list.add1(5);
        list.add1(9);
        list.add1(3);
        list.display1();
        list.remove1(3);
        list.display1();
        list.remove1(9);
        list.display1();
    }
}
