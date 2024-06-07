import processFile.ProcessFile;

import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        var pf = new ProcessFile();
        System.out.println(pf.processFile((BufferedReader br) -> br.readLine() + br.readLine()));
    }
}

