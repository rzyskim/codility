public class OddArrayPairs {
    // you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
    public int solution(int[] A) {
        int iwillperformXORhere = 0;
        for (int occurrence :
                A) {
            iwillperformXORhere^=occurrence;
        }
        return iwillperformXORhere;
    }
}
