package processFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class ProcessFile {
    public String processFile() throws IOException {
        try (var br = new BufferedReader(new FileReader("C:\\Users\\Usuario\\IdeaProjects\\modern-java\\src\\data.txt"))) {
            return br.readLine();
        }
    }
}
