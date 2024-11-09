public class Exercice2 {
    /**
    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
    public static void main(String[] args) {
        String str = "radar";
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }*/
    public static boolean isPalindrome(String str) {
        if (str==null)
        return false;
        int nbr=str.length();
        int fin=nbr-1;
        do{
            for (int i=0;i<nbr/2;i++) {
                if (str.charAt(i)!=str.charAt(fin)) {
                    return false;
                }
                fin--;
            }
        }while (fin>((nbr/2)+1));
        return true;
    }
        public static void main(String[] args) {
        String str = "radar";
            System.out.println(str + " is a palindrome ?"+isPalindrome(str));
        }
}    
