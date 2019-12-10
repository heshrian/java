import java.util.Scanner;

public class ScannerData {

    public String getString(){
        Scanner scanner = new Scanner((System.in));
        String returnValue = scanner.nextLine();
//        scanner.close();
        return returnValue;
    }
    public Integer getInt(){
        Scanner scanner = new Scanner((System.in));
        int returnValue = scanner.nextInt();
//        scanner.close();
        return returnValue;
    }
//    scanner.close();
}
