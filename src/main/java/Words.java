import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Words {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int startN = Integer.parseInt(bufferedReader.readLine());

        while (startN > 0) {
            String string = bufferedReader.readLine();
            int length = string.length();
            if (length <= 10) {
                System.out.println(string);
            } else {
                int word = length - 2;
                System.out.print((char) string.charAt(0));
                System.out.print((word + ""));
                System.out.println((char) string.charAt(length - 1) + "");
            }
        }
    }
}