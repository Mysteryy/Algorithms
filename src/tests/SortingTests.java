package tests;

import algorithms.QuickSort;
import utils.MathHelper;

import java.util.Arrays;

/**
 * Created by Zach on 10/13/2015.
 */
public class SortingTests {

    public static void main(String[] args){
        // Generate a sudo random array of arbitrary size
        int randomArray[] = MathHelper.getRandomArray(10000, 0, 1000);
        // Make a copy of the array to be used for quick sorting so that we can test all algorithms independently, on the same data set.
        int quickSortArray[] = Arrays.copyOf(randomArray, randomArray.length);
        // Make a copy of the array to be used for insertion sort so that we can test all algorithms independently, on the same data set.
        int insertionArray[] = Arrays.copyOf(randomArray, randomArray.length);

        // Make a new QuickSort object to apply the quick sort algorithm
        QuickSort quickSort = new QuickSort();

        System.out.println("Unsorted array");
        for(int i = 0; i < randomArray.length; i++){
            System.out.print(randomArray[i] + (i == randomArray.length - 1 ? "" : ", "));
        }

        long startTime = System.nanoTime();
        long startTimems = System.currentTimeMillis();
        quickSort.sort(quickSortArray);
        long endTime = System.nanoTime();
        long endTimems = System.currentTimeMillis();
        System.out.println("\n\nQuick sort (Took " + ((endTime - startTime) / 1000) + " microseconds) (" + Math.round(endTimems - startTimems) + " ms):");
        for(int i = 0; i < quickSortArray.length; i++){
            System.out.print(quickSortArray[i] + (i == quickSortArray.length - 1 ? "" : ", "));
        }



    }
}
