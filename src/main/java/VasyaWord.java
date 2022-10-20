import java.util.Scanner;

public class VasyaWord {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String interNewWord = x.nextLine();
        int upperCase = 0;
        int lowerCase = 0;
        for (int l = 0; l < interNewWord.length(); l++) {
            if (Character.isUpperCase(interNewWord.charAt(l))) {
                upperCase++;
            }
            if (Character.isLowerCase(interNewWord.charAt(l))) {
                lowerCase++;
            }
        }
        if (lowerCase >= upperCase) {
            System.out.println(interNewWord.toLowerCase());
        } else System.out.println(interNewWord.toUpperCase());
    }
}
