package tests;

import algorithms.InsertionSort;
import algorithms.QuickSort;
import utils.MathHelper;

import java.util.Arrays;

/**
 * Created by Zach on 10/13/2015.
 */
public class SortingTests {

    public static void main(String[] args){
        // The start and end time used for timing each sort
        long startTime, endTime;
        // Generate a sudo random array of arbitrary size
        int randomArray[] = MathHelper.getRandomArray(50000, 0, 1000);
        // Make a copy of the array to be used for quick sorting so that we can test all algorithms independently, on the same data set.
        int quickSortArray[] = Arrays.copyOf(randomArray, randomArray.length);
        // Make a copy of the array to be used for javas sorting algo so that we can test all algorithms independently, on the same data set.
        int javaSortArray[] = Arrays.copyOf(randomArray, randomArray.length);
        // Make a copy of the array to be used for insertion sort so that we can test all algorithms independently, on the same data set.
        int insertionArray[] = Arrays.copyOf(randomArray, randomArray.length);

        // Make a new QuickSort object to apply the quick sort algorithm
        QuickSort quickSort = new QuickSort();
        // Make a new InsertionSort object to apply the insertion sort algorthm
        InsertionSort insertionSort = new InsertionSort();

        // Print the initial unsorted array
        System.out.println("Unsorted array (" + randomArray.length + " elements)");
        for(int i = 0; i < randomArray.length; i++){
            System.out.print(randomArray[i] + (i == randomArray.length - 1 ? "" : ", "));
        }

        startTime = System.nanoTime();
        Arrays.sort(javaSortArray);
        endTime = System.nanoTime();
        System.out.println("\n\nJava Arrays.sort on sudo-random array (Took " + (endTime - startTime) / 1000000.0 + " ms):");
        for(int i = 0; i < javaSortArray.length; i++){
            System.out.print(javaSortArray[i] + (i == javaSortArray.length - 1 ? "" : ", "));
        }

        startTime = System.nanoTime();
        Arrays.sort(javaSortArray);
        endTime = System.nanoTime();
        System.out.println("\n\nJava Arrays.sort on an already sorted array (Took " + (endTime - startTime) / 1000000.0 + " ms):");
        for(int i = 0; i < javaSortArray.length; i++){
            System.out.print(javaSortArray[i] + (i == javaSortArray.length - 1 ? "" : ", "));
        }

        startTime = System.nanoTime();
        quickSort.sort(quickSortArray);
        endTime = System.nanoTime();
        System.out.println("\n\nQuick sort on sudo-random array (Took " + (endTime - startTime) / 1000000.0  + " ms):");
        for(int i = 0; i < quickSortArray.length; i++){
            System.out.print(quickSortArray[i] + (i == quickSortArray.length - 1 ? "" : ", "));
        }

        startTime = System.nanoTime();
        quickSort.sort(quickSortArray);
        endTime = System.nanoTime();
        System.out.println("\n\nQuick sort on an already sorted array (Took " + (endTime - startTime) / 1000000.0  + " ms):");
        for(int i = 0; i < quickSortArray.length; i++){
            System.out.print(quickSortArray[i] + (i == quickSortArray.length - 1 ? "" : ", "));
        }

        startTime = System.nanoTime();
        insertionSort.sort(insertionArray);
        endTime = System.nanoTime();
        System.out.println("\n\nInsertion sort on sudo-random array (Took " + (endTime - startTime) / 1000000.0  + " ms):");
        for(int i = 0; i < insertionArray.length; i++){
            System.out.print(insertionArray[i] + (i == insertionArray.length - 1 ? "" : ", "));
        }

        startTime = System.nanoTime();
        insertionSort.sort(insertionArray);
        endTime = System.nanoTime();
        System.out.println("\n\nInsertion sort on an already sorted array (Took " + (endTime - startTime) / 1000000.0  + " ms):");
        for(int i = 0; i < insertionArray.length; i++){
            System.out.print(insertionArray[i] + (i == insertionArray.length - 1 ? "" : ", "));
        }

    }
}
