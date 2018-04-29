import java.util.Arrays;
import java.util.HashSet;

public class OddArrayPairs {
    // you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
    public int solution(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.println("start");

            for (int j = 0; j < A.length; j++) {
                if (A[i] == A[j] && i != j) {
                    A[i] = -1;
                    A[j] = -1;
                    j = A.length;
                }
            }
        }

        for (int i = 0; i < A.length; i++) {
            System.out.println("startasdas");
            if (A[i] != -1)
                System.out.println("dupa");
                return A[i];
        }
        System.out.println("pszpau");
        return 0; // should never happen
    }
}
