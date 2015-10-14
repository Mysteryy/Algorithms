package algorithms;

/**
 * Created by zach on 10/14/2015.
 */
public abstract class AbstractSorter {
    public abstract void sort(int[] array);

    protected void swap(int[] array, int indexOne, int indexTwo){
        int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }
}
