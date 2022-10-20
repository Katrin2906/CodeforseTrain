import java.util.HashMap;

public class NoteAndMagazine {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> letters = new HashMap<>();
        for (int i = 0; i < magazine.length(); ++i) {
            char m = magazine.charAt(i);
            int currentCount = letters.getOrDefault(m, 0);
            letters.put(m, currentCount + 1);
        }
        for (int i = 0; i < ransomNote.length(); ++i) {
            char r = ransomNote.charAt(i);

            int currentCount = letters.getOrDefault(r, 0);
            if (currentCount == 0) {
                return false;
            }
            letters.put(r, currentCount);
        }
        return true;
    }
}
