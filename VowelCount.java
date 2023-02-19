@FunctionalInterface
interface counter{
    public int counter(String s);
}

public class VowelCount {
    public static void main(String[] args) {
        counter c1 = (s) -> {
            int vcount = 0;
            for(int i = 0;i < s.length();i++){
                if(s.charAt(i) == 'a' ||s.charAt(i) == 'e' ||s.charAt(i) == 'i' ||s.charAt(i) == 'o' ||s.charAt(i) == 'u' ||
                        s.charAt(i) == 'A' ||s.charAt(i) == 'E' ||s.charAt(i) == 'I' ||s.charAt(i) == 'O' ||s.charAt(i) == 'U'){
                    vcount++;
                }

            }
            return vcount;
        };
        System.out.println(c1.counter("Anit Agrawal"));
    }

}
