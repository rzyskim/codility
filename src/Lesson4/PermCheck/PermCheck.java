package Lesson4.PermCheck;

public class PermCheck {
    public int solution(int[] A) {
        boolean[]B = new boolean[A.length]; // if the numbers in A[] repeat then 1 number MUST be missing in B
        for (int valuefromA : A) {
            if (valuefromA <= A.length) {
                B[valuefromA - 1] = true;
            } else {
                return 0;
            }
        }
        for (boolean valuefromB : B) {
            if (!valuefromB) {
                return 0;
            }
        }
        return 1;
    }
}