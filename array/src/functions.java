import java.util.Scanner;

public class functions {

    public static void main(String[] args) {

        System.out.println(addThem(5, 2));
        System.out.println(random(5));
    }
        public static int addThem(int a ,int b){
            int c = a + b;
            return c;
        }

        public static int random(int n){
            return (int) (Math.random() * (n + 1));
        }
}


