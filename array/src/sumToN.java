public class sumToN {
    public static void main(String[] args) {
    int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.print(sum(array,4));

    }
    public static int sum(int[] arr, int n){
        int sum = 0;
        for (int i = 0; i < n ; i++) {
            sum += arr[i];
        }
        return sum;
    }

}


