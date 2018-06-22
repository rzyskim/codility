package Lesson4.FrogRiverOne;

public class FrogRiverOneTester {
    public static void main(String[] args) {
        int X = 8;
        int [] A = new int [] {1,6,4,2,5,8,3,9,123,3,2,8,7,3,7,1,8}; //should return 12

        FrogRiverOne FrogRiverOneCorrectnessTest = new FrogRiverOne();

        System.out.println(FrogRiverOneCorrectnessTest.solution(X,A));
    }
}
