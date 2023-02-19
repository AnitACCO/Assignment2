class  GenCLass<T>{
    T[] array;

    GenCLass(T[] t){
        this.array = t;
    }

    void swap(int pos1, int pos2){
        T temp;
        temp = array[pos1 - 1];
        array[pos1 - 1] = array[pos2 - 1];
        array[pos2 - 1] = temp;
    }
    void display() {
        System.out.println();
        for (T i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

public class Generics{
    public static void main(String[] args) {
        Integer[] arr = {2,3,1,54,12,64,53,11,44};
        GenCLass<Integer> g1 = new GenCLass<Integer>(arr);
        g1.display();
        g1.swap(2,6);
        g1.display();

        Character[] arr2 = {'a','b','f','e','q','s'};
        GenCLass<Character> g2 = new GenCLass<Character>(arr2);
        g2.display();
        g2.swap(2,4);
        g2.display();
    }
}
