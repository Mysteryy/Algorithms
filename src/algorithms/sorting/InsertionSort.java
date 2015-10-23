package algorithms.sorting;

/**
 * Created by zach on 10/14/2015.
 * <p>
 * Java implementation of insertion sort.
 * <p>
 * ---------------------------------------------------------
 * Complexity Analysis
 * ---------------------------------------------------------
 * Worst Case Performance   : O(n^2)    comparisons and swaps       (Array is already sorted in descending order)
 * Best Case Performance    : O(n)      comparisons and O(1) swaps  (Array is already sorted in ascending order)
 * Average Case Performance : O(n^2)    comparisons and swaps
 */
public class InsertionSort extends AbstractSorter {

    @Override
    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int x = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > x) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = x;
        }
    }
}
