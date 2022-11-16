import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IWannaBeTheGay {
    public static void main(String[] args) {

        Set<Integer> list = new HashSet<Integer>();
        Scanner scn = new Scanner(System.in);
        int levels = scn.nextInt();
        int levelsX = scn.nextInt();

        for (int i = 0; i < levelsX; i++) {
            list.add(scn.nextInt());
        }
        int levelsY = scn.nextInt();
        for (int j = 0; j < levelsY; j++) {
            list.add(scn.nextInt());
        }
        if (list.size() == levels) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }
    }
}