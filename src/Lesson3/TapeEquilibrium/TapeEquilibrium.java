package Lesson3.TapeEquilibrium;

import static java.lang.Math.abs;

/**
 * Tape Equilibrium is supposed to find the P, where the least difference between A[0] + ... + A[P-1] and A[P] + ... + A[N] occurs
 * Solution needs to be O(N) in terms of time complexity
 * My idea was to iterate the array for every P and check whether the difference for array < P and >= P is smaller than for all previous iterations
 **/

public class TapeEquilibrium {
    public static void main(String[] args) {
        int[] A =new int[] {3,6,4,45,-34,-1,-6,7,-89,45,4};
        TapeEquilibrium TestCase = new TapeEquilibrium();
        System.out.println(TestCase.solution(A));
    }

    public int solution(int[] A) {
        int result = Integer.MAX_VALUE;

        // i need 2 variables counting the sum from the left and right side
        int sumleft = A[0];
        int sumright = 0;

        // I am going to iterate the for loop by P, but first I need to set the sumright to the sum of a whole array
        for (int i = 1; i < A.length; i++) {
            sumright += A[i];
        }

        // Now, let's iterate by P. For each iteration I will subtract the sumright by the objects "before" A[P]
        for(int P = 1; P < A.length; P++) {
            if (abs(sumleft - sumright) < result) {
                result = abs(sumleft - sumright);
            }
            sumleft += A[P];
            sumright -= A[P];
        }
//        System.out.println(result);
        return result;
    }
}
