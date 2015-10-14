package algorithms;

/**
 * Created by Zach on 10/13/2015.
 */
public class QuickSort {

    public void sort(int[] array){
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int low, int high){
        int index = partition(array, low, high);
        if(low < index - 1){
            quickSort(array, low, index - 1);
        }
        if(index < high){
            quickSort(array, index, high);
        }

    }

    private int partition(int[] array, int low, int high){
        int i = low, j = high, tmp;
        int pivot = array[(low + high) / 2];

        while(i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(array, i++, j--);
            }
        }
        return i;
    }

    private void swap(int[] array, int indexOne, int indexTwo){
        int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }
}
