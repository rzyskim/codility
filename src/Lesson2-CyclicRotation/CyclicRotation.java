import java.util.Arrays;

public class CyclicRotation {
    public int[] solution(int[] A, int K) {
//        int[] inputTable = A[];
        int[] outputTable = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            outputTable[(i+K) % A.length] = A[i];
        }
        System.out.println(Arrays.toString(outputTable));
        return outputTable;

    }
}
