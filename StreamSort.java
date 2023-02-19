import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSort {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList();
        li.add(4746);
        li.add(6568);
        li.add(6688);
        li.add(85868);
        li.add(363);
        li.add(7769);
        List<Integer> li2  = li.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(li2);
    }
}
