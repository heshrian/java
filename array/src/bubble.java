import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] datArr = {4,2,3,5,1};
        System.out.println(Arrays.toString(bubblie(datArr)));
    }

    public static int[] bubblie(int[] list) {
        int temp;
        for (int i = 0; i < list.length-1; i++) {
            for (int j = 0; j < list.length-1-i; j++) {

                if (list[j] > list[j+1]) {
                    temp = list[j];
//                    System.out.print(temp + " ");
//                    System.out.print("i" + i + " ");
//                    System.out.println("j" +j + " ");
//                    System.out.println("lista" + Arrays.toString(list));
                    list[j] = list[j+1];

                    list[j+1] = temp;
                }
            }
        }
        return list;
    }
}
