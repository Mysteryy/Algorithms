package algorithms;

/**
 * Created by Zach on 10/13/2015.
 */
public class QuickSort {
    private int array[];

    public void sort(int[] array){
        this.array = array;
        quickSort(0, array.length - 1);
    }

    private void quickSort(int low, int high){
        if(low < high){
            int p = partition(low, high);
            if(p > 1)
                quickSort(low, p - 1);
            if(p + 1 < high)
            quickSort(p + 1, high);
        }
    }

    private int partition(int low, int high){
        int pivot = array[high];
        int i = low;
        for(int j = low; j < high; j++){
            if(array[j] <= pivot){
                swap(i, j);
                i++;
            }
        }
        swap(i, high);
        return i;
    }

    private void swap(int indexOne, int indexTwo){
        int temp = this.array[indexOne];
        this.array[indexOne] = this.array[indexTwo];
        this.array[indexTwo] = temp;
    }
}
