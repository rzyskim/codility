package Lesson4.MissingInteger;

public class MissingInteger {
    public int solution(int[] A) {
        /* Using the Pigeonhole algorithm:
           For the input of N integers (no matter which),
           for the first N+1 integers one will be missing.
           Worst case scenario is numbers 1,2,3,...,N and N+1 missing */

        boolean[] pigeonHoles = new boolean[A.length + 1];

        for (int holeIndex
                : A) {
            if ((holeIndex >= 1) && (holeIndex <= A.length + 1)) {
                pigeonHoles[holeIndex-1] = true;
            }
        }
        for (int holeIndexed = 0; holeIndexed < pigeonHoles.length; holeIndexed++) {
            if (!pigeonHoles[holeIndexed]) {
                return holeIndexed+1;
            }
        }
        //Should never be here
        return -1;
    }
}
