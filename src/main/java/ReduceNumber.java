public class ReduceNumber {
    public int numberOfSteps(int num) {
        int counter = 0;
        while (num > 0) {

            if (num % 2 == 0) {
                num = num / 2;
                counter = counter + 1;
            }

            if (num % 2 != 0) {
                num = num - 1;
                counter = counter + 1;
            }

        }
        return counter;
    }
}

// impressive solution
//
// public int numberOfSteps (int num) {
//	return Integer.toBinaryString(num).length() - 1 + Integer.bitCount(num);
//}

//The first part, Integer.toBinaryString(num).length() - 1 obtains the number of characters in the binary representation of our number minus one. This is equal to the greatest value of x, satisfying 2^x <= num. This number represents the number of times num must be divided by two.
//
//The second part, Integer.bitCount(num), returns the "bit count" or "hamming weight" of num, which is the number of 1's in it's binary representation. This number represents the number of times we would encounter a subtract one operation before dividing in the iterative approach.