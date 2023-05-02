package Course;

public class FindTheOddInt {
    public static int findIt(int[] a){
        int counter=0;
        for (int i = 0; i< a.length-1; i++){
            if(a[i]==a[i+1]){
                counter=counter+1;
            }

        }
        return counter;
    }
}
