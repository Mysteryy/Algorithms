package algorithms;

/**
 * Created by Zach on 10/13/2015.
 */
public class QuickSort {

    public void sort(int[] array){
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int low, int high){
        if(low < high){
            int p = partition(array, low, high);
            quickSort(array, low, p - 1);
            quickSort(array, p + 1, high);
        }
    }

    private int partition(int[] array, int low, int high){
        int pivot = array[high];
        int i = low;
        for(int j = low; j < high; j++){
            if(array[j] <= pivot){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
            }
        }
        int temp = array[i];
        array[i] = array[high];
        array[high] = temp;
        return i;
    }
}
