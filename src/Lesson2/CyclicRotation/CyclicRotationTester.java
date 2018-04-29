package Lesson2.CyclicRotation;

public class CyclicRotationTester {
    public static void main(String[] args) {
        int[] input_table = new int[] {5,2,3,6,4,3,2,6,23,5};
        int rotation = 3;

        CyclicRotation TestRotation = new CyclicRotation();
        TestRotation.solution(input_table,rotation);
    }
}
