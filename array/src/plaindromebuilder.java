public class plaindromebuilder {
    public static void main(String[] args) {
        System.out.println(palindrome("qwerty"));
    }
    public static String palindrome(String input){
        String[] inputArray = input.split("");
        for (int j = inputArray.length-1; j >=0 ; j--) {
            input+=inputArray[j];
        }
    return input;
    }
}
