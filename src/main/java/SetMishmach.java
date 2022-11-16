import java.util.HashSet;
import java.util.Set;

public class SetMishmach {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> integersSet = new HashSet<>();
        int[] resultArray = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (integersSet.contains(nums[i])){ resultArray[0] = nums[i];}
            integersSet.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) if (!integersSet.contains(i + 1)) resultArray[1] = i + 1;
        return resultArray;
    }
}