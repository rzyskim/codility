package Lesson4.MaxCounters;

import java.util.Arrays;

public class MaxCountersTester {
    public static void main(String[] args) {
        MaxCounters MaxCountersReturnTest = new MaxCounters();
        int parameterN = 5;
        int[] parameterA = new int[] {3,4,4,6,1,4,4};

        String result = Arrays.toString(MaxCountersReturnTest.solution(parameterN,parameterA));
        System.out.println(result);
    }
}
