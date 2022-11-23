package LeetCodeArrays;

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0, right = result.length - 1;
        int pos = right;
        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[pos] = nums[left] * nums[left];
                left += 1;
            } else {
                result[pos] = nums[right] * nums[right];
                right -= 1;
            }
            pos -= 1;
        }
        return result;
    }
}
//Сначала инициализировал пустой массив того же размера, что и nums.
// Установите два указателя, левый и правый, на минимальный и максимальный индекс соответственно.
//Найдите большее значение абс по указателям слева и справа.
//Добавьте квадрат большего элемента из последней позиции в массиве результатов, затем соответственно переместите указатель влево/вправо.