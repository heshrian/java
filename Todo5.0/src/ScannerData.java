import java.util.Scanner;

public class ScannerData {
    public String getString(){
        Scanner scanner = new Scanner((System.in));
        return scanner.nextLine();
    }
    public Integer getInt(){
        Scanner scanner = new Scanner((System.in));
        return scanner.nextInt();
    }
}
