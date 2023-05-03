package Course;

import java.util.Arrays;
import java.util.Comparator;

public class SortingPlanet {
    public static Integer[] sortTwisted37(Integer[] array) {
        Comparator<Integer> comparator = (o1, o2) -> {
            String s1 = String.valueOf(o1);
            String s2 = String.valueOf(o2);
            s1 = s1.replaceAll("7", "X");
            s1 = s1.replaceAll("3", "7");
            s1 = s1.replaceAll("X", "3");
            s2 = s2.replaceAll("7", "X");
            s2 = s2.replaceAll("3", "7");
            s2 = s2.replaceAll("X", "3");
            return Integer.valueOf(s1).compareTo(Integer.valueOf(s2));
        };
        Integer[] arr = Arrays.copyOf(array, array.length);
        Arrays.sort(arr, comparator);
        return arr;
    }
}
