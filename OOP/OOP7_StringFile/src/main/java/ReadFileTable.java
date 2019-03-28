import java.io.*;
import java.util.Scanner;

public class ReadFileTable {
    private Scanner scanner;

    public void processReadTableThreeColumn(String path) throws Exception {
        openFile(path);
        readFile();
        closeFile();
    }

    private void openFile(String path) {
        try {
            scanner = new Scanner(new File(path));
        } catch (Exception e) {
            System.out.println("file not found");
        }
    }

    private void readFile() {
        while (scanner.hasNext()) {
            String a = scanner.next();
            String b = scanner.next();
            String c = scanner.next();

            System.out.printf("%s %s %s\n", a, b, c);
        }
    }

    private void closeFile() {
        scanner.close();
    }

}
