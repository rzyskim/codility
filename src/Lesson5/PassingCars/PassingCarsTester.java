package Lesson5.PassingCars;

public class PassingCarsTester {
    public static void main(String[] args) {
        int[] passingCarsInputArray = new int[] {0,1,0,1,1};
        PassingCars passingCarsTestMethod = new PassingCars();

        System.out.println(passingCarsTestMethod.solution(passingCarsInputArray));
    }
}
