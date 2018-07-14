package Lesson5.PassingCars;

public class PassingCars {
    public int solution(int[] A) {
        int westCars = 0;
        int pairs = 0;

        int carIndex = A.length-1;
        while (carIndex >= 0) {
            if (A[carIndex] == 1) {
                westCars++;
            } else {
                pairs+=westCars;
                if (pairs > 1000000000) {
                    return -1;
                }
            }
            carIndex--;
        }
        return pairs;
    }
}
