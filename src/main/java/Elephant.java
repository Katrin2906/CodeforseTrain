import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int way = sc.nextInt();
        int step = 0;
        while (way > 0) {
            if (way >= 5) {
                way = way - 5;
                step++;
            } else if (way <= 4) {
                way = way - 4;
                step++;
            } else if (way <= 3) {
                way = way - 3;
                step++;
            } else if (way <= 2) {
                way = way - 2;
                step++;
            } else if (way <= 1) {
                way = way - 1;
                step++;
            }
        }
        System.out.println(step);
    }
}
