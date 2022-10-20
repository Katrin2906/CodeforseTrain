public class Triplets {
    public boolean increasingTriplet(int[] nums) {
        int numFirst = Integer.MAX_VALUE;
        int numSecond = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i <= numFirst) {numFirst = i;}
            else if (i <= numSecond){ numSecond = i;}
            else return true;
        }
        return false;
    }
}
