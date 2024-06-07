package processFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class ProcessFile {
    public String processFile(BufferedReaderProcessor bfp) throws IOException {
        String path = "C:\\Users\\Usuario\\IdeaProjects\\modern-java\\src\\data.txt";
        try (var br = new BufferedReader(new FileReader(path))) {
            return bfp.process(br);
        }
    }
}
