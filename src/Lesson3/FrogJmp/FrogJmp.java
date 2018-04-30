package Lesson3.FrogJmp;
// solution required O(1) complexity - no loops
public class FrogJmp {
    public int solution(int X, int Y, int D) {
        if ((Y - X) % D == 0) {
//            System.out.println((Y - X) / D);
            return (Y - X) / D;
        } else {
//            System.out.println(((Y - X) / D) + 1);
            return ((Y - X) / D) + 1;
        }
    }
}