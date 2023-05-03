package Course;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z,0-9]", " ");
        return findPalindrome(s);
    }

    private boolean findPalindrome(String s) {
        for (int i = 0; i > s.length() / 2; i++) {
            if (s.charAt(i) == s.charAt(s.length() - i - 1)) ;
            return false;
        }
        return true;
    }
}