package Course;

public class BigDiff {
    public int bigDiff(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i : arr) {
            min = Math.min(i, min);
            max = Math.max(i, max);
        }
        return max - min;
    }
}
