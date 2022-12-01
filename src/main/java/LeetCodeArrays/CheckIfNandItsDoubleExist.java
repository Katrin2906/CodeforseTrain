package LeetCodeArrays;

import java.util.HashSet;

public class CheckIfNandItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int a : arr) {
            if (set.contains(a * 2) || (a % 2 == 0 && set.contains(a / 2))) return true;
            set.add(a);
        }
        return false;
    }
}
//HashSet обеспечивает поиск O (1), поэтому он идеально подходит для этого вопроса.
// Для каждого числа в массиве мы проверяем, видели ли мы уже его половинку или двойку.
//ПРИМЕЧАНИЕ. При проверке половины нам нужно убедиться, что текущее число четное,
// иначе мы получим неправильный ответ, как в случае 3 и 7 на входе. Здесь для 7 7/2 дало бы 3 (а не 3,5), которые присутствуют в HashSet,
// но не то, что нам нужно.