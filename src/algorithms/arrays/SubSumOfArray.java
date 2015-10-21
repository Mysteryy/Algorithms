package algorithms.arrays;

import algorithms.sorting.Sorting;

/**
 * Created by zach on 10/20/2015.
 * <p>
 * Problem:
 * Given an array of ints, find the length of the shortest sub-sequence
 * that sums up to over a certain threshold.
 */
public class SubSumOfArray {

    /**
     * Finds the shortest sub sequence of values within an int array that can be
     * summed together to exceed the value of minimumSum.
     *
     * @param array      the array of ints to be searched
     * @param minimumSum the threshold value that should be exceeded
     * @return the minimum amount of values that can be summed together from this
     * int array to exceed the threshold sum. If no amount of values can be summed
     * together to exceed the threshold, -1 is returned.
     * @apiNote This approach first sorts the array using quick sort, and then
     * calculates the shortest sub sequence. A future implementation will
     * find the shortest sub-sequence without sorting the array.
     */
    public int findShortestSubSequence(int[] array, int minimumSum) {
        int shortest = -1;
        if (array != null) {
            // Sort the array, then the largest values will be at the end of the array
            Sorting.quickSort(array);
            // currentSum to track if we have exceeded the minimumSum or not
            int currentSum = 0;
            // Loop each element of the array backwards (highest values to lowest values)
            for (int index = (array.length - 1); index >= 0; index--) {
                // Add the current values to currentSum
                currentSum += array[index];
                // If we have summed enough values to exceed the minimumSum
                if (currentSum > minimumSum) {
                    // set shortest to this length
                    shortest = (array.length - index);
                    // stop iterating
                    break;
                }
            }
        }
        // return shortest
        return shortest;
    }
}
