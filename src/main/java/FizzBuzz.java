import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<String>();
        HashMap<Integer, String> fizzBuzzDict = new HashMap<>() {
            {
                put(3, "Fizz");
                put(5, "Buzz");
            }
        };
        List<Integer> divisors = new ArrayList<>(Arrays.asList(3, 5));
        for (int num = 1; num <= n; num++) {

            String numAnsStr = "";

            for (Integer key : divisors) {
                if (num % key == 0) {
                    numAnsStr += fizzBuzzDict.get(key);
                }
            }

            if (numAnsStr.equals("")) {
                numAnsStr += Integer.toString(num);
            }
            ans.add(numAnsStr);
        }
        return ans;
    }
}
