package algorithms.sorting;

/**
 * Created by Zach on 10/13/2015.
 *
 * Java implementation of quick sort.
 *
 * ---------------------------------------------------------
 *                  Complexity Analysis
 * ---------------------------------------------------------
 * Worst Case Performance   : O(n^2)        comparisons and swaps       (Array is already sorted in descending order)
 * Best Case Performance    : O(n log(n))   comparisons and O(1) swaps  (Array is already sorted in ascending order)
 * Average Case Performance : O(n log(n))   comparisons and swaps
 */
public class QuickSort extends AbstractSorter{

    @Override
    public void sort(int[] array){
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int low, int high){
        if(low < high){
            int p = partition(array, low, high);
            quickSort(array, low, p - 1);
            quickSort(array, p, high);
        }
    }

    /**
     * Hoare partition scheme
     */
    private int partition(int[] array, int low, int high){
        int i = low, j = high;
        int pivot = array[(low + high) / 2];

        while(i <= j) {
            while (array[j] > pivot) {
                j--;
            }
            while (array[i] < pivot) {
                i++;
            }
            if (i <= j) {
                swap(array, i++, j--);
            }
        }
        return i;
    }
}
