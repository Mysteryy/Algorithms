package algorithms.sorting;

/**
 * Created by zach on 10/14/2015.
 *
 * This class allows for static access to all of the sorting algorithms.
 */
public class Sorting {
    private static InsertionSort insertionSort = new InsertionSort();
    private static QuickSort quickSort = new QuickSort();

    public static void insertionSort(int[] array){
        insertionSort.sort(array);
    }

    public static void quickSort(int[] array){
        quickSort.sort(array);
    }
}
