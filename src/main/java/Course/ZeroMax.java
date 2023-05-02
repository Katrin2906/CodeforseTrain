package Course;

import java.util.Arrays;

public class ZeroMax {
    public static void main(String[] args) {
        ZeroMax zeroMax = new ZeroMax();
        int[] res = zeroMax.zeroMax(new int[]{0, 5, 0, 3});
        System.out.println(Arrays.toString(res));
    }
    public int[] zeroMax(int[] nums) {
        int maxOdd = Integer.MIN_VALUE;
        boolean isOdd = false;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] % 2 == 0) {
                maxOdd = Math.max(maxOdd, nums[i]);
                isOdd = true;
            }
            if (nums[i] == 0 && isOdd) {
                nums[i] = maxOdd;
            }
        }
        return nums;
    }
}
