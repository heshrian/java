import java.util.Arrays;

public class anagramm {
    public static void main(String[] args) {
        System.out.print(anagramm("dog","god"));
    }
    public static boolean anagramm(String s1, String s2 ){
        boolean checker = true;
        String[] word1 = s1.split("");
        String[] word2 = s2.split("");
        Arrays.sort(word1);
        Arrays.sort(word2);

        for (int i = 0; i < word1.length; i++) {
            if (!word2[i].equals(word1[i])){
                checker = false;
            }
        } return checker;
    }
}
