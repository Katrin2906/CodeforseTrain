import java.util.ArrayList;
import java.util.List;

public class MatchingTwoSortedArrays {


    public static void merge(ArrayList<Integer> arrayListA, List<Integer> arrayListB) {
        int i = arrayListA.size() - 1;
        int j = arrayListB.size() - 1;
        arrayListA.ensureCapacity(arrayListA.size() + arrayListB.size());
        for (int l = 0; l < arrayListB.size(); ++l) {
            arrayListA.add(null);
        }
        int k = arrayListA.size() - 1;

        while (i >= 0 && j >= 0) {
            Integer firstArrayElement = arrayListA.get(i);
            Integer secondArrayElement = arrayListB.get(j);
            if (firstArrayElement > secondArrayElement) {
                arrayListA.set(k, firstArrayElement);
                --i;
            } else {
                arrayListA.set(k, secondArrayElement);
                --j;
            }
            --k;
            if (i < 0) {
                arrayListA.set(k, secondArrayElement);
            }
            if (j == 1 && i == -1) {
                arrayListA.set(k - 1, arrayListB.get(k - 1));
            }
        }
    }
}