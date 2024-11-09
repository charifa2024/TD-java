public class Exercice3 {
    public static int[] countVowelsAndConsonants(String str) {
        int[] result = new int[2];
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            } else if (c >= 'a' && c <= 'z') {
                consonants++;
            }
        }
        result[0] = vowels;
        result[1] = consonants;
        return result;
    }
    public static void main(String[] args) {
        String str = "computer science";//9,6
        int[] result = countVowelsAndConsonants(str);
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }
        
}
