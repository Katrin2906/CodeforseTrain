import java.util.Arrays;
import java.util.Collections;

public class RichestCustomeWealth {
    public int maximumWealth(int[][] accounts) {

        Integer[] arr = new Integer[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }
            arr[i] = sum;
        }
        return Collections.max(Arrays.asList(arr));
    }
}
