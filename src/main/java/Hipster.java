import java.util.Scanner;

public class Hipster {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        if (a == 0) {
            int sd;
            if (b % 2 == 0) {
                sd = b / 2;
            } else {
                sd = (b - b % 2) / 2;
            }
            System.out.println(0 + " " + sd);

        }
        if (b == 0) {
            int sd;
            if (a % 2 == 0) {
                sd = a / 2;

            } else {
                sd = (a - a % 2) / 2;
            }
            System.out.println(0 + " " + sd);
        }
        if (a != 0 && b != 0) {
            int c = Math.max(a, b);
            int d = Math.min(a, b);
            int hd = d;
            int sd = (c - d)/2;
            System.out.println(hd + " " + sd);
        }

    }
}