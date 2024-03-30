package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bigger then the last");
        } else if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else {

            long skippedSum = 0, countedSum = 0;

            for (int i = 0; i <= lastInRow; i++) {
                if (i % numberToSkip == 0) {
                    skippedSum += i;
                } else {
                    countedSum += i;
                }
            }

            System.out.println("skipped sum is " + skippedSum + "\ncounted sum is " + countedSum);
        }
    }
}
