public class Exercice4 {
    public static char[] alphabet = new char[26];
    public static double[] frecency = new double[26];

    static {
        for (int k = 0; k < 26; k++) {
            alphabet[k] = (char) ('a' + k);
            frecency[k] = 0.0;
        }
    }

    public static void alphabetFrecency(String str) {
        String str_new=str.toLowerCase().replace(" ", "");
        str_new=str_new.replace("'","");
        System.out.println(str_new);
        for(int j=0;j<26;j++){
            for(int i=0;i<str_new.length() ;i++){
                if(alphabet[j]==str_new.charAt(i)){
                    frecency[j]++;
                }
            }
            frecency[j]=frecency[j]*100/str_new.length();
        }
    }

    public static void main(String[] args) {
        String str = "Le soleil brille aujourd'hui";
        alphabetFrecency(str);
        for(int k=0 ;k<26;k++){
            System.out.println("Alphabet :"+alphabet[k]+" and frecency ="+frecency[k]+"%");
        }
    }
}
