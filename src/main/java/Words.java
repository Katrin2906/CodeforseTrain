import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Words {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int testNumber = Integer.parseInt(bufferedReader.readLine());

        while (testNumber-- > 0) {
            String longWord = bufferedReader.readLine();
            if (longWord.length() > 10) {
                out.println(Character.toString(longWord.charAt(0)) + (longWord.length() - 2) + Character.toString(longWord.charAt(longWord.length() - 1)));
            } else out.println(longWord);
        }
        out.flush();
    }
}