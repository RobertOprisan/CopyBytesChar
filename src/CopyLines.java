import java.io.*;

public class CopyLines {
    public static void main(String[] args) throws IOException {
        BufferedReader input = null;
        PrintWriter output = null;

        try {
            input = new BufferedReader(new FileReader("adele.txt"));
            output = new PrintWriter(new FileWriter("adele2.txt"));

            String line;
            while ((line = input.readLine()) != null) {
                output.println(line.toUpperCase());
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
