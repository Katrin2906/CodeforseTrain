import java.util.Scanner;

public class SchoolBoysAndGirls {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int length = scn.nextInt();
        int time = scn.nextInt();
        String str = scn.next();
        char[] line = str.toCharArray();
        while (time-- > 0) {
            for (int i = 1; i < length; i++) {
                if (line[i] == 'G' && line[i - 1] == 'B') {
                    line[i] = 'B';
                    line[i - 1] = 'G';
                    i++;
                }
            }
        }
        for (int i = 0; i < length; i++) {
            System.out.print(line[i]);
        }
    }
}