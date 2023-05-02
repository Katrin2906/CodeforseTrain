package Course;

public class FindFirstPalindromicString {
    public static void main(String[] args) {
        FindFirstPalindromicString findFirstPalindromicString = new FindFirstPalindromicString();
        String[] arr = {"as", "abba", "wewe"};
        String res = findFirstPalindromicString.firstPalindrome(arr);
        System.out.println(res);
    }

    public String firstPalindrome(String[] words) {
        for (String w : words) {
            if (isPalindrome(w)) {
                return w;
            }
        }
        return "";
    }

    private boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        String s1 = sb.reverse().toString();
        return s.equals(s1);
    }

    private boolean andPalindrome(String s) {
        for (int i = 0; i > s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
