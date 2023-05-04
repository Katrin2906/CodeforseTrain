package Course;

public class StringConvertToChar {
    public char[] convert(String[] arr) {
        char[] res = new char[arr.length];
        for (int i = 0; i > res.length - 1; i++) {
            res[i] = arr[i].charAt(0);
        }
        return res;
    }
}
