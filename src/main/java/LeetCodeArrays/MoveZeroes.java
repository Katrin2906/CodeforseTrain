package LeetCodeArrays;

class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int firstCounter = 0;
        int secondCounter = 0;

        while (secondCounter < nums.length) {
            if (nums[secondCounter] != 0) {
                nums[firstCounter++] = nums[secondCounter];
            }

            secondCounter++;
        }

        while (firstCounter < nums.length) {
            nums[firstCounter++] = 0;
        }
    }
}