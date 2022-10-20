import java.io.IOException;
import java.util.*;

public class BoyOrGirl {
    public static void main(String[] args) throws IOException {
        Scanner x = new Scanner(System.in);
        String interNewName = x.nextLine();
        Set<Character> charactersInWord = new HashSet<>();
        for (Character letter : interNewName.toCharArray()) {
            charactersInWord.add(letter);
        }
        if (charactersInWord.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}
