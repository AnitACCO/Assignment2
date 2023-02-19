class t{
    public int add(int a, int b){
        return a+b;
    }
    public float add(float a, float b){
        return a+b;
    }
    public String add(String a, String b){
        return a+b;
    }
}


class GenericsClass<T> extends t {
private T data1;
private T data2;

public GenericsClass(T d1, T d2){
        this.data1 = d1;
        this.data2 = d2;
        }



}

public class tempp{
    public static void main(String[]args){
        GenericsClass<Integer> intobj = new GenericsClass<Integer>(5,6);
        System.out.println("Addition is  "+intobj.add(5,6));
        GenericsClass<String> Stringobj = new GenericsClass<String>("hello ","World");
        System.out.println("Addition is "+Stringobj.add("hello ","World"));
    }
}