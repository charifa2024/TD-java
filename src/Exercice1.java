
public class Exercice1 {
    public static int countCaracters(String str) {
        if (str==null) {
            return 0;
        }
        return str.length();
    }

    public static void main(String[] args) {
        String str = "computer science";
        System.out.println("caracter's number equal to :"+countCaracters(str));
    }
}
