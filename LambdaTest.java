@FunctionalInterface
interface Operate{
    int operations(int a,int b);
}

public class LambdaTest {
    public static void main(String[] args) {

        Operate ad1=(a,b)->(a+b);
        System.out.println(ad1.operations(10,20));
        Operate mul1=(a,b)->(a*b);
        System.out.println(mul1.operations(10,20));

    }
}  