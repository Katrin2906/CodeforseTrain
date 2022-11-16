import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LotteryNumber {
    public static boolean main(String[] args) {
        try {
            Scanner scn = new Scanner(System.in);
            int number = scn.nextInt();
            int numberLength = (int) (Math.log10(number) + 1);
            List<Integer> divisors = new ArrayList<>(Arrays.asList(2, 4, 6, 8));
            if (numberLength > 0 && divisors.contains(numberLength)) {
                String newNumber = Integer.toString(number);
                int[] newArray = new int[numberLength];
                for (int i = 0; i < numberLength; i++) {
                    newArray[i] = newNumber.charAt(i) - '0';
                    int sumfirst = 0;
                    int sumsecond = 0;
                    for (int l = 0; l < numberLength; l++) {
                        if (l < numberLength / 2) {
                            sumfirst += newArray[l];
                        } else {
                            sumsecond += newArray[l];
                        }

                        if (sumfirst == sumsecond) {
                            return true;
                        }
                    }
                }
            } else return false;
        } catch (Exception e) {
            System.out.println("Incorrect input");
        }
        return false;
    }
}
