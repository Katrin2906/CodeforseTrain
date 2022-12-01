package LeetCodeArrays;

public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;
        int begin = 0;
        int finish = arr.length - 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) break;
            begin++;
        }
        for (int j = arr.length - 1; j != 0; j--) {
            if (arr[j] >= arr[j - 1]) break;
            finish--;
        }
        if (begin == 0 || finish == arr.length - 1) return false;
        return begin == finish;

    }
}