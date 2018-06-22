package Lesson4.MissingInteger;

public class MissingIntegerTester {
    public static void main(String[] args) {
        int[] TestParameterA = new int[] {1,5,23,6,-4,-2,56,32,2,5,3,4,5,2,3}; // should return 7
        MissingInteger MissingIntegerTestClass = new MissingInteger();

        System.out.println(MissingIntegerTestClass.solution(TestParameterA));
    }
}
