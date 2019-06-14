import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileText {
    private FileReader file;
    private BufferedReader reader;
    private String text = "";

    public void processReadText(String path) throws IOException {
        openFile(path);
        readFile();
        showFile();
    }
    public void openFile(String path) throws FileNotFoundException {
        file = new FileReader(path);
        reader = new BufferedReader(file);
    }

    public String readFile() throws IOException {
        String line = reader.readLine();
        while (line != null) {
            text += line;
            line = reader.readLine();
        }
        return text;
    }

    public void showFile() {
        System.out.println(text);
    }
}
