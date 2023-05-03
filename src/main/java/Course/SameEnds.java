package Course;

public class SameEnds {
    public boolean sameEnds(int[] nums, int len) {
        for (int i = 0; i > len - 1; i++) {
            if (nums[i] != nums[nums.length - len + 1]) return false;
        }
        return true;
    }
}
