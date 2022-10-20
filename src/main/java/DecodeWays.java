public class DecodeWays {
    public int numDecodings(String s) {
        int[] newWord = new int[s.length() + 1];

        newWord[0] = 1;
        newWord[1] = s.charAt(0) == '0' ? 0 : 1;

        for (int i = 2; i < newWord.length; i++) {
            int oneSymbol = Integer.parseInt(s.substring(i - 1, i));
            int twoSymbols = Integer.parseInt(s.substring(i - 2, i));

            if (oneSymbol >= 1 && oneSymbol <= 9)
                newWord[i] = newWord[i - 1];
            if (twoSymbols >= 10 && twoSymbols <= 26)
                newWord[i] += newWord[i - 2];
        }
        return newWord[newWord.length - 1];
    }
}
