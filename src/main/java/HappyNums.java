import java.util.Scanner;

public class HappyNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        String string = Long.toString(num);
        if (string.contains("4") | string.contains("7")) {
            long counterFore = string.chars().filter(ch -> ch == '4').count();
            long counterSeven = string.chars().filter(ch -> ch == '7').count();
            long counter = counterFore + counterSeven;
            if (counter == 4 | counter == 7) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        } else {
            System.out.println("NO");

        }
    }
}


