package Lesson4.FrogRiverOne;
package Lesson4;

public class FrogRiverOneTester {
    public void CheckTheCorrectnessForGivenTestCase() {
        int X = 8;
        int [] A = new int [] {1,6,4,2,5,8,3,9,123,3,2,8,7,3,7,1,8}; //should return 12
        System.out.println(this.solution(X,A));
    }

    public static void main(String[] args) {
        FrogRiverOne FrogRiverOneCorrectnessTest = new FrogRiverOne();
        FrogRiverOneCorrectnessTest.CheckTheCorrectnessForGivenTestCase();
    }
}
