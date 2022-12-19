import java.io.*;
import java.io.FileInputStream;

public class CopyChars {
    public static void main(String[] args) throws IOException {
        FileReader input = null;
        FileWriter output = null;

        try {
            input = new FileReader("adele.txt");
            output = new FileWriter("out.txt");
            int c;
            while ((c = input.read()) != -1) {
                output.write(c);
            }
        } finally {
            if (input != null) {
                input.close();
            }
            if (output != null) {
                output.close();
            }
        }
    }
}

