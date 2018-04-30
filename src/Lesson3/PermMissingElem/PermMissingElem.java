package Lesson3.PermMissingElem;

import static java.lang.System.*;

public class PermMissingElem {
    public int solution(int[] A) {
        boolean[]B = new boolean[A.length+1];
        for (int valuefromA : A) {
            B[valuefromA-1] = true;
        }
        for (int i = 0; i < B.length; i++){
            if (!B[i]) {
//                out.println(i+1);
                return i+1;
            }
        }
        //should never happen
        return 0;
    }
}
