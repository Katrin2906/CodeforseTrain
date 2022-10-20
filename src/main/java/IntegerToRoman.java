import java.util.TreeMap;

public class IntegerToRoman {
    public String intToRoman(int num) {
        TreeMap<Integer, String> signsMap = new TreeMap<Integer, String>();
        signsMap.put(1, "I");
        signsMap.put(5, "V");
        signsMap.put(10, "X");
        signsMap.put(50, "L");
        signsMap.put(100, "C");
        signsMap.put(500, "D");
        signsMap.put(1000, "M");
        signsMap.put(4, "IV");
        signsMap.put(9, "IX");
        signsMap.put(40, "XL");
        signsMap.put(90, "XC");
        signsMap.put(400, "CD");
        signsMap.put(900, "CM");

        StringBuilder romanNumeral = new StringBuilder("");
        while (num > 0) {
            int closeNum = signsMap.floorKey(num);
            romanNumeral.append(signsMap.get(closeNum));
            num = num - closeNum;
        }

        return romanNumeral.toString();
    }
}
