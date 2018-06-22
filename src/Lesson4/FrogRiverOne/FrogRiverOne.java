package Lesson4.FrogRiverOne;


public class FrogRiverOne {
    public int solution(int X, int[] A) {
        boolean [] B = new boolean [X];
        int AllLeavesCounterX = 0;
        for (int i = 0; i < A.length; i++) {
            if ((A[i] <= B.length) && !B[A[i]-1]) {
                B[A[i]-1] = true;
                AllLeavesCounterX++;

                if (AllLeavesCounterX == X) {
                    return i;
                }
            }
        }
        return -1;
    }
}
