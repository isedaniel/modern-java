import apple.Apple;
import apple.AppleColor;
import processFile.ProcessFile;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        var pf = new ProcessFile();
        System.out.println(pf.processFile());
    }
}