package algorithms.sorting;

/**
 * Created by zach on 10/14/2015.
 *
 * This class is extended by any class which implements the logic of a sorting algorithm.
 * This will provide some simple necessities to the class, such as swapping elements in an array.
 */
public abstract class AbstractSorter {

    public abstract void sort(int[] array);

    /**
     * Swaps two elements (at indexOne and indexTwo) in an array.
     *
     * @param array the array to swap elements in
     * @param indexOne the index of the first element to be swapped
     * @param indexTwo the index of the second element to be swapped
     */
    protected void swap(int[] array, int indexOne, int indexTwo){
        int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }
}
