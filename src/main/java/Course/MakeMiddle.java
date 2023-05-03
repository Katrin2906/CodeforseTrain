package Course;

import java.util.Arrays;

public class MakeMiddle {
    public static void main(String[] args) {
        MakeMiddle makeMiddle = new MakeMiddle();
        int[] res = makeMiddle.makeMiddle(new int[]{1, 2, 3, 4, 5, 6});
        System.out.println(Arrays.toString(res));
    }

    public int[] makeMiddle(int[] nums) {
        int middleIndex = nums.length / 2 - 1;

        return new int[]{nums[middleIndex], nums[middleIndex + 1]};
    }
}
