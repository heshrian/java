import java.util.NoSuchElementException;
import java.util.Scanner;

public class ScannerData {
    Scanner scanner = null;
    String returnString = null;
    int returnInt;
    public String getString(){
        scanner = new Scanner((System.in));
        returnString = scanner.nextLine();
        return returnString;
    }

    public Integer getInt(){
        scanner = new Scanner((System.in));
        if (scanner.hasNextInt()){
            returnInt = scanner.nextInt();
        }
        return returnInt;
    }
    public void closeScanner(){
        this.scanner.close();
    }
}
