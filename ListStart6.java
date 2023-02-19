import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.*;

public class ListStart6 {
    public static void main(String[] args) {
        List<Integer> numlist = new ArrayList();
        numlist.add(42147);
        numlist.add(6235);
        numlist.add(761379);
        numlist.add(663651);
        numlist.add(42362);
        numlist.add(6721);
        numlist.add(61385);
        System.out.println(numlist.stream().filter(p -> (int)p/((int)(pow(10,(int)log10(p)))) == 6).findFirst());
    }
}
