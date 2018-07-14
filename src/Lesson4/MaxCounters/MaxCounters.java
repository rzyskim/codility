package Lesson4.MaxCounters;

public class MaxCounters {
    private int maxCounter = 0;

    public int[] solution(int N, int[] A) {
        int currentMax = 0;
        int[] countersArray = new int[N];

        for (int command :
                A) {
            if (command == N+1) {
                // passively save maxCounter - it will be then used while increasing and in the end of program
                this.setMaxCounter(currentMax);

            } else {
                // Apply maxCounter if necessary
                if (countersArray[command - 1] < this.getMaxCounter()) {
                    countersArray[command - 1] = this.getMaxCounter();
                }
                // Increasing the specified counter in countersTable
                this.increase(command, countersArray);
                // currentMax has to be stored now
                if (countersArray[command - 1] > currentMax) {
                    currentMax = countersArray[command -1];
                }
            }
        }
        // Setting max value for the counters unused since last "max" command
        for (int i = 0; i < countersArray.length; i++) {
            if (countersArray[i] < this.getMaxCounter()) {
                countersArray[i] = this.getMaxCounter();
            }
        }

        return countersArray;


    }

    private void increase(int X, int[] A) {
        // Incrementing the counter X (X-1 in the array)
        A[X-1]++;
    }

    private void setMaxCounter(int currentMax) {
        maxCounter = currentMax;
    }

    private int getMaxCounter() {
        return maxCounter;
    }
}
