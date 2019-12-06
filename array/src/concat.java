public class concat {
    public static void main(String[] args) {
        String[] animals = {"koal", "cic", "kuty"};
        for (int i = 0; i < animals.length ; i++) {
            System.out.print(typo(animals[i]) + " ");
        }

    }

    public static String typo(String string){
       return string.concat("a");
    }
}
