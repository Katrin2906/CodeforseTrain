package Course;

import java.util.HashMap;
import java.util.Map;

public class FindTheOddInt {

    public static void main(String[] args) {
        int res = FindTheOddInt.findIt(new int[]{1, 2, 2, 2, 4, 4, 4, 1, 1, 6, 3, 3, 3, 3, 3, 1});
        System.out.println(res);
    }

    public static int findIt(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();//инициализируем для подсчета ключей мапу где будет значение и количество встречаемых раз
        for (int n : a) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (Integer key : map.keySet()) {//проходим по сету ключей для этой мапы
            if (map.get(key) % 2 != 0)
                return key;
        }
        return 0;
    }
}
