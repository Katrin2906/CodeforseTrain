package LeetCodeArrays;

public class EvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int counter = 0;
        for (int i : nums) {
            int length = String.valueOf(i).length();
            if (length % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }
}
