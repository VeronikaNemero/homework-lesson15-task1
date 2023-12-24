import java.util.Arrays;
import java.util.Scanner;

public class ConsoleScanner {

    public static String[] consoleScanner(){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] arrray = string.split("\\,\\s");
        return arrray;
    }
}
